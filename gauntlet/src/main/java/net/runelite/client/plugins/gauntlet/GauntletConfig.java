/*
 * Copyright (c) 2020, dutta64 <https://github.com/dutta64>
 * Copyright (c) 2019, kThisIsCvpv <https://github.com/kThisIsCvpv>
 * Copyright (c) 2019, ganom <https://github.com/Ganom>
 * Copyright (c) 2019, kyle <https://github.com/Kyleeld>
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

package net.runelite.client.plugins.gauntlet;

import java.awt.Color;
import java.awt.Font;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.runelite.client.config.Units;

@ConfigGroup("gauntlet")
public interface GauntletConfig extends Config
{
	// Sections

	@ConfigSection(
		name = "Resources",
		description = "Resources section.",
		position = 0
	)
	String resources = "Resources";

	@ConfigSection(
		name = "Utilities",
		description = "Utilities section.",
		position = 20
	)
	String util = "Utilities";

	@ConfigSection(
		name = "Npcs",
		description = "Other npcs section.",
		position = 24
	)
	String npcs = "NPCs";

	@ConfigSection(
		name = "Hunllef",
		description = "Hunllef section.",
		position = 33
	)
	String hunllef = "Hunllef";

	@ConfigSection(
		name = "Projectiles",
		description = "Projectiles section.",
		position = 46
	)
	String projectiles = "Projectiles";

	@ConfigSection(
		name = "Tornadoes",
		description = "Tornadoes section.",
		position = 50
	)
	String tornadoes = "Tornadoes";

	@ConfigSection(
		name = "Player",
		description = "Player section.",
		position = 60
	)
	String player = "Player";

	@ConfigSection(
		name = "Timer",
		description = "Timer section.",
		position = 68
	)
	String timer = "Timer";

	@ConfigSection(
		name = "Misc",
		description = "Other section.",
		position = 71
	)
	String misc = "Misc";

	// Resources Section

	@ConfigItem(
		name = "Overlay resource icon and tile",
		description = "Overlay resources with a respective icon and tile outline.",
		position = 1,
		keyName = "resourceOverlay",
		section = resources
	)
	default boolean resourceOverlay()
	{
		return false;
	}

	@Range(
		min = 12,
		max = 64
	)
	@ConfigItem(
		name = "Icon size",
		description = "Change the size of the resource icons.",
		position = 2,
		keyName = "resourceIconSize",
		section = resources
	)
	@Units(Units.POINTS)
	default int resourceIconSize()
	{
		return 18;
	}

	@Range(
		min = 1,
		max = 8
	)
	@ConfigItem(
		name = "Tile outline width",
		description = "Change the width of the resource tile outline.",
		position = 3,
		keyName = "resourceTileOutlineWidth",
		section = resources
	)
	@Units(Units.POINTS)
	default int resourceTileOutlineWidth()
	{
		return 1;
	}

	@Alpha
	@ConfigItem(
		name = "Tile outline color",
		description = "Change the tile outline color of resources.",
		position = 4,
		keyName = "resourceTileOutlineColor",
		section = resources
	)
	default Color resourceTileOutlineColor()
	{
		return Color.YELLOW;
	}

	@Alpha
	@ConfigItem(
		name = "Tile fill color",
		description = "Change the tile fill color of resources.",
		position = 5,
		keyName = "resourceTileFillColor",
		section = resources
	)
	default Color resourceTileFillColor()
	{
		return new Color(255, 255, 255, 50);
	}

	@ConfigItem(
		name = "Outline resources",
		description = "Outline resources with a colored outline.",
		position = 6,
		keyName = "resourceOutline"
	)
	default boolean resourceOutline()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 8
	)
	@ConfigItem(
		name = "Outline width",
		description = "Change the width of the resource outline.",
		position = 7,
		keyName = "resourceOutlineWidth",
		section = resources
	)
	@Units(Units.POINTS)
	default int resourceOutlineWidth()
	{
		return 1;
	}

	@Alpha
	@ConfigItem(
		name = "Outline color",
		description = "Change the outline color of resources.",
		position = 8,
		keyName = "resourceOutlineColor",
		section = resources
	)
	default Color resourceOutlineColor()
	{
		return Color.YELLOW;
	}

	@ConfigItem(
		name = "Track resources",
		description = "Track resources in counter infoboxes.",
		position = 9,
		keyName = "resourceTracker",
		section = resources
	)
	default ResourceFilter resourceTracker()
	{
		return ResourceFilter.OFF;
	}

	@ConfigItem(
		name = "Ore",
		description = "The desired number of ores to acquire.",
		position = 10,
		keyName = "resourceOre",
		section = resources
	)
	default int resourceOre()
	{
		return 3;
	}

	@ConfigItem(
		name = "Phren bark",
		description = "The desired number of phren barks to acquire.",
		position = 11,
		keyName = "resourceBark",
		section = resources
	)
	default int resourceBark()
	{
		return 3;
	}

	@ConfigItem(
		name = "Linum tirinum",
		description = "The desired number of linum tirinums to acquire.",
		position = 12,
		keyName = "resourceTirinum",
		section = resources
	)
	default int resourceTirinum()
	{
		return 3;
	}

	@ConfigItem(
		name = "Grym leaf",
		description = "The desired number of grym leaves to acquire.",
		position = 13,
		keyName = "resourceGrym",
		section = resources
	)
	default int resourceGrym()
	{
		return 2;
	}

	@ConfigItem(
		name = "Weapon frames",
		description = "The desired number of weapon frames to acquire.",
		position = 14,
		keyName = "resourceFrame",
		section = resources
	)
	default int resourceFrame()
	{
		return 2;
	}

	@ConfigItem(
		name = "Paddlefish",
		description = "The desired number of paddlefish to acquire.",
		position = 15,
		keyName = "resourcePaddlefish",
		section = resources
	)
	default int resourcePaddlefish()
	{
		return 20;
	}

	@ConfigItem(
		name = "Crystal shards",
		description = "The desired number of crystal shards to acquire.",
		position = 16,
		keyName = "resourceShard",
		section = resources
	)
	default int resourceShard()
	{
		return 320;
	}

	@ConfigItem(
		name = "Bowstring",
		description = "Whether or not to acquire the crystalline or corrupted bowstring.",
		position = 17,
		keyName = "resourceBowstring",
		section = resources
	)
	default boolean resourceBowstring()
	{
		return false;
	}

	@ConfigItem(
		name = "Spike",
		description = "Whether or not to acquire the crystal or corrupted spike.",
		position = 18,
		keyName = "resourceSpike",
		section = resources
	)
	default boolean resourceSpike()
	{
		return false;
	}

	@ConfigItem(
		name = "Orb",
		description = "Whether or not to acquire the crystal or corrupted orb.",
		position = 19,
		keyName = "resourceOrb",
		section = resources
	)
	default boolean resourceOrb()
	{
		return false;
	}

	// Utilities Section

	@ConfigItem(
		name = "Outline starting room utilities",
		description = "Outline various utilities in the starting room.",
		position = 21,
		keyName = "utilitiesOutline",
		section = util
	)
	default boolean utilitiesOutline()
	{
		return false;
	}

	@Range(
		min = 2,
		max = 12
	)
	@ConfigItem(
		name = "Outline width",
		description = "Change the width of the utilities outline.",
		position = 22,
		keyName = "utilitiesOutlineWidth",
		section = util
	)
	@Units(Units.POINTS)
	default int utilitiesOutlineWidth()
	{
		return 4;
	}

	@Alpha
	@ConfigItem(
		name = "Outline color",
		description = "Change the color of the utilities outline.",
		position = 23,
		keyName = "utilitiesOutlineColor",
		section = util
	)
	default Color utilitiesOutlineColor()
	{
		return Color.MAGENTA;
	}

	// Other Npcs Section

	@ConfigItem(
		name = "Outline demi-bosses",
		description = "Overlay demi-bosses with a colored outline.",
		position = 25,
		keyName = "demibossOutline",
		section = npcs
	)
	default boolean demibossOutline()
	{
		return false;
	}

	@Range(
		min = 2,
		max = 12
	)
	@ConfigItem(
		name = "Outline width",
		description = "Change the width of the demi-boss outline.",
		position = 26,
		keyName = "demibossOutlineWidth",
		section = npcs
	)
	@Units(Units.POINTS)
	default int demibossOutlineWidth()
	{
		return 4;
	}

	@ConfigItem(
		name = "Outline strong npcs",
		description = "Overlay strong npcs with a colored outline.",
		position = 27,
		keyName = "strongNpcOutline",
		section = npcs
	)
	default boolean strongNpcOutline()
	{
		return false;
	}

	@Range(
		min = 2,
		max = 12
	)
	@ConfigItem(
		name = "Outline width",
		description = "Change the width of the strong npcs outline.",
		position = 28,
		keyName = "strongNpcOutlineWidth",
		section = npcs
	)
	@Units(Units.POINTS)
	default int strongNpcOutlineWidth()
	{
		return 2;
	}

	@Alpha
	@ConfigItem(
		name = "Outline color",
		description = "Change the outline color of strong npcs.",
		position = 29,
		keyName = "strongNpcOutlineColor",
		section = npcs
	)
	default Color strongNpcOutlineColor()
	{
		return Color.CYAN;
	}

	@ConfigItem(
		name = "Outline weak npcs",
		description = "Overlay weak npcs with a colored outline.",
		position = 30,
		keyName = "weakNpcOutline",
		section = npcs
	)
	default boolean weakNpcOutline()
	{
		return false;
	}

	@Range(
		min = 2,
		max = 12
	)
	@ConfigItem(
		name = "Outline width",
		description = "Change the width of the weak npcs outline.",
		position = 31,
		keyName = "weakNpcOutlineWidth",
		section = npcs
	)
	@Units(Units.POINTS)
	default int weakNpcOutlineWidth()
	{
		return 2;
	}

	@Alpha
	@ConfigItem(
		name = "Outline color",
		description = "Change the outline color of weak npcs.",
		position = 32,
		keyName = "weakNpcOutlineColor",
		section = npcs
	)
	default Color weakNpcOutlineColor()
	{
		return Color.CYAN;
	}

	// Hunllef Section

	@ConfigItem(
		name = "Display counter on Hunllef",
		description = "Overlay the Hunllef with an attack and prayer counter.",
		position = 34,
		keyName = "hunllefOverlayAttackCounter",
		section = hunllef
	)
	default boolean hunllefOverlayAttackCounter()
	{
		return false;
	}

	@ConfigItem(
		name = "Counter font style",
		description = "Change the font style of the attack and prayer counter.",
		position = 35,
		keyName = "hunllefAttackCounterFontStyle",
		section = hunllef
	)
	default FontStyle hunllefAttackCounterFontStyle()
	{
		return FontStyle.BOLD;
	}

	@Range(
		min = 12,
		max = 64
	)
	@ConfigItem(
		name = "Counter font size",
		description = "Adjust the font size of the attack and prayer counter.",
		position = 36,
		keyName = "hunllefAttackCounterFontSize",
		section = hunllef
	)
	@Units(Units.POINTS)
	default int hunllefAttackCounterFontSize()
	{
		return 22;
	}

	@ConfigItem(
		name = "Outline Hunllef on wrong prayer",
		description = "Outline the Hunllef when incorrectly praying against its current attack style.",
		position = 37,
		keyName = "hunllefOverlayWrongPrayerOutline",
		section = hunllef
	)
	default boolean hunllefOverlayWrongPrayerOutline()
	{
		return false;
	}

	@Range(
		min = 2,
		max = 12
	)
	@ConfigItem(
		name = "Outline width",
		description = "Change the width of the wrong prayer outline.",
		position = 38,
		keyName = "hunllefWrongPrayerOutlineWidth",
		section = hunllef
	)
	@Units(Units.POINTS)
	default int hunllefWrongPrayerOutlineWidth()
	{
		return 4;
	}

	@ConfigItem(
		name = "Outline Hunllef tile",
		description = "Outline the Hunllef's tile.",
		position = 39,
		keyName = "hunllefOutlineTile",
		section = hunllef
	)
	default boolean hunllefOutlineTile()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 8
	)
	@ConfigItem(
		name = "Tile outline width",
		description = "Change the width of the Hunllef's tile outline.",
		position = 40,
		keyName = "hunllefTileOutlineWidth",
		section = hunllef
	)
	@Units(Units.POINTS)
	default int hunllefTileOutlineWidth()
	{
		return 1;
	}

	@Alpha
	@ConfigItem(
		name = "Tile outline color",
		description = "Change the outline color of the Hunllef's tile.",
		position = 41,
		keyName = "hunllefOutlineColor",
		section = hunllef
	)
	default Color hunllefOutlineColor()
	{
		return Color.WHITE;
	}

	@Alpha
	@ConfigItem(
		name = "Tile fill color",
		description = "Change the fill color of the Hunllef's tile.",
		position = 42,
		keyName = "hunllefFillColor",
		section = hunllef
	)
	default Color hunllefFillColor()
	{
		return new Color(255, 255, 255, 0);
	}

	@ConfigItem(
		name = "Overlay style icon on Hunllef",
		description = "Overlay a current attack style icon on the Hunllef.",
		position = 43,
		keyName = "hunllefOverlayAttackStyleIcon",
		section = hunllef
	)
	default boolean hunllefOverlayAttackStyleIcon()
	{
		return false;
	}

	@Range(
		min = 12,
		max = 64
	)
	@ConfigItem(
		name = "Icon size",
		description = "Change the size of the attack style icon.",
		position = 44,
		keyName = "hunllefAttackStyleIconSize",
		section = hunllef
	)
	@Units(Units.POINTS)
	default int hunllefAttackStyleIconSize()
	{
		return 18;
	}

	@ConfigItem(
		name = "Play audio on prayer attack",
		description = "Play an in-game sound when the Hunllef is about to use its prayer attack.",
		position = 45,
		keyName = "hunllefPrayerAudio",
		section = hunllef
	)
	default boolean hunllefPrayerAudio()
	{
		return false;
	}

	// Projectiles Section

	@ConfigItem(
		name = "Outline projectiles",
		description = "Outline projectiles with a blue (magic) or green (range) color.",
		position = 47,
		keyName = "outlineProjectile",
		section = projectiles
	)
	default boolean outlineProjectile()
	{
		return false;
	}

	@ConfigItem(
		name = "Overlay projectile icons",
		description = "Overlay projectiles with their respective icon.",
		position = 48,
		keyName = "overlayProjectileIcon",
		section = projectiles
	)
	default boolean overlayProjectileIcon()
	{
		return false;
	}

	@Range(
		min = 12,
		max = 64
	)
	@ConfigItem(
		name = "Icon size",
		description = "Change the size of the projectile icons.",
		position = 49,
		keyName = "projectileIconSize",
		section = projectiles
	)
	@Units(Units.POINTS)
	default int projectileIconSize()
	{
		return 18;
	}

	// Tornadoes Section

	@ConfigItem(
		name = "Overlay tornado tick counter",
		description = "Overlay tornadoes with a tick counter.",
		position = 51,
		keyName = "tornadoTickCounter",
		section = tornadoes
	)
	default boolean tornadoTickCounter()
	{
		return false;
	}

	@ConfigItem(
		name = "Font style",
		description = "Bold/Italics/Plain",
		position = 52,
		keyName = "tornadoFontStyle",
		section = tornadoes
	)
	default FontStyle tornadoFontStyle()
	{
		return FontStyle.BOLD;
	}

	@ConfigItem(
		name = "Font shadow",
		description = "Toggle font shadow of the tornado tick counter.",
		position = 53,
		keyName = "tornadoFontShadow",
		section = tornadoes
	)
	default boolean tornadoFontShadow()
	{
		return true;
	}

	@Range(
		min = 12,
		max = 64
	)
	@ConfigItem(
		name = "Font size",
		description = "Adjust the font size of the tornado tick counter.",
		position = 54,
		keyName = "tornadoFontSize",
		section = tornadoes
	)
	@Units(Units.POINTS)
	default int tornadoFontSize()
	{
		return 16;
	}

	@Alpha
	@ConfigItem(
		name = "Font color",
		description = "Color of the tornado tick counter font.",
		position = 55,
		keyName = "tornadoFontColor",
		section = tornadoes
	)
	default Color tornadoFontColor()
	{
		return Color.WHITE;
	}

	@ConfigItem(
		name = "Outline tornado tile",
		description = "Outline the tiles of tornadoes.",
		position = 56,
		keyName = "tornadoTileOutline",
		section = tornadoes
	)
	default boolean tornadoTileOutline()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 8
	)
	@ConfigItem(
		name = "Tile outline width",
		description = "Change tile outline width of tornadoes.",
		position = 57,
		keyName = "tornadoTileOutlineWidth",
		section = tornadoes
	)
	@Units(Units.POINTS)
	default int tornadoTileOutlineWidth()
	{
		return 1;
	}

	@Alpha
	@ConfigItem(
		name = "Tile outline color",
		description = "Color to outline the tile of a tornado.",
		position = 58,
		keyName = "tornadoOutlineColor",
		section = tornadoes
	)
	default Color tornadoOutlineColor()
	{
		return Color.YELLOW;
	}

	@Alpha
	@ConfigItem(
		name = "Tile fill color",
		description = "Color to fill the tile of a tornado.",
		position = 59,
		keyName = "tornadoFillColor",
		section = tornadoes
	)
	default Color tornadoFillColor()
	{
		return new Color(255, 255, 0, 50);
	}

	// Player Section

	@ConfigItem(
		name = "Overlay prayer",
		description = "Overlay the correct prayer to use against the Hunllef's current attack style.",
		position = 61,
		keyName = "prayerOverlay",
		section = player
	)
	default PrayerHighlightMode prayerOverlay()
	{
		return PrayerHighlightMode.NONE;
	}

	@ConfigItem(
		name = "Flash on wrong attack style",
		description = "Flash the screen if you use the wrong attack style.",
		position = 62,
		keyName = "flashOnWrongAttack",
		section = player
	)
	default boolean flashOnWrongAttack()
	{
		return false;
	}

	@Range(
		min = 10,
		max = 50
	)
	@ConfigItem(
		name = "Flash duration",
		description = "Change the duration of the flash.",
		position = 63,
		keyName = "flashOnWrongAttackDuration",
		section = player
	)
	default int flashOnWrongAttackDuration()
	{
		return 25;
	}

	@Alpha
	@ConfigItem(
		name = "Flash color",
		description = "Color of the flash notification.",
		position = 64,
		keyName = "flashOnWrongAttackColor",
		section = player
	)
	default Color flashOnWrongAttackColor()
	{
		return new Color(255, 0, 0, 70);
	}

	@ConfigItem(
		name = "Flash on 5:1 method",
		description = "Flash the screen to weapon switch when using 5:1 method.",
		position = 65,
		keyName = "flashOn51Method",
		section = player
	)
	default boolean flashOn51Method()
	{
		return false;
	}

	@Range(
		min = 10,
		max = 50
	)
	@ConfigItem(
		name = "Flash duration",
		description = "Change the duration of the flash.",
		position = 66,
		keyName = "flashOn51MethodDuration",
		section = player
	)
	default int flashOn51MethodDuration()
	{
		return 25;
	}

	@Alpha
	@ConfigItem(
		name = "Flash color",
		description = "Color of the flash notification.",
		position = 67,
		keyName = "flashOn51MethodColor",
		section = player
	)
	default Color flashOn51MethodColor()
	{
		return new Color(255, 190, 0, 50);
	}

	// Timer Section

	@ConfigItem(
		position = 69,
		keyName = "timerOverlay",
		name = "Overlay timer",
		description = "Display an overlay that tracks your gauntlet time.",
		section = timer
	)
	default boolean timerOverlay()
	{
		return false;
	}

	@ConfigItem(
		position = 70,
		keyName = "timerChatMessage",
		name = "Chat timer",
		description = "Display a chat message on death with your gauntlet time.",
		section = timer
	)
	default boolean timerChatMessage()
	{
		return false;
	}

	// Other Section

	@ConfigItem(
		name = "Render distance",
		description = "Set render distance of various overlays.",
		position = 72,
		keyName = "resourceRenderDistance",
		section = misc,
		enumClass = RenderDistance.class
	)
	default RenderDistance resourceRenderDistance()
	{
		return RenderDistance.FAR;
	}

	@ConfigItem(
		name = "Disco mode",
		description = "Kill the Hunllef.",
		position = 73,
		keyName = "discoMode",
		section = misc
	)
	default boolean discoMode()
	{
		return false;
	}

	@ConfigItem(
		name = "Enable mirror mode",
		description = "Toggle mirror mode compatibility.",
		position = 74,
		keyName = "mirrorMode",
		section = misc
	)
	default boolean mirrorMode()
	{
		return false;
	}

	// Constants

	@Getter
	@AllArgsConstructor
	enum RenderDistance
	{
		SHORT("Short", 2350),
		MEDIUM("Medium", 3525),
		FAR("Far", 4700),
		UNCAPPED("Uncapped", 0);

		private final String name;
		private final int distance;

		@Override
		public String toString()
		{
			return name;
		}
	}

	@Getter
	@AllArgsConstructor
	enum FontStyle
	{
		BOLD("Bold", Font.BOLD),
		ITALIC("Italic", Font.ITALIC),
		PLAIN("Plain", Font.PLAIN);

		private final String name;
		private final int font;

		@Override
		public String toString()
		{
			return name;
		}
	}

	@AllArgsConstructor
	enum PrayerHighlightMode
	{
		WIDGET("Widget"),
		BOX("Box"),
		BOTH("Both"),
		NONE("None");

		private final String name;

		@Override
		public String toString()
		{
			return name;
		}
	}

	enum ResourceFilter
	{
		ALL, BASIC, CUSTOM, OFF
	}
}
