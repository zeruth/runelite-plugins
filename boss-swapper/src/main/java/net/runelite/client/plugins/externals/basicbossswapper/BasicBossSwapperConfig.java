/*
 * Copyright (c) 2019-2020, ganom <https://github.com/Ganom>
 * All rights reserved.
 * Licensed under GPL3, see LICENSE for the full scope.
 */
package net.runelite.client.plugins.externals.basicbossswapper;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Keybind;

@ConfigGroup("BasicBossSwapperConfig")
public interface BasicBossSwapperConfig extends Config
{
	@ConfigSection(
		position = 0,
		name = "Bot Config",
		description = ""
	)
	String botConfig = "Bot Config";

	@ConfigItem(
		keyName = "toggle",
		name = "Toggle",
		description = "",
		position = 1,
		section = botConfig
	)
	default Keybind toggle()
	{
		return Keybind.NOT_SET;
	}

	@ConfigItem(
		position = 2,
		keyName = "randLow",
		name = "Minimum Delay",
		description = "",
		section = botConfig
	)
	default int randLow()
	{
		return 70;
	}

	@ConfigItem(
		position = 3,
		keyName = "randLower",
		name = "Maximum Delay",
		description = "",
		section = botConfig
	)
	default int randHigh()
	{
		return 80;
	}

	@ConfigSection(
		position = 4,
		name = "Olm Config",
		description = ""
	)
	String olmConfig = "Olm Config";

	@ConfigItem(
		position = 5,
		keyName = "swapAutos",
		name = "Swap on Auto Attacks",
		description = "This will swap prayers for olms auto attacks as-well.",
		section = olmConfig
	)
	default boolean swapAutos()
	{
		return false;
	}

	@ConfigSection(
		position = 6,
		name = "Nylo Config",
		description = ""
	)
	String nyloConfig = "Nylo Config";

	@ConfigItem(
		position = 7,
		keyName = "mage",
		name = "Mage Gearswap",
		description = "Mage Gearswap Item Ids",
		section = nyloConfig
	)
	default String mage()
	{
		return "11663,22323,21795,12002";
	}

	@ConfigItem(
		position = 8,
		keyName = "range",
		name = "Range Gearswap",
		description = "Range Gearswap Item Ids",
		section = nyloConfig
	)
	default String range()
	{
		return "11664,12926,22109,19547";
	}

	@ConfigItem(
		position = 9,
		keyName = "melee",
		name = "Melee Gearswap",
		description = "Melee Gearswap Item Ids",
		section = nyloConfig
	)
	default String melee()
	{
		return "11665,12006,6570,19553,12954";
	}
}

