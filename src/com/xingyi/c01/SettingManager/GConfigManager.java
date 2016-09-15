package com.xingyi.c01.SettingManager;
import org.bukkit.configuration.file.*;
import java.io.*;
import com.xingyi.c01.PGException.*;

public class GConfigManager
{
	private static GConfigManager instance=new GConfigManager();
	public static GConfigManager getInstance()
	{
		return instance;
	}
	public FileConfiguration loadGeneralConfig(File f) throws UnableAccessGeneralConfigException
	{
		if(!f.exists())
		{
			throw new UnableAccessGeneralConfigException("无法控制通用设置文件");
		}
		return YamlConfiguration.loadConfiguration(f);
	}
}
