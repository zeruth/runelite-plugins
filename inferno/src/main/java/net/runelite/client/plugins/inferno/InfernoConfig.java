/*
 * Copyright (c) 2019, Jacky <liangj97@gmail.com>
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
package net.runelite.client.plugins.inferno;

import java.awt.Color;
import java.awt.Font;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.plugins.inferno.displaymodes.InfernoNamingDisplayMode;
import net.runelite.client.plugins.inferno.displaymodes.InfernoPrayerDisplayMode;
import net.runelite.client.plugins.inferno.displaymodes.InfernoSafespotDisplayMode;
import net.runelite.client.plugins.inferno.displaymodes.InfernoWaveDisplayMode;
import net.runelite.client.plugins.inferno.displaymodes.InfernoZukShieldDisplayMode;

@ConfigGroup("inferno")
public interface InfernoConfig extends Config
{
	@ConfigSection(
		name = "Prayer",
		description = "Configuration options forPprayer",
		position = 0
	)
	String prayer = "Prayer";

	@ConfigSection(
		name = "Safespots",
		description = "Configuration options for Safespots",
		position = 6
	)
	String safespots = "Safespots";

	@ConfigSection(
		name = "Waves",
		description = "Configuration options for Waves",
		position = 12
	)
	String waves = "Waves";

	@ConfigSection(
		name = "Extras",
		description = "Configuration options for Extras",
		position = 18
	)
	String extras = "Extras";

	@ConfigSection(
		name = "Nibblers",
		description = "Configuration options for Nibblers",
		position = 21
	)
	String nibblers = "Nibblers";

	@ConfigSection(
		name = "Bats",
		description = "Configuration options for Bats",
		position = 25
	)
	String bats = "Bats";

	@ConfigSection(
		name = "Blobs",
		description = "Configuration options for Blobs",
		position = 31
	)
	String blobs = "Blobs";

	@ConfigSection(
		name = "Meleers",
		description = "Configuration options for Meleers",
		position = 41
	)
	String meleers = "Meleers";

	@ConfigSection(
		name = "Rangers",
		description = "Configuration options for Rangers",
		position = 46
	)
	String rangers = "Rangers";

	@ConfigSection(
		name = "Magers",
		description = "Configuration options for Magers",
		position = 51
	)
	String magers = "Magers";

	@ConfigSection(
		name = "Jad",
		description = "Configuration options for Jad",
		position = 57
	)
	String jad = "Jad";

	@ConfigSection(
		name = "Jad Healers",
		description = "Configuration options for Jad Healers",
		position = 62
	)
	String jadHealers = "Jad Healers";

	@ConfigSection(
		name = "Zuk",
		description = "Configuration options for  Zuk",
		position = 68
	)
	String zuk = "Zuk";

	@ConfigSection(
		name = "Zuk Healers",
		description = "Configuration options for Zuk Healers",
		position = 74
	)
	String zukHealers = "Zuk Healers";


	@ConfigItem(
		position = 1,
		keyName = "prayerDisplayMode",
		name = "Prayer Display Mode",
		description = "Display prayer indicator in the prayer tab or in the bottom right corner of the screen",
		section = prayer
	)
	default InfernoPrayerDisplayMode prayerDisplayMode()
	{
		return InfernoPrayerDisplayMode.BOTH;
	}

	@ConfigItem(
		position = 2,
		keyName = "indicateWhenPrayingCorrectly",
		name = "Indicate When Praying Correctly",
		description = "Indicate the correct prayer, even if you are already praying that prayer",
		section = prayer
	)
	default boolean indicateWhenPrayingCorrectly()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "descendingBoxes",
		name = "Descending Boxes",
		description = "Draws timing boxes above the prayer icons, as if you were playing Piano Tiles",
		section = prayer
	)
	default boolean descendingBoxes()
	{
		return true;
	}

	@ConfigItem(
		position = 4,
		keyName = "indicateNonPriorityDescendingBoxes",
		name = "Indicate Non-Priority Boxes",
		description = "Render descending boxes for prayers that are not the priority prayer for that tick",
		section = prayer
	)
	default boolean indicateNonPriorityDescendingBoxes()
	{
		return true;
	}

	@ConfigItem(
		position = 5,
		keyName = "alwaysShowPrayerHelper",
		name = "Always Show Prayer Helper",
		description = "Render prayer helper at all time, even when other inventory tabs are open.",
		section = prayer
	)
	default boolean alwaysShowPrayerHelper()
	{
		return false;
	}

	@ConfigItem(
		position = 7,
		keyName = "safespotDisplayMode",
		name = "Tile Safespots",
		description = "Indicate safespots on the ground: safespot (white), pray melee (red), pray range (green), pray magic (blue) and combinations of those",
		section = safespots
	)
	default InfernoSafespotDisplayMode safespotDisplayMode()
	{
		return InfernoSafespotDisplayMode.AREA;
	}

	@ConfigItem(
		position = 8,
		keyName = "safespotsCheckSize",
		name = "Tile Safespots Check Size",
		description = "The size of the area around the player that should be checked for safespots (SIZE x SIZE area)",
		section = safespots
	)
	default int safespotsCheckSize()
	{
		return 6;
	}

	@ConfigItem(
		position = 9,
		keyName = "indicateNonSafespotted",
		name = "Non-safespotted NPC's Overlay",
		description = "Red overlay for NPC's that can attack you",
		section = safespots
	)
	default boolean indicateNonSafespotted()
	{
		return false;
	}

	@ConfigItem(
		position = 10,
		keyName = "indicateTemporarySafespotted",
		name = "Temporary safespotted NPC's Overlay",
		description = "Orange overlay for NPC's that have to move to attack you",
		section = safespots
	)
	default boolean indicateTemporarySafespotted()
	{
		return false;
	}

	@ConfigItem(
		position = 11,
		keyName = "indicateSafespotted",
		name = "Safespotted NPC's Overlay",
		description = "Green overlay for NPC's that are safespotted (can't attack you)",
		section = safespots
	)
	default boolean indicateSafespotted()
	{
		return false;
	}

	@ConfigItem(
		position = 13,
		keyName = "waveDisplay",
		name = "Wave Display",
		description = "Shows monsters that will spawn on the selected wave(s).",
		section = waves
	)
	default InfernoWaveDisplayMode waveDisplay()
	{
		return InfernoWaveDisplayMode.BOTH;
	}

	@ConfigItem(
		position = 14,
		keyName = "npcNaming",
		name = "NPC Naming",
		description = "Simple (ex: Bat) or Complex (ex: Jal-MejRah) NPC naming",
		section = waves
	)
	default InfernoNamingDisplayMode npcNaming()
	{
		return InfernoNamingDisplayMode.SIMPLE;
	}

	@ConfigItem(
		position = 15,
		keyName = "npcLevels",
		name = "NPC Levels",
		description = "Show the combat level of the NPC next to their name",
		section = waves
	)
	default boolean npcLevels()
	{
		return false;
	}

	@ConfigItem(
		position = 16,
		keyName = "getWaveOverlayHeaderColor",
		name = "Wave Header",
		description = "Color for Wave Header",
		section = waves
	)
	default Color getWaveOverlayHeaderColor()
	{
		return Color.ORANGE;
	}

	@ConfigItem(
		position = 17,
		keyName = "getWaveTextColor",
		name = "Wave Text Color",
		description = "Color for Wave Texts",
		section = waves
	)
	default Color getWaveTextColor()
	{
		return Color.WHITE;
	}

	@ConfigItem(
		position = 19,
		keyName = "indicateObstacles",
		name = "Obstacles",
		description = "Indicate obstacles that NPC's cannot pass through",
		section = extras
	)
	default boolean indicateObstacles()
	{
		return false;
	}

	@ConfigItem(
		position = 20,
		keyName = "spawnTimerInfobox",
		name = "Spawn Timer Infobox",
		description = "Display an Infobox that times spawn sets during Zuk fight.",
		section = extras
	)
	default boolean spawnTimerInfobox()
	{
		return false;
	}

	@ConfigItem(
		position = 22,
		keyName = "indicateNibblers",
		name = "Indicate Nibblers",
		description = "Indicate's nibblers that are alive",
		section = nibblers
	)
	default boolean indicateNibblers()
	{
		return true;
	}

	@ConfigItem(
		position = 23,
		keyName = "hideJalNibDeath",
		name = "Hide On Death",
		description = "Hide Nibblers on death animation",
		section = nibblers
	)
	default boolean hideNibblerDeath()
	{
		return false;
	}

	@ConfigItem(
		position = 24,
		keyName = "indicateCentralNibbler",
		name = "Indicate Central Nibbler",
		description = "Indicate the most central nibbler. If multiple nibblers will freeze the same amount of other nibblers, " +
			"the nibbler closest to the player's location is chosen.",
		section = nibblers
	)
	default boolean indicateCentralNibbler()
	{
		return true;
	}

	@ConfigItem(
		position = 26,
		keyName = "prayerBat",
		name = "Prayer Helper",
		description = "Indicate the correct prayer when this NPC attacks",
		section = bats
	)
	default boolean prayerBat()
	{
		return true;
	}

	@ConfigItem(
		position = 27,
		keyName = "ticksOnNpcBat",
		name = "Ticks on NPC",
		description = "Draws the amount of ticks before an NPC is going to attack on the NPC",
		section = bats
	)
	default boolean ticksOnNpcBat()
	{
		return true;
	}

	@ConfigItem(
		position = 28,
		keyName = "safespotsBat",
		name = "Safespots",
		description = "Enable or disable safespot calculation for this specific NPC. 'Tile Safespots' in the 'Safespots' category needs to be turned on for this to take effect.",
		section = bats
	)
	default boolean safespotsBat()
	{
		return true;
	}

	@ConfigItem(
		position = 29,
		keyName = "indicateNpcPositionBat",
		name = "Indicate Main Tile",
		description = "Indicate the main tile for multi-tile NPC's. This tile is used for and pathfinding.",
		section = bats
	)
	default boolean indicateNpcPositionBat()
	{
		return false;
	}

	@ConfigItem(
		position = 30,
		keyName = "hideJalMejRahDeath",
		name = "Hide On Death",
		description = "Hide Jal-MejRah on death animation",
		section = bats
	)
	default boolean hideBatDeath()
	{
		return false;
	}

	@ConfigItem(
		position = 32,
		keyName = "prayerBlob",
		name = "Prayer Helper",
		description = "Indicate the correct prayer when this NPC attacks",
		section = blobs
	)
	default boolean prayerBlob()
	{
		return true;
	}

	@ConfigItem(
		position = 33,
		keyName = "indicateBlobDetectionTick",
		name = "Indicate Blob Dection Tick",
		description = "Show a prayer indicator (default: magic) for the tick on which the blob will detect prayer",
		section = blobs
	)
	default boolean indicateBlobDetectionTick()
	{
		return true;
	}

	@ConfigItem(
		position = 34,
		keyName = "ticksOnNpcBlob",
		name = "Ticks on NPC",
		description = "Draws the amount of ticks before an NPC is going to attack on the NPC",
		section = blobs
	)
	default boolean ticksOnNpcBlob()
	{
		return true;
	}

	@ConfigItem(
		position = 35,
		keyName = "safespotsBlob",
		name = "Safespots",
		description = "Enable or disable safespot calculation for this specific NPC. 'Tile Safespots' in the 'Safespots' category needs to be turned on for this to take effect.",
		section = blobs
	)
	default boolean safespotsBlob()
	{
		return true;
	}

	@ConfigItem(
		position = 36,
		keyName = "indicateNpcPositionBlob",
		name = "Indicate Main Tile",
		description = "Indicate the main tile for multi-tile NPC's. This tile is used for pathfinding.",
		section = blobs
	)
	default boolean indicateNpcPositionBlob()
	{
		return false;
	}

	@ConfigItem(
		position = 37,
		keyName = "hideJalAkDeath",
		name = "Hide Blob On Death",
		description = "Hide Jal-Ak on death animation",
		section = blobs
	)
	default boolean hideBlobDeath()
	{
		return false;
	}


	@ConfigItem(
		position = 38,
		keyName = "hideJalAkRekXilDeath",
		name = "Hide Small Range Blob On Death",
		description = "Hide Jal-AkRek-Xil on death animation",
		section = blobs
	)
	default boolean hideBlobSmallRangedDeath()
	{
		return false;
	}

	@ConfigItem(
		position = 39,
		keyName = "hideJalAkRekMejDeath",
		name = "Hide Small Magic Blob On Death",
		description = "Hide Jal-AkRek-Mej on death animation",
		section = blobs
	)
	default boolean hideBlobSmallMagicDeath()
	{
		return false;
	}

	@ConfigItem(
		position = 40,
		keyName = "hideJalAkRekKetDeath",
		name = "Hide Small Melee Blob On Death",
		description = "Hide Jal-AkRek-Ket on death animation",
		section = blobs
	)
	default boolean hideBlobSmallMeleeDeath()
	{
		return false;
	}

	@ConfigItem(
		position = 0,
		keyName = "prayerMeleer",
		name = "Prayer Helper",
		description = "Indicate the correct prayer when this NPC attacks",
		section = meleers
	)
	default boolean prayerMeleer()
	{
		return true;
	}

	@ConfigItem(
		position = 42,
		keyName = "ticksOnNpcMeleer",
		name = "Ticks on NPC",
		description = "Draws the amount of ticks before an NPC is going to attack on the NPC",
		section = meleers
	)
	default boolean ticksOnNpcMeleer()
	{
		return true;
	}

	@ConfigItem(
		position = 43,
		keyName = "safespotsMeleer",
		name = "Safespots",
		description = "Enable or disable safespot calculation for this specific NPC. 'Tile Safespots' in the 'Safespots' category needs to be turned on for this to take effect.",
		section = meleers
	)
	default boolean safespotsMeleer()
	{
		return true;
	}

	@ConfigItem(
		position = 44,
		keyName = "indicateNpcPositionMeleer",
		name = "Indicate Main Tile",
		description = "Indicate the main tile for multi-tile NPC's. This tile is used for pathfinding.",
		section = meleers
	)
	default boolean indicateNpcPositionMeleer()
	{
		return false;
	}

	@ConfigItem(
		position = 45,
		keyName = "hideJalImKotDeath",
		name = "Hide On Death",
		description = "Hide Jal-ImKot on death animation",
		section = meleers
	)
	default boolean hideMeleerDeath()
	{
		return false;
	}


	@ConfigItem(
		position = 0,
		keyName = "prayerRanger",
		name = "Prayer Helper",
		description = "Indicate the correct prayer when this NPC attacks",
		section = rangers
	)
	default boolean prayerRanger()
	{
		return true;
	}

	@ConfigItem(
		position = 47,
		keyName = "ticksOnNpcRanger",
		name = "Ticks on NPC",
		description = "Draws the amount of ticks before an NPC is going to attack on the NPC",
		section = rangers
	)
	default boolean ticksOnNpcRanger()
	{
		return true;
	}

	@ConfigItem(
		position = 48,
		keyName = "safespotsRanger",
		name = "Safespots",
		description = "Enable or disable safespot calculation for this specific NPC. 'Tile Safespots' in the 'Safespots' category needs to be turned on for this to take effect.",
		section = rangers
	)
	default boolean safespotsRanger()
	{
		return true;
	}

	@ConfigItem(
		position = 49,
		keyName = "indicateNpcPositionRanger",
		name = "Indicate Main Tile",
		description = "Indicate the main tile for multi-tile NPC's. This tile is used for pathfinding.",
		section = rangers
	)
	default boolean indicateNpcPositionRanger()
	{
		return false;
	}

	@ConfigItem(
		position = 50,
		keyName = "hideJalXilDeath",
		name = "Hide On Death",
		description = "Hide Jal-Xil on death animation",
		section = rangers
	)
	default boolean hideRangerDeath()
	{
		return false;
	}

	@ConfigItem(
		position = 52,
		keyName = "prayerMage",
		name = "Prayer Helper",
		description = "Indicate the correct prayer when this NPC attacks",
		section = magers
	)
	default boolean prayerMage()
	{
		return true;
	}

	@ConfigItem(
		position = 53,
		keyName = "ticksOnNpcMage",
		name = "Ticks on NPC",
		description = "Draws the amount of ticks before an NPC is going to attack on the NPC",
		section = magers
	)
	default boolean ticksOnNpcMage()
	{
		return true;
	}

	@ConfigItem(
		position = 54,
		keyName = "safespotsMage",
		name = "Safespots",
		description = "Enable or disable safespot calculation for this specific NPC. 'Tile Safespots' in the 'Safespots' category needs to be turned on for this to take effect.",
		section = magers
	)
	default boolean safespotsMage()
	{
		return true;
	}

	@ConfigItem(
		position = 55,
		keyName = "indicateNpcPositionMage",
		name = "Indicate Main Tile",
		description = "Indicate the main tile for multi-tile NPC's. This tile is used for pathfinding.",
		section = magers
	)
	default boolean indicateNpcPositionMage()
	{
		return false;
	}

	@ConfigItem(
		position = 56,
		keyName = "hideJalZekDeath",
		name = "Hide On Death",
		description = "Hide Jal-Zek on death animation",
		section = magers
	)
	default boolean hideMagerDeath()
	{
		return false;
	}

	@ConfigItem(
		position = 63,
		keyName = "prayerHealersJad",
		name = "Prayer Helper",
		description = "Indicate the correct prayer when this NPC attacks",
		section = jadHealers
	)
	default boolean prayerHealerJad()
	{
		return false;
	}

	@ConfigItem(
		position = 64,
		keyName = "ticksOnNpcHealersJad",
		name = "Ticks on NPC",
		description = "Draws the amount of ticks before an NPC is going to attack on the NPC",
		section = jadHealers
	)
	default boolean ticksOnNpcHealerJad()
	{
		return false;
	}

	@ConfigItem(
		position = 65,
		keyName = "safespotsHealersJad",
		name = "Safespots",
		description = "Enable or disable safespot calculation for this specific NPC. 'Tile Safespots' in the 'Safespots' category needs to be turned on for this to take effect.",
		section = jadHealers
	)
	default boolean safespotsHealerJad()
	{
		return true;
	}

	@ConfigItem(
		position = 66,
		keyName = "indicateActiveHealersJad",
		name = "Indicate Active Healers",
		description = "Indicate healers that are still healing Jad",
		section = jadHealers
	)
	default boolean indicateActiveHealerJad()
	{
		return true;
	}

	@ConfigItem(
		position = 67,
		keyName = "hideYtHurKotDeath",
		name = "Hide On Death",
		description = "Hide Yt-HurKot on death animation",
		section = jadHealers
	)
	default boolean hideHealerJadDeath()
	{
		return false;
	}

	@ConfigItem(
		position = 58,
		keyName = "prayerJad",
		name = "Prayer Helper",
		description = "Indicate the correct prayer when this NPC attacks",
		section = jad
	)
	default boolean prayerJad()
	{
		return true;
	}

	@ConfigItem(
		position = 59,
		keyName = "ticksOnNpcJad",
		name = "Ticks on NPC",
		description = "Draws the amount of ticks before an NPC is going to attack on the NPC",
		section = jad
	)
	default boolean ticksOnNpcJad()
	{
		return true;
	}

	@ConfigItem(
		position = 60,
		keyName = "safespotsJad",
		name = "Safespots (Melee Range Only)",
		description = "Enable or disable safespot calculation for this specific NPC. 'Tile Safespots' in the 'Safespots' category needs to be turned on for this to take effect.",
		section = jad
	)
	default boolean safespotsJad()
	{
		return true;
	}

	@ConfigItem(
		position = 61,
		keyName = "hideJalTokJadDeath",
		name = "Hide On Death",
		description = "Hide JalTok-Jad on death animation",
		section = jad
	)
	default boolean hideJadDeath()
	{
		return false;
	}

	@ConfigItem(
		position = 75,
		keyName = "indicateActiveHealersZuk",
		name = "Indicate Active Healers (UNTESTED)",
		description = "Indicate healers that are still healing Zuk",
		section = zukHealers
	)
	default boolean indicateActiveHealerZuk()
	{
		return true;
	}

	@ConfigItem(
		position = 76,
		keyName = "hideJalMejJakDeath",
		name = "Hide On Death",
		description = "Hide Jal-MejJak on death animation",
		section = zukHealers
	)
	default boolean hideHealerZukDeath()
	{
		return false;
	}

	@ConfigItem(
		position = 69,
		keyName = "ticksOnNpcZuk",
		name = "Ticks on NPC",
		description = "Draws the amount of ticks before an NPC is going to attack on the NPC",
		section = zuk
	)
	default boolean ticksOnNpcZuk()
	{
		return true;
	}

	@ConfigItem(
		position = 70,
		keyName = "safespotsZukShieldBeforeHealers",
		name = "Safespots (Before Healers)",
		description = "Indicate the zuk shield safespots. 'Tile Safespots' in the 'Safespots' category needs to be turned on for this to take effect. Shield must go back and forth at least 1 time before the predict option will work.",
		section = zuk
	)
	default InfernoZukShieldDisplayMode safespotsZukShieldBeforeHealers()
	{
		return InfernoZukShieldDisplayMode.PREDICT;
	}

	@ConfigItem(
		position = 71,
		keyName = "safespotsZukShieldAfterHealers",
		name = "Safespots (After Healers)",
		description = "Indicate the zuk shield safespots. 'Tile Safespots' in the 'Safespots' category needs to be turned on for this to take effect.",
		section = zuk
	)
	default InfernoZukShieldDisplayMode safespotsZukShieldAfterHealers()
	{
		return InfernoZukShieldDisplayMode.LIVE;
	}

	@ConfigItem(
		position = 72,
		keyName = "hideTzKalZukDeath",
		name = "Hide On Death",
		description = "Hide TzKal-Zuk on death animation",
		section = zuk
	)
	default boolean hideZukDeath()
	{
		return false;
	}

	@ConfigItem(
		position = 73,
		keyName = "ticksOnNpcZukShield",
		name = "Ticks on Zuk Shield",
		description = "Draws the amount of ticks before Zuk attacks on the floating shield",
		section = zuk
	)
	default boolean ticksOnNpcZukShield()
	{
		return false;
	}

	@Getter
	@AllArgsConstructor
	enum FontStyle
	{
		BOLD("Bold", Font.BOLD),
		ITALIC("Italic", Font.ITALIC),
		PLAIN("Plain", Font.PLAIN);

		private String name;
		private int font;

		@Override
		public String toString()
		{
			return getName();
		}
	}
}
