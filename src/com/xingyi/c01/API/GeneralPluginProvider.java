package com.xingyi.c01.API;
import org.bukkit.plugin.*;
import java.io.*;
import org.bukkit.configuration.file.*;

public class GeneralPluginProvider
{
	private static GeneralPluginProvider instance=new GeneralPluginProvider();
	private Plugin p;
	public static GeneralPluginProvider getInstance()
	{
		return instance;
	}
	public void setUpPluginGetter(Plugin pl)
	{
		this.p=pl;
	}
	public File getDataFolder()
	{
		return this.p.getDataFolder();
	}
	public FileConfiguration getConfig()
	{
		return this.p.getConfig();
	}
	public void saveDefaultConfig()
	{
		this.p.saveDefaultConfig();
	}
}
