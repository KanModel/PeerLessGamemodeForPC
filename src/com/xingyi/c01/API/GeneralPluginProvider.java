package com.xingyi.c01.API;
import org.bukkit.plugin.*;
import java.io.*;
import org.bukkit.configuration.file.*;

public class GeneralPluginProvider
{
	private static GeneralPluginProvider instance = new GeneralPluginProvider();
	private Plugin plugin;
	public static GeneralPluginProvider getInstance()
	{
		return instance;
	}
	public void setUpPluginGetter(Plugin pl)
	{
		this.plugin = pl;
	}
	public File getDataFolder()
	{
		return this.plugin.getDataFolder();
	}
	public FileConfiguration getConfig()
	{
		return this.plugin.getConfig();
	}
	public void saveDefaultConfig()
	{
		this.plugin.saveDefaultConfig();
	}
//	FileConfiguration reloadSetting(){
//		return config = YamlConfiguration.loadConfiguration(configFile);
//	}
	public FileConfiguration reloadSetting(File file){
		return YamlConfiguration.loadConfiguration(file);
	}
}
