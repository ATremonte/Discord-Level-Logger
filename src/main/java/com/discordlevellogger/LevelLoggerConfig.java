package com.discordlevellogger;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("discordlevellogger")
public interface LevelLoggerConfig extends Config
{
	@ConfigItem(
			keyName = "webhook",
			name = "Webhook URL",
			description = "The Discord Webhook URL to send messages to"
	)
	String webhook();

	@ConfigItem(
			keyName = "sendScreenshot",
			name = "Send Screenshot",
			description = "Include a screenshot when levelling up"
	)
	default boolean sendScreenshot()
	{
		return false;
	}

	@ConfigItem(
			keyName = "minimumLevel",
			name = "Minimum level",
			description = "Levels greater than or equal to this value will send a message."
	)
	default int minLevel()
	{
		return 0;
	}
}
