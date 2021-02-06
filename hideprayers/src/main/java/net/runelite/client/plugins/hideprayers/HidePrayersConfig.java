/*
 * Copyright (c) 2018, https://openosrs.com
 * Copyright (c) 2019, Kyle <https://github.com/kyleeld>
 * Copyright (c) 2018, Raiever <https://github.com/Raieverr>
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

package net.runelite.client.plugins.hideprayers;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.plugins.hideprayers.util.Armadyl;
import net.runelite.client.plugins.hideprayers.util.Bandos;
import net.runelite.client.plugins.hideprayers.util.Barrows;
import net.runelite.client.plugins.hideprayers.util.Cerberus;
import net.runelite.client.plugins.hideprayers.util.PVPPrayers;
import net.runelite.client.plugins.hideprayers.util.Saradomin;
import net.runelite.client.plugins.hideprayers.util.Vorkath;
import net.runelite.client.plugins.hideprayers.util.Zamorak;
import net.runelite.client.plugins.hideprayers.util.Zulrah;

@ConfigGroup("hideprayers")
public interface HidePrayersConfig extends Config
{
	@ConfigSection(
		name = "Individual Prayers",
		description = "",
		position = 0
	)
	String individual = "Individual";

	@ConfigItem(
		position = 1,
		keyName = "showindividualprayers",
		name = "Hide Individual Prayers",
		description = "Hide/Show Prayers.",
		section = individual
	)
	default boolean showindividualprayers()
	{
		return false;
	}

	@ConfigItem(
		position = 2,
		keyName = "ShowTHICK_SKIN",
		name = "Show Thick Skin",
		description = "Hide/Show Thick Skin",
		section = individual
	)
	default boolean ShowTHICK_SKIN()
	{
		return false;
	}

	@ConfigItem(
		position = 3,
		keyName = "ShowBURST_OF_STRENGTH",
		name = "Show Burst of Strength",
		description = "Hide/Show Burst of Strength",
		section = individual
	)
	default boolean ShowBURST_OF_STRENGTH()
	{
		return false;
	}

	@ConfigItem(
		position = 4,
		keyName = "ShowCLARITY_OF_THOUGHT",
		name = "Show Clarity of Thought",
		description = "Hide/Show Clarity of Thought",
		section = individual
	)
	default boolean ShowCLARITY_OF_THOUGHT()
	{
		return false;
	}

	@ConfigItem(
		position = 5,
		keyName = "ShowSHARP_EYE",
		name = "Show Sharp Eye",
		description = "Hide/Show Sharp Eye",
		section = individual
	)
	default boolean ShowSHARP_EYE()
	{
		return false;
	}

	@ConfigItem(
		position = 6,
		keyName = "ShowMYSTIC_WILL",
		name = "Show Mystic Will",
		description = "Hide/Show Mystic Will",
		section = individual
	)
	default boolean ShowMYSTIC_WILL()
	{
		return false;
	}

	@ConfigItem(
		position = 7,
		keyName = "ShowROCK_SKIN",
		name = "Show Rock Skin",
		description = "Hide/Show Rock Skin",
		section = individual
	)
	default boolean ShowROCK_SKIN()
	{
		return false;
	}

	@ConfigItem(
		position = 8,
		keyName = "ShowSUPERHUMAN_STRENGTH",
		name = "Show Super Human Strength",
		description = "Hide/Show Super Human Strength",
		section = individual
	)
	default boolean ShowSUPERHUMAN_STRENGTH()
	{
		return false;
	}

	@ConfigItem(
		position = 9,
		keyName = "ShowIMPROVED_REFLEXES",
		name = "Show Improved_Reflexes",
		description = "Hide/Show Improved_Reflexes",
		section = individual
	)
	default boolean ShowIMPROVED_REFLEXES()
	{
		return false;
	}

	@ConfigItem(
		position = 10,
		keyName = "ShowRapidRestore",
		name = "Show Rapid Restore",
		description = "Hide/Show Rapid Restore",
		section = individual
	)
	default boolean ShowRapidRestore()
	{
		return false;
	}

	@ConfigItem(
		position = 11,
		keyName = "ShowRapidHeal",
		name = "Show Rapid Heal",
		description = "Hide/Show Rapid Heal",
		section = individual
	)
	default boolean ShowRapidHeal()
	{
		return false;
	}

	@ConfigItem(
		position = 12,
		keyName = "ShowProtectItem",
		name = "Show Protect Item",
		description = "Hide/Show Protect Item",
		section = individual
	)
	default boolean ShowProtectItem()
	{
		return false;
	}

	@ConfigItem(
		position = 13,
		keyName = "ShowHAWK_EYE",
		name = "Show Hawk Eye",
		description = "Hide/Show Hawk Eye",
		section = individual
	)
	default boolean ShowHAWK_EYE()
	{
		return false;
	}

	@ConfigItem(
		position = 14,
		keyName = "ShowMYSTIC_LORE",
		name = "Show Mystic Lore",
		description = "Hide/Show Mystic Lore",
		section = individual
	)
	default boolean ShowMYSTIC_LORE()
	{
		return false;
	}


	@ConfigItem(
		position = 15,
		keyName = "ShowSteelSkin",
		name = "Show Steel Skin",
		description = "Hide/Show Steel skin",
		section = individual
	)
	default boolean ShowSteelSkin()
	{
		return false;
	}

	@ConfigItem(
		position = 16,
		keyName = "ShowUltimateStrength",
		name = "Show Ultimate Strength",
		description = "Hide/Show Ultimate strength",
		section = individual
	)
	default boolean ShowUltimateStrength()
	{
		return false;
	}

	@ConfigItem(
		position = 17,
		keyName = "ShowIncredibleReflex",
		name = "Show Incredible Reflex",
		description = "Hide/Show Incredible Reflex",
		section = individual
	)
	default boolean ShowIncredibleReflex()
	{
		return false;
	}

	@ConfigItem(
		position = 18,
		keyName = "ShowPTFMagic",
		name = "Show Protect From Magic",
		description = "Hide/Show Protect From Magic",
		section = individual
	)
	default boolean ShowPTFMagic()
	{
		return false;
	}

	@ConfigItem(
		position = 19,
		keyName = "ShowPTFRange",
		name = "Show Protect From Range",
		description = "Hide/Show Protect from Range",
		section = individual
	)
	default boolean ShowPTFRange()
	{
		return false;
	}

	@ConfigItem(
		position = 20,
		keyName = "ShowPTFMelee",
		name = "Show Protect From Melee",
		description = "Hide/Show Protect From Melee",
		section = individual
	)
	default boolean ShowPTFMelee()
	{
		return false;
	}

	@ConfigItem(
		position = 21,
		keyName = "ShowEagle",
		name = "Show Eagle Eye",
		description = "Hide/Show Eagle Eye",
		section = individual
	)
	default boolean ShowEagle()
	{
		return false;
	}

	@ConfigItem(
		position = 22,
		keyName = "ShowMystic",
		name = "Show Mystic Might",
		description = "Hide/Show Mystic Might",
		section = individual
	)
	default boolean ShowMystic()
	{
		return false;
	}

	@ConfigItem(
		position = 23,
		keyName = "ShowRETRIBUTION",
		name = "Show Retribution",
		description = "Hide/Show Retribution",
		section = individual
	)
	default boolean ShowRETRIBUTION()
	{
		return false;
	}

	@ConfigItem(
		position = 24,
		keyName = "ShowRedemption",
		name = "Show Redemption",
		description = "Hide/Show Redemption",
		section = individual
	)
	default boolean ShowRedemption()
	{
		return false;
	}

	@ConfigItem(
		position = 25,
		keyName = "ShowSmite",
		name = "Show Smite",
		description = "Hide/Show Smite",
		section = individual
	)
	default boolean ShowSmite()
	{
		return false;
	}

	@ConfigItem(
		position = 26,
		keyName = "ShowPreserve",
		name = "Show Preserve",
		description = "Hide/Show Preserve",
		section = individual
	)
	default boolean ShowPreserve()
	{
		return false;
	}

	@ConfigItem(
		position = 27,
		keyName = "ShowChivalry",
		name = "Show Chivalry",
		description = "Hide/Show Chivalry",
		section = individual
	)
	default boolean ShowChivalry()
	{
		return false;
	}

	@ConfigItem(
		position = 28,
		keyName = "ShowPiety",
		name = "Show Piety",
		description = "Hide/Show Piety",
		section = individual
	)
	default boolean ShowPiety()
	{
		return false;
	}

	@ConfigItem(
		position = 29,
		keyName = "ShowRigour",
		name = "Show Rigour",
		description = "Hide/Show Rigour",
		section = individual
	)
	default boolean ShowRigour()
	{
		return false;
	}

	@ConfigItem(
		position = 30,
		keyName = "ShowAugury",
		name = "Show Augury",
		description = "Hide/Show Augury",
		section = individual
	)
	default boolean ShowAugury()
	{
		return false;
	}

// ----------------------------------------------------------- //


	@ConfigSection(
		name = "PvM Prayers",
		description = "",
		position = 31
	)
	String pvm = "PvM";

	@ConfigItem(
		position = 32,
		keyName = "getarmadylprayers",
		name = "enable Armadyl Prayers",
		description = "Shows prayers for Armadyl",
		section = pvm
	)
	default boolean getarmadylprayers()
	{
		return false;
	}

	@ConfigItem(
		position = 33,
		keyName = "armadyl",
		name = "Armadyl",
		description = "Shows prayers for Armadyl",
		section = pvm
	)
	default Armadyl armadyl()
	{
		return Armadyl.DISABLED;
	}

	@ConfigItem(
		position = 34,
		keyName = "getbarrowsprayers",
		name = "enable Barrows Prayers",
		description = "Shows prayers for Barrows",
		section = pvm
	)
	default boolean getbarrowsprayers()
	{
		return false;
	}

	@ConfigItem(
		position = 35,
		keyName = "barrows",
		name = "Barrows",
		description = "Shows prayers for Barrows",
		section = pvm
	)
	default Barrows barrows()
	{
		return Barrows.DISABLED;
	}

	@ConfigItem(
		position = 36,
		keyName = "getbandosprayers",
		name = "enable Bandos Prayers",
		description = "Shows prayers for Bandos",
		section = pvm
	)
	default boolean getbandosprayers()
	{
		return false;
	}

	@ConfigItem(
		position = 37,
		keyName = "bandos",
		name = "Bandos",
		description = "Shows prayers for Bandos",
		section = pvm
	)
	default Bandos bandos()
	{
		return Bandos.DISABLED;
	}

	@ConfigItem(
		position = 38,
		keyName = "getcerberusprayers",
		name = "enable Cerberus Prayers",
		description = "Shows prayers for Cerberus",
		section = pvm
	)
	default boolean getcerberusprayers()
	{
		return false;
	}

	@ConfigItem(
		position = 39,
		keyName = "cerberus",
		name = "Cerberus",
		description = "Shows prayers for Cerberus",
		section = pvm
	)
	default Cerberus cerberus()
	{
		return Cerberus.DISABLED;
	}

	@ConfigItem(
		position = 40,
		keyName = "getsaradominprayers",
		name = "enable Saradomin Prayers",
		description = "Shows prayers for Saradomin",
		section = pvm
	)
	default boolean getsaradominprayers()
	{
		return false;
	}

	@ConfigItem(
		position = 41,
		keyName = "saradomin",
		name = "Saradomin",
		description = "Shows prayers for Saradomin",
		section = pvm
	)
	default Saradomin saradomin()
	{
		return Saradomin.DISABLED;
	}

	@ConfigItem(
		position = 42,
		keyName = "getvorkathprayers",
		name = "enable Vorkath Prayers",
		description = "Shows prayers for Vorkath",
		section = pvm
	)
	default boolean getvorkathprayers()
	{
		return false;
	}

	@ConfigItem(
		position = 43,
		keyName = "vorkath",
		name = "Vorkath",
		description = "Shows prayers for Vorkath",
		section = pvm
	)
	default Vorkath vorkath()
	{
		return Vorkath.DISABLED;
	}

	@ConfigItem(
		position = 44,
		keyName = "getzamorakprayers",
		name = "enable Zamorak Prayers",
		description = "Shows prayers for Zamorak",
		section = pvm
	)
	default boolean getzamorakprayers()
	{
		return false;
	}

	@ConfigItem(
		position = 45,
		keyName = "zamorak",
		name = "Zamorak",
		description = "Shows prayers for Zamorak",
		section = pvm
	)
	default Zamorak zamorak()
	{
		return Zamorak.DISABLED;
	}

	@ConfigItem(
		position = 46,
		keyName = "getzulrahprayers",
		name = "enable Zulrah Prayers",
		description = "Shows prayers for Zulrah",
		section = pvm
	)
	default boolean getzulrahprayers()
	{
		return false;
	}

	@ConfigItem(
		position = 47,
		keyName = "zulrah",
		name = "Zulrah",
		description = "Shows prayers for Zulrah",
		section = pvm
	)
	default Zulrah zulrah()
	{
		return Zulrah.DISABLED;
	}

// ----------------------------------------------------------- //

	@ConfigSection(
		name = "PvP Prayers",
		description = "",
		position = 48
	)
	String pvp = "PvP";

	@ConfigItem(
		position = 49,
		keyName = "getpvpprayers",
		name = "enable PVP Prayers",
		description = "Shows prayers based on prayer build",
		section = pvp
	)
	default boolean getpvpprayers()
	{
		return false;
	}

	@ConfigItem(
		position = 50,
		keyName = "pvpprayers",
		name = "PVP Prayers",
		description = "Shows prayers based on prayer build",
		section = pvp
	)
	default PVPPrayers pvpprayers()
	{
		return PVPPrayers.DISABLED;
	}

	@ConfigItem(
		position = 51,
		keyName = "HideRapidHealRestore",
		name = "Hide Rapid Heal and Rapid Restore",
		description = "Hides the Rapid Heal and Rapid Restore prayers",
		section = pvp
	)
	default boolean HideRapidHealRestore()
	{
		return false;
	}
}
