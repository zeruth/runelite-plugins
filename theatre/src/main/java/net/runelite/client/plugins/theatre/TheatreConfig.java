/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre;

import java.awt.Color;
import java.awt.Font;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup("Theatre")
public interface TheatreConfig extends Config
{
	//Config Sections
	@ConfigSection(
		name = "General",
		description = "General Configurartion",
		position = 0,
		keyName = "general"
	)
	String general = "General";
	
	@ConfigSection(
		name = "Maiden",
		description = "Maiden's Configuration",
		position = 1,
		keyName = "maiden"
	)
	String maiden = "Maiden";
	
	@ConfigSection(
		name = "Bloat",
		description = "Bloat's Configuration",
		position = 2,
		keyName = "bloat"
	)
	String bloat = "Bloat";
	
	@ConfigSection(
		name = "Nylocas",
		description = "Nylocas' Configuration",
		position = 3,
		keyName = "nylocas"
	)
	String nylocas = "Nylocas";
	
	@ConfigSection(
		name = "Sotetseg",
		description = "Sotetseg's Configuration",
		position = 4,
		keyName = "sotetseg"
	)
	String sotetseg = "Sotetseg";
	
	@ConfigSection(
		name = "Xarpus",
		description = "Xarpus's Configuration",
		position = 5,
		keyName = "xarpus"
	)
	String xarpus = "Xarpus";
	
	@ConfigSection(
		name = "Verzik",
		description = "Verzik's Configuration",
		position = 6,
		keyName = "verzik"
	)
	String verzik = "Verzik";

	//General Section
	@Range(max = 20)
	@ConfigItem(
		position = 0,
		keyName = "theatreFontSize",
		name = "Theatre Overlay Font Size",
		description = "Sets the font size for all theatre text overlays.",
		section = general
	)
	default int theatreFontSize()
	{
		return 12;
	}

	@ConfigItem(
		keyName = "fontStyle",
		name = "Font Style",
		description = "Bold/Italics/Plain.",
		position = 1,
		section = general
	)
	default FontStyle fontStyle()
	{
		return FontStyle.BOLD;
	}

	@ConfigItem(
		name = "Enable mirror mode",
		description = "Toggle mirror mode compatibility.",
		position = 2,
		keyName = "mirrorMode",
		section = general
	)
	default boolean mirrorMode()
	{
		return false;
	}

	//Maiden Section
	@ConfigItem(
		position = 0,
		keyName = "maidenBlood",
		name = "Maiden Blood Attack Marker",
		description = "Highlights Maiden's Blood Pools.",
		section = maiden
	)
	default boolean maidenBlood()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "maidenSpawns",
		name = "Maiden Blood Spawns Marker",
		description = "Highlights Maiden Blood Spawns (Tomatoes).",
		section = maiden
	)
	default boolean maidenSpawns()
	{
		return true;
	}

	@ConfigItem(
		position = 2,
		keyName = "maidenReds",
		name = "Maiden Reds Health Overlay",
		description = "Displays the health of each red crab.",
		section = maiden
	)
	default boolean maidenRedsHealth()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "maidenRedsDistance",
		name = "Maiden Reds Distance Overlay",
		description = "Displays the distance of each red crab to reach Maiden.",
		section = maiden
	)
	default boolean maidenRedsDistance()
	{
		return true;
	}

	@ConfigItem(
		position = 4,
		keyName = "MaidenTickCounter",
		name = "Maiden Tank Tick Counter",
		description = "Displays the tick counter for when she decides who to choose for tanking.",
		section = maiden
	)
	default boolean maidenTickCounter()
	{
		return true;
	}

	//Bloat Section
	@ConfigItem(
		position = 0,
		keyName = "bloatIndicator",
		name = "Bloat Tile Indicator",
		description = "Highlights Bloat's Tile.",
		section = bloat
	)
	default boolean bloatIndicator()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
		position = 1,
		keyName = "bloatIndicatorColorUP",
		name = "Bloat Indicator Color - UP",
		description = "Select a color for when Bloat is UP.",
		section = bloat
	)
	default Color bloatIndicatorColorUP()
	{
		return Color.CYAN;
	}

	@Alpha
	@ConfigItem(
		position = 2,
		keyName = "bloatIndicatorColorTHRESH",
		name = "Bloat Indicator Color - THRESHOLD",
		description = "Select a color for when Bloat UP and goes over 37 ticks, which allows you to know when he can go down.",
		section = bloat
	)
	default Color bloatIndicatorColorTHRESH()
	{
		return Color.ORANGE;
	}

	@Alpha
	@ConfigItem(
		position = 3,
		keyName = "bloatIndicatorColorDOWN",
		name = "Bloat Indicator Color - DOWN",
		description = "Select a color for when Bloat is DOWN.",
		section = bloat
	)
	default Color bloatIndicatorColorDOWN()
	{
		return Color.WHITE;
	}

	@Alpha
	@ConfigItem(
		position = 4,
		keyName = "bloatIndicatorColorWARN",
		name = "Bloat Indicator Color - WARN",
		description = "Select a color for when Bloat is DOWN and about to get UP.",
		section = bloat
	)
	default Color bloatIndicatorColorWARN()
	{
		return Color.RED;
	}

	@ConfigItem(
		position = 5,
		keyName = "bloatTickCounter",
		name = "Bloat Tick Counter",
		description = "Displays the tick counter for how long Bloat has been DOWN or UP.",
		section = bloat
	)
	default boolean bloatTickCounter()
	{
		return true;
	}

	@ConfigItem(
		position = 6,
		keyName = "bloatHands",
		name = "Bloat Hands Overlay",
		description = "Highlights the tiles where Bloat's hands will fall.",
		section = bloat
	)
	default boolean bloatHands()
	{
		return false;
	}

	@Alpha
	@ConfigItem(
		position = 7,
		keyName = "bloatHandsColor",
		name = "Bloat Hands Overlay Color",
		description = "Select a color for the Bloat Hands Overlay to be.",
		section = bloat
	)
	default Color bloatHandsColor()
	{
		return Color.CYAN;
	}

	@Range(max = 10)
	@ConfigItem(
		position = 8,
		keyName = "bloatHandsWidth",
		name = "Bloat Hands Overlay Thickness",
		description = "Sets the stroke width of the tile overlay where the hands fall. (BIGGER = THICKER).",
		section = bloat
	)
	default int bloatHandsWidth()
	{
		return 2;
	}

	//Nylocas Section
	@ConfigItem(
		position = 0,
		keyName = "nyloPillars",
		name = "Nylocas Pillar Health Overlay",
		description = "Displays the health percentage of the pillars.",
		section = nylocas
	)
	default boolean nyloPillars()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "nyloExplosions",
		name = "Nylocas Explosion Warning",
		description = "Highlights a Nylocas that is about to explode.",
		section = nylocas
	)
	default boolean nyloExplosions()
	{
		return true;
	}

	@Range(max = 52)
	@ConfigItem(
		position = 2,
		keyName = "nyloExplosionDisplayTicks",
		name = "Nylocas Display Last Ticks",
		description = "Displays the last 'x' amount of ticks for a Nylocas. (ex: to see the last 10 ticks, you set it to 10).",
		section = nylocas
	)
	default int nyloExplosionDisplayTicks()
	{
		return 46;
	}

	@ConfigItem(
		position = 3,
		keyName = "nyloExplosionDisplayStyle",
		name = "Nylocas Display Explosion Style",
		description = "How to display when a nylocas is about to explode.",
		section = nylocas
	)
	default EXPLOSIVENYLORENDERSTYLE nyloExplosionOverlayStyle()
	{
		return EXPLOSIVENYLORENDERSTYLE.RECOLOR_TICK;
	}

	@ConfigItem(
		position = 4,
		keyName = "nyloTimeAlive",
		name = "Nylocas Tick Time Alive",
		description = "Displays the tick counter of each nylocas spawn (Explodes on 52).",
		section = nylocas
	)
	default boolean nyloTimeAlive()
	{
		return false;
	}

	@ConfigItem(
		position = 5,
		keyName = "nyloTimeAliveCountStyle",
		name = "Nylocas Tick Time Alive Style",
		description = "Count up or Count down options on the tick time alive.",
		section = nylocas
	)
	default NYLOTIMEALIVE nyloTimeAliveCountStyle()
	{
		return NYLOTIMEALIVE.COUNTDOWN;
	}

	@ConfigItem(
		position = 6,
		keyName = "nyloRecolorMenu",
		name = "Nylocas Recolor Menu Options",
		description = "Recolors the menu options of each Nylocas to it's respective attack style.",
		section = nylocas
	)
	default boolean nyloRecolorMenu()
	{
		return false;
	}

	@ConfigItem(
		position = 7,
		keyName = "nyloHighlightOverlay",
		name = "Nylocas Highlight Overlay",
		description = "Select your role to highlight respective Nylocas to attack.",
		section = nylocas
	)
	default boolean nyloHighlightOverlay()
	{
		return false;
	}

	@ConfigItem(
		position = 8,
		keyName = "nyloAliveCounter",
		name = "Nylocas Alive Counter Panel",
		description = "Displays how many Nylocas are currently alive.",
		section = nylocas
	)
	default boolean nyloAlivePanel()
	{
		return false;
	}

	@ConfigItem(
		position = 9,
		keyName = "nyloAggressiveOverlay",
		name = "Highlight Aggressive Nylocas",
		description = "Highlights aggressive Nylocas after they spawn.",
		section = nylocas
	)
	default boolean nyloAggressiveOverlay()
	{
		return true;
	}

	@ConfigItem(
		position = 10,
		keyName = "nyloAggressiveOverlayStyle",
		name = "Highlight Aggressive Nylocas Style",
		description = "Highlight style for aggressive Nylocas after they spawn.",
		section = nylocas
	)
	default AGGRESSIVENYLORENDERSTYLE nyloAggressiveOverlayStyle()
	{
		return AGGRESSIVENYLORENDERSTYLE.TILE;
	}


	@ConfigItem(
		position = 11,
		keyName = "removeNyloEntries",
		name = "Remove Attack Options",
		description = "Removes the attack options for Nylocas immune to your current attack style.",
		section = nylocas
	)
	default boolean removeNyloEntries()
	{
		return true;
	}

	@ConfigItem(
		position = 12,
		keyName = "nylocasWavesHelper",
		name = "Nylocas Waves Helper",
		description = "Overlay's squares with wave numbers on nylo entry bridges for upcoming nylos",
		section = nylocas
	)
	default boolean nyloWavesHelper()
	{
		return false;
	}

	@ConfigItem(
		position = 13,
		keyName = "nyloInstanceTimer",
		name = "Nylocas Instance Timer",
		description = "Displays an instance timer when the next set will potentially spawn - ENTER ON ZERO.",
		section = nylocas
	)
	default boolean nyloInstanceTimer()
	{
		return false;
	}

	@ConfigItem(
		position = 14,
		keyName = "nyloStallMessage",
		name = "Nylocas Stall Wave Messages",
		description = "Sends a chat message when you have stalled the next wave of Nylocas to spawn due to being capped.",
		section = nylocas
	)
	default boolean nyloStallMessage()
	{
		return false;
	}

	@ConfigItem(
		position = 15,
		keyName = "nyloBossAttackTickCount",
		name = "Nylocas Boss Attack Tick Counter",
		description = "Displays the ticks left until the Nylocas Boss will attack next (LEFT-MOST).",
		section = nylocas
	)
	default boolean nyloBossAttackTickCount()
	{
		return false;
	}

	@ConfigItem(
		position = 16,
		keyName = "nyloBossSwitchTickCount",
		name = "Nylocas Boss Switch Tick Counter",
		description = "Displays the ticks left until the Nylocas Boss will switch next (MIDDLE).",
		section = nylocas
	)
	default boolean nyloBossSwitchTickCount()
	{
		return true;
	}

	@ConfigItem(
		position = 17,
		keyName = "nyloBossTotalTickCount",
		name = "Nylocas Boss Total Tick Counter",
		description = "Displays the total ticks since the Nylocas Boss has spawned (RIGHT-MOST).",
		section = nylocas
	)
	default boolean nyloBossTotalTickCount()
	{
		return false;
	}

	//Sotetseg Section
	@ConfigItem(
		position = 0,
		keyName = "sotetsegMaze",
		name = "Sotetseg Maze",
		description = "Memorizes Solo Mazes and displays tiles of other chosen players.",
		section = sotetseg
	)
	default boolean sotetsegMaze()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "sotetsegOrbAttacksTicks",
		name = "Sotetseg Small Attack Orb Ticks",
		description = "Displays the amount of ticks until it will hit you (change prayers when you see 1).",
		section = sotetseg
	)
	default boolean sotetsegOrbAttacksTicks()
	{
		return true;
	}

	@ConfigItem(
		position = 2,
		keyName = "sotetsegAutoAttacksTicks",
		name = "Sotetseg Auto Attack Ticks",
		description = "Displays a tick counter for when Sotetseg will attack next.",
		section = sotetseg
	)
	default boolean sotetsegAutoAttacksTicks()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "sotetsegBigOrbTicks",
		name = "Sotetseg Big Ball Tick Overlay",
		description = "Displays how many ticks until the ball will explode (eat when you see 0).",
		section = sotetseg
	)
	default boolean sotetsegBigOrbTicks()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
		position = 4,
		keyName = "sotetsegBigOrbTickColor",
		name = "Sotetseg Big Ball Tick Color",
		description = "Select a color for the Sotetseg Big Ball tick countdown text.",
		section = sotetseg
	)
	default Color sotetsegBigOrbTickColor()
	{
		return Color.WHITE;
	}

	@Alpha
	@ConfigItem(
		position = 5,
		keyName = "sotetsegBigOrbTileColor",
		name = "Sotetseg Big Ball Tile Color",
		description = "Select a color for the Sotetseg Big Ball tile color.",
		section = sotetseg
	)
	default Color sotetsegBigOrbTileColor()
	{
		return new Color(188, 74, 74);
	}

	//Xarpus Section
	@ConfigItem(
		position = 0,
		keyName = "xarpusInstanceTimer",
		name = "Xarpus Instance Timer",
		description = "Displays the Xarpus Instance timer to be tick efficient with the first spawn of an exhumed - ENTER ON ZERO.",
		section = xarpus
	)
	default boolean xarpusInstanceTimer()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "xarpusExhumed",
		name = "Xarpus Exhumed Markers",
		description = "Highlights the tiles of exhumed spawns.",
		section = xarpus
	)
	default boolean xarpusExhumed()
	{
		return true;
	}

	@ConfigItem(
		position = 2,
		keyName = "xarpusExhumedTick",
		name = "Xarpus Exhumed Ticks",
		description = "Displays how many ticks until the exhumeds will despawn.",
		section = xarpus
	)
	default boolean xarpusExhumedTick()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "xarpusTickP2",
		name = "Xarpus Attack Tick - P2",
		description = "Displays a tick counter for when Xarpus faces a new target to spit at.",
		section = xarpus
	)
	default boolean xarpusTickP2()
	{
		return true;
	}

	@ConfigItem(
		position = 4,
		keyName = "xarpusTickP3",
		name = "Xarpus Attack Tick - P3",
		description = "Displays a tick counter for when Xarpus will rotate.",
		section = xarpus
	)
	default boolean xarpusTickP3()
	{
		return true;
	}

	@ConfigItem(
		name = "Line of Sight",
		keyName = "xarpusLineOfSight",
		description = "Displays Xarpus's Line of Sight on P3<br>Melee Tiles: Displays only the melee tiles that Xarpus can see<br>Square: Displays the whole region that Xarpus can see",
		position = 5,
		section = xarpus
	)
	default XARPUS_LINE_OF_SIGHT xarpusLineOfSight()
	{
		return XARPUS_LINE_OF_SIGHT.OFF;
	}

	@Alpha
	@ConfigItem(
		name = "Line of Sight Color",
		keyName = "xarpusLineOfSightColor",
		description = "Customize the color for Xarpus's Line of Sight",
		position = 6,
		section = xarpus
	)
	default Color xarpusLineOfSightColor()
	{
		return Color.RED;
	}

	//Verzik Section
	@ConfigItem(
		position = 0,
		keyName = "verzikTileOverlay",
		name = "Verzik Tile Indicator",
		description = "Highlights Verzik's tile - If you are next to or inside of the indicator, you can be meleed.",
		section = verzik
	)
	default boolean verzikTileOverlay()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "verzikProjectiles",
		name = "Verzik Range Tile Markers",
		description = "Highlights the tiles of Verzik's range projectiles.",
		section = verzik
	)
	default boolean verzikProjectiles()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
		position = 2,
		keyName = "verzikProjectilesColor",
		name = "Verzik Range Tile Markers Color",
		description = "Select a color for the Verzik's Range Projectile Tile Overlay to be.",
		section = verzik
	)
	default Color verzikProjectilesColor()
	{
		return new Color(255, 0, 0, 50);
	}

	@ConfigItem(
		position = 3,
		keyName = "verzikDisplayTank",
		name = "Verzik Display Tank",
		description = "Highlights the tile of the player tanking to help clarify.",
		section = verzik
	)
	default boolean verzikDisplayTank()
	{
		return true;
	}

	@ConfigItem(
		position = 4,
		keyName = "VerzikRedHP",
		name = "Verzik Reds Health Overlay",
		description = "Displays the health of red crabs during Verzik.",
		section = verzik
	)
	default boolean verzikReds()
	{
		return true;
	}

	@ConfigItem(
		position = 5,
		keyName = "verzikAutosTick",
		name = "Verzik Attack Tick Counter",
		description = "Displays the ticks until Verzik will attack next.",
		section = verzik
	)
	default boolean verzikAutosTick()
	{
		return true;
	}

	@ConfigItem(
		position = 6,
		keyName = "verzikAttackCounter",
		name = "Verzik Attack Counter",
		description = "Displays Verzik's Attack Count (useful for when P2 reds as they despawn after the 7th attack).",
		section = verzik
	)
	default boolean verzikAttackCounter()
	{
		return true;
	}

	@ConfigItem(
		position = 7,
		keyName = "verzikTotalTickCounter",
		name = "Verzik Total Tick Counter",
		description = "Displays the total amount of ticks Verzik has been alive for.",
		section = verzik
	)
	default boolean verzikTotalTickCounter()
	{
		return true;
	}

	@ConfigItem(
		position = 8,
		keyName = "verzikNyloPersonalWarning",
		name = "Verzik Nylo Direct Aggro Warning",
		description = "Highlights the Nylocas that are targeting YOU and ONLY you.",
		section = verzik
	)
	default boolean verzikNyloPersonalWarning()
	{
		return true;
	}

	@ConfigItem(
		position = 9,
		keyName = "verzikNyloOtherWarning",
		name = "Verzik Nylo Indirect Aggro Warnings",
		description = "Highlights the Nylocas that are targeting OTHER players.",
		section = verzik
	)
	default boolean verzikNyloOtherWarning()
	{
		return true;
	}

	@ConfigItem(
		position = 10,
		keyName = "verzikNyloExplodeAOE",
		name = "Verzik Nylo Explosion Area",
		description = "Highlights the area of explosion for the Nylocas (Personal or Indirect Warnings MUST be enabled).",
		section = verzik
	)
	default boolean verzikNyloExplodeAOE()
	{
		return true;
	}

	@ConfigItem(
		position = 11,
		keyName = "verzikYellows",
		name = "Verzik Yellows Overlay",
		description = "Highlights the yellow pools and displays the amount of ticks until you can move away or tick eat.",
		section = verzik
	)
	default boolean verzikYellows()
	{
		return true;
	}

	@ConfigItem(
		position = 12,
		keyName = "verzikGreenBall",
		name = "Verzik Green Ball Tank",
		description = "Displays who the green ball is targeting.",
		section = verzik
	)
	default boolean verzikGreenBall()
	{
		return true;
	}

	@Alpha
	@ConfigItem(
		position = 13,
		keyName = "verzikGreenBallColor",
		name = "Verzik Green Ball Highlight Color",
		description = "Select a color for the Verzik's Green Ball Tile Overlay to be.",
		section = verzik
	)
	default Color verzikGreenBallColor()
	{
		return new Color(59, 140, 83);
	}

	@ConfigItem(
		position = 14,
		keyName = "verzikGreenBallMarker",
		name = "Verzik Green Ball Marker",
		description = "Choose between a tile or 3-by-3 area marker.",
		section = verzik
	)
	default VERZIKBALLTILE verzikGreenBallMarker()
	{
		return VERZIKBALLTILE.TILE;
	}

	@ConfigItem(
		position = 15,
		keyName = "verzikGreenBallTick",
		name = "Verzik Green Ball Tick",
		description = "Displays the number of ticks until the green ball nukes you.",
		section = verzik
	)
	default boolean verzikGreenBallTick()
	{
		return false;
	}

	@ConfigItem(
		position = 16,
		keyName = "lightningAttackHelper",
		name = "Lightning Attack Helper",
		description = "Displays the number of attacks before a lightning ball.",
		section = verzik
	)
	default boolean lightningAttackHelper()
	{
		return false;
	}

	@ConfigItem(
		position = 17,
		keyName = "lightningAttackTick",
		name = "Lightning Attack Tick",
		description = "Displays the number of ticks before a lightning ball hits you.",
		section = verzik
	)
	default boolean lightningAttackTick()
	{
		return false;
	}


	@ConfigItem(
		position = 18,
		keyName = "verzikTornado",
		name = "Verzik Personal Tornado Highlight",
		description = "Displays the tornado that is targeting you.",
		section = verzik
	)
	default boolean verzikTornado()
	{
		return true;
	}

	@ConfigItem(
		position = 19,
		keyName = "verzikPersonalTornadoOnly",
		name = "Verzik ONLY Highlight Personal",
		description = "Displays the tornado that is targeting you ONLY after it solves which one is targeting you.",
		section = verzik
	)
	default boolean verzikPersonalTornadoOnly()
	{
		return false;
	}

	@Alpha
	@ConfigItem(
		position = 20,
		keyName = "verzikTornadoColor",
		name = "Verzik Tornado Highlight Color",
		description = "Select a color for the Verzik Tornadoes Overlay to be.",
		section = verzik
	)
	default Color verzikTornadoColor()
	{
		return Color.RED;
	}

	//Miscellaneous Configuration Items
	@ConfigItem(
		keyName = "highlightMelee",
		name = "",
		description = "",
		hidden = true
	)
	default boolean getHighlightMeleeNylo()
	{
		return false;
	}

	@ConfigItem(
		keyName = "highlightMelee",
		name = "",
		description = "",
		hidden = true
	)
	void setHighlightMeleeNylo(boolean set);

	@ConfigItem(
		keyName = "highlightMage",
		name = "",
		description = "",
		hidden = true
	)
	default boolean getHighlightMageNylo()
	{
		return false;
	}

	@ConfigItem(
		keyName = "highlightMage",
		name = "",
		description = "",
		hidden = true
	)
	void setHighlightMageNylo(boolean set);

	@ConfigItem(
		keyName = "highlightRange",
		name = "",
		description = "",
		hidden = true
	)
	default boolean getHighlightRangeNylo()
	{
		return false;
	}

	@ConfigItem(
		keyName = "highlightRange",
		name = "",
		description = "",
		hidden = true
	)
	void setHighlightRangeNylo(boolean set);

	@Getter(AccessLevel.PACKAGE)
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
			return getName();
		}
	}

	enum NYLOTIMEALIVE
	{
		COUNTUP,
		COUNTDOWN
	}

	enum EXPLOSIVENYLORENDERSTYLE
	{
		TILE,
		RECOLOR_TICK
	}

	enum AGGRESSIVENYLORENDERSTYLE
	{
		TILE,
		HULL
	}

	enum XARPUS_LINE_OF_SIGHT
	{
		OFF,
		SQUARE,
		MELEE_TILES;
	}

	enum VERZIKBALLTILE
	{
		TILE,
		AREA
	}
}
