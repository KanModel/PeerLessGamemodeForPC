package com.xingyi.c01.SettingManager;
import org.bukkit.configuration.file.*;
import java.io.*;

public class GConfigManager
{
	private static GConfigManager instance=new GConfigManager();
	public static GConfigManager getInstance()
	{
		return instance;
	}
	public FileConfiguration loadGeneralConfig(File f)
	{
		if(!f.exists())
		{
		
		}
		else{
			return YamlConfiguration.loadConfiguration(f);
		}
		return YamlConfiguration.loadConfiguration(f);
	}
}
