package com.xingyi.c01.SettingManager;
import org.bukkit.configuration.file.*;
import java.io.*;
import com.xingyi.c01.PGException.*;
import com.xingyi.c01.API.*;

public class GConfigManager
{
	private static GConfigManager instance=new GConfigManager();
	private FileConfiguration config;
	public static GConfigManager getInstance()
	{
		return instance;
	}
	public FileConfiguration loadGeneralConfig(File f) throws UnableAccessGeneralConfigException
	{
		if(!f.exists())
		{
			GeneralPluginProvider.getInstance().saveDefaultConfig();
			throw new UnableAccessGeneralConfigException("无法控制通用设置文件");
		}
		FileConfiguration ff=YamlConfiguration.loadConfiguration(f);
		config=ff;
		return ff;
	}
}
