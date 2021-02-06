package net.runelite.client.plugins.hideunder;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("hideunder")
public interface HideUnderConfig extends Config
{

	@ConfigItem(
		position = 0,
		keyName = "useRenderself",
		name = "Use Render Self",
		description = "This will use Renderself."
	)
	default boolean useRenderself()
	{
		return false;
	}

	@ConfigItem(
		position = 1,
		keyName = "useEntityHider",
		name = "Use Entity Hider",
		description = "This will use Entity Hider."
	)
	default boolean useEntityHider()
	{
		return true;
	}
}
