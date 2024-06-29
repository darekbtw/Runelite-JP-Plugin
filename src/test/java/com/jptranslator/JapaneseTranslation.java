package com.jptranslator;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class JapaneseTranslation
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(JapanesePlugin.class);
		RuneLite.main(args);
	}
}