/*
 * Copyright (c) 2019, Lucas <https://github.com/lucwousin>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.alchemicalhydra;

import com.google.inject.Provides;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.Getter;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import com.openosrs.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.alchemicalhydra.entity.Hydra;
import net.runelite.client.plugins.alchemicalhydra.entity.Hydra.AttackStyle;
import net.runelite.client.plugins.alchemicalhydra.entity.HydraPhase;
import net.runelite.client.plugins.alchemicalhydra.overlay.AttackOverlay;
import net.runelite.client.plugins.alchemicalhydra.overlay.PrayerOverlay;
import net.runelite.client.plugins.alchemicalhydra.overlay.SceneOverlay;
import net.runelite.client.ui.overlay.OverlayManager;
import org.pf4j.Extension;

@Singleton
@Extension
@PluginDescriptor(
	name = "Alchemical Hydra",
	enabledByDefault = false,
	description = "A plugin for the Alchemical Hydra boss.",
	tags = {"openosrs", "alchemical", "hydra"}
)
public class AlchemicalHydraPlugin extends Plugin
{
	private static final String MESSAGE_NEUTRALIZE = "The chemicals neutralise the Alchemical Hydra's defences!";
	private static final String MESSAGE_STUN = "The Alchemical Hydra temporarily stuns you.";

	private static final int[] HYDRA_REGIONS = {5279, 5280, 5535, 5536};

	@Inject
	private Client client;

	@Inject
	private EventBus eventBus;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private AttackOverlay attackOverlay;

	@Inject
	private SceneOverlay sceneOverlay;

	@Inject
	private PrayerOverlay prayerOverlay;

	private boolean atHydra;

	@Getter
	private Hydra hydra;

	@Getter
	private final Map<LocalPoint, Projectile> poisonProjectiles = new HashMap<>();

	private int lastAttackTick = -1;

	@Provides
	AlchemicalHydraConfig provideConfig(final ConfigManager configManager)
	{
		return configManager.getConfig(AlchemicalHydraConfig.class);
	}

	@Override
	protected void startUp()
	{
		if (client.getGameState() == GameState.LOGGED_IN && isInHydraRegion())
		{
			init();
		}
	}

	private void init()
	{
		atHydra = true;

		addOverlays();

		for (final NPC npc : client.getNpcs())
		{
			onNpcSpawned(new NpcSpawned(npc));
		}
	}

	@Override
	protected void shutDown()
	{
		atHydra = false;

		eventBus.unregister(this);

		removeOverlays();

		hydra = null;
		poisonProjectiles.clear();
		lastAttackTick = -1;
	}


	@Subscribe
	@SuppressWarnings("unused")
	private void onConfigChanged(final ConfigChanged event)
	{
	}

	@Subscribe
	@SuppressWarnings("unused")
	private void onGameStateChanged(final GameStateChanged event)
	{
		final GameState gameState = event.getGameState();

		switch (gameState)
		{
			case LOGGED_IN:
				if (isInHydraRegion())
				{
					if (!atHydra)
					{
						init();
					}
				}
				else
				{
					if (atHydra)
					{
						shutDown();
					}
				}
				break;
			case HOPPING:
			case LOGIN_SCREEN:
				if (atHydra)
				{
					shutDown();
				}
			default:
				break;
		}
	}

	@Subscribe
	@SuppressWarnings("unused")
	private void onGameTick(final GameTick event)
	{
		attackOverlay.decrementStunTicks();
	}

	private void onNpcSpawned(final NpcSpawned event)
	{
		final NPC npc = event.getNpc();

		if (npc.getId() == NpcID.ALCHEMICAL_HYDRA)
		{
			hydra = new Hydra(npc);
		}
	}

	@Subscribe
	@SuppressWarnings("unused")
	private void onAnimationChanged(final AnimationChanged event)
	{
		final Actor actor = event.getActor();

		if (hydra == null || actor != hydra.getNpc())
		{
			return;
		}

		final HydraPhase phase = hydra.getPhase();

		final int animationId = actor.getAnimation();

		if ((animationId == phase.getDeathAnimation2() && phase != HydraPhase.FLAME)
			|| (animationId == phase.getDeathAnimation1() && phase == HydraPhase.FLAME))
		{
			switch (phase)
			{
				case POISON:
					hydra.changePhase(HydraPhase.LIGHTNING);
					break;
				case LIGHTNING:
					hydra.changePhase(HydraPhase.FLAME);
					break;
				case FLAME:
					hydra.changePhase(HydraPhase.ENRAGED);
					break;
				case ENRAGED:
					// NpcDespawned event does not fire for Hydra inbetween kills; must use death animation.
					hydra = null;

					if (!poisonProjectiles.isEmpty())
					{
						poisonProjectiles.clear();
					}
					break;
			}

			return;
		}
		else if (animationId == phase.getSpecialAnimationId() && phase.getSpecialAnimationId() != 0)
		{
			hydra.setNextSpecial();
		}

		if (!poisonProjectiles.isEmpty())
		{
			poisonProjectiles.values().removeIf(p -> p.getEndCycle() < client.getGameCycle());
		}
	}

	@Subscribe
	@SuppressWarnings("unused")
	private void onProjectileMoved(final ProjectileMoved event)
	{
		final Projectile projectile = event.getProjectile();

		if (hydra == null || client.getGameCycle() >= projectile.getStartMovementCycle())
		{
			return;
		}

		final int projectileId = projectile.getId();

		if (hydra.getPhase().getSpecialProjectileId() == projectileId)
		{
			if (hydra.getAttackCount() >= hydra.getNextSpecial())
			{
				hydra.setNextSpecial();
			}

			poisonProjectiles.put(event.getPosition(), projectile);
		}
		else if (client.getTickCount() != lastAttackTick
			&& (projectileId == AttackStyle.MAGIC.getProjectileID() || projectileId == AttackStyle.RANGED.getProjectileID()))
		{
			hydra.handleProjectile(projectileId);

			lastAttackTick = client.getTickCount();
		}
	}

	@Subscribe
	@SuppressWarnings("unused")
	private void onChatMessage(final ChatMessage event)
	{
		final ChatMessageType chatMessageType = event.getType();

		if (chatMessageType != ChatMessageType.SPAM && chatMessageType != ChatMessageType.GAMEMESSAGE)
		{
			return;
		}

		final String message = event.getMessage();

		if (message.equals(MESSAGE_NEUTRALIZE))
		{
			hydra.setImmunity(false);
		}
		else if (message.equals(MESSAGE_STUN))
		{
			attackOverlay.setStunTicks();
		}
	}

	private void addOverlays()
	{
		overlayManager.add(sceneOverlay);
		overlayManager.add(attackOverlay);
		overlayManager.add(prayerOverlay);
	}

	private void removeOverlays()
	{
		overlayManager.remove(sceneOverlay);
		overlayManager.remove(attackOverlay);
		overlayManager.remove(prayerOverlay);
	}

	private boolean isInHydraRegion()
	{
		return client.isInInstancedRegion() && Arrays.equals(client.getMapRegions(), HYDRA_REGIONS);
	}
}
