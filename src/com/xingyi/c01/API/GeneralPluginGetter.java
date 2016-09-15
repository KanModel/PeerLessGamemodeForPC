package com.xingyi.c01.API;
import org.bukkit.plugin.*;

public class GeneralPluginGetter
{
	private static GeneralPluginGetter instance=new GeneralPluginGetter();
	private Plugin p;
	public static GeneralPluginGetter getInstance()
	{
		return instance;
	}
	public void setUpPluginGetter(Plugin pl)
	{
		this.p=pl;
	}
}
