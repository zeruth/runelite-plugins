/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2020, dutta64 <https://github.com/dutta64>
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

package net.runelite.client.plugins.grotesqueguardians;

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

@ConfigGroup("grotesqueguardians")
public interface GrotesqueGuardiansConfig extends Config
{
	@ConfigSection(
		name = "Tick counters",
		description = "Tick counter settings.",
		position = 0
	)
	String tickCounters = "Tick Counters";

	// Tick counters

	@ConfigItem(
		name = "Prayer widget tick counter",
		description = "Enable prayer widget tick counter overlay.",
		position = 1,
		keyName = "prayerTickCounter",
		section = tickCounters
	)
	default boolean prayerTickCounter()
	{
		return false;
	}

	@ConfigItem(
		name = "Prayer Guitar Hero mode",
		description = "Enable Guitar Hero mode for prayers.",
		position = 2,
		keyName = "guitarHeroMode",
		section = tickCounters
	)
	default boolean guitarHeroMode()
	{
		return false;
	}

	@ConfigItem(
		name = "Dusk tick counter",
		description = "Show tick counter on Dusk.",
		position = 3,
		keyName = "duskTickCounter",
		section = tickCounters
	)
	default boolean duskTickCounter()
	{
		return false;
	}

	@Range(
		min = 12,
		max = 64
	)
	@ConfigItem(
		name = "Font size",
		description = "Adjust the font size of the Dusk tick counter.",
		position = 4,
		keyName = "duskFontSize",
		section = tickCounters
	)
	@Units(Units.POINTS)
	default int duskFontSize()
	{
		return 22;
	}

	@ConfigItem(
		name = "Font style",
		description = "Bold/Italics/Plain",
		position = 5,
		keyName = "duskFontStyle",
		section = tickCounters
	)
	default FontStyle duskFontStyle()
	{
		return FontStyle.BOLD;
	}

	@Alpha
	@ConfigItem(
		name = "Font color",
		description = "Color of the Dusk ticker counter font.",
		position = 6,
		keyName = "duskFontColor",
		section = tickCounters
	)
	default Color duskFontColor()
	{
		return Color.YELLOW;
	}


	// Outlines

	@ConfigSection(
		name = "Outlines",
		description = "Outline settings.",
		position = 7
	)
	String outlines = "Outlines";

	@ConfigItem(
		name = "Outline gargoyle tiles",
		description = "Outline gargoyle tiles.",
		position = 8,
		keyName = "outlineGargoyleTile",
		section = outlines
	)
	default boolean outlineGargoyleTile()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 4
	)
	@ConfigItem(
		name = "Tile outline width",
		description = "Change the width of the tile outline.",
		position = 9,
		keyName = "tileOutlineWidth",
		section = outlines
	)
	@Units(Units.POINTS)
	default int tileOutlineWidth()
	{
		return 1;
	}

	@Alpha
	@ConfigItem(
		name = "Tile outline color",
		description = "Change the color of the tile outline.",
		position = 10,
		keyName = "tileOutlineColor",
		section = outlines
	)
	default Color tileOutlineColor()
	{
		return Color.WHITE;
	}

	@ConfigItem(
		name = "Outline gargoyle invulnerability",
		description = "Outline gargoyle npcs when invulnerable.",
		position = 11,
		keyName = "gargoyleInvulnOutline",
		section = outlines
	)
	default boolean gargoyleInvulnOutline()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 4
	)
	@ConfigItem(
		name = "Outline width",
		description = "Change the width of the outline.",
		position = 12,
		keyName = "gargoyleInvulnOutlineWidth",
		section = outlines
	)
	@Units(Units.POINTS)
	default int gargoyleInvulnOutlineWidth()
	{
		return 2;
	}

	@Alpha
	@ConfigItem(
		name = "Outline color",
		description = "Change the color of the outline.",
		position = 13,
		keyName = "gargoyleInvulnOutlineColor",
		section = outlines
	)
	default Color gargoyleInvulnOutlineColor()
	{
		return Color.ORANGE;
	}

	@ConfigItem(
		name = "Outline graphics objects",
		description = "Outline the damage tiles during Phase 3.",
		position = 14,
		keyName = "outlineGraphicsObjects",
		section = outlines
	)
	default boolean outlineGraphicsObjects()
	{
		return false;
	}

	@Range(
		min = 1,
		max = 4
	)
	@ConfigItem(
		name = "Outline width",
		description = "Change the width of the graphics objects outline.",
		position = 15,
		keyName = "graphicsObjectsOutlineWidth",
		section = outlines
	)
	@Units(Units.POINTS)
	default int graphicsObjectsOutlineWidth()
	{
		return 1;
	}

	@Alpha
	@ConfigItem(
		name = "Outline color",
		description = "Change the color of the graphics objects outline.",
		position = 16,
		keyName = "graphicsObjectsOutlineColor",
		section = outlines
	)
	default Color graphicsObjectsOutlineColor()
	{
		return Color.WHITE;
	}

	// Other Section

	@ConfigSection(
		name = "Misc",
		description = "Other settings.",
		position = 17
	)
	String misc = "Misc";

	@ConfigItem(
		name = "Flash on Danger",
		description = "Flash the screen if danger tile spawns under you.",
		position = 18,
		keyName = "flashOnDanger",
		section = misc
	)
	default boolean flashOnDanger()
	{
		return false;
	}

	@Alpha
	@ConfigItem(
		name = "Flash color",
		description = "Change the color of the flash.",
		position = 19,
		keyName = "flashColor",
		section = misc
	)
	default Color flashColor()
	{
		return new Color(255, 0, 0, 70);
	}

	// Mirror mode

	@ConfigItem(
		name = "Mirror Mode",
		keyName = "mirrorMode",
		description = "Enable mirror mode overlay rendering.",
		position = 20
	)
	default boolean mirrorMode()
	{
		return false;
	}

	// Constants

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
}
