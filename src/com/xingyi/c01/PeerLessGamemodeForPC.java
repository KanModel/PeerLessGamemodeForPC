package com.xingyi.c01;

import java.io.File;
import java.util.*;

import com.xingyi.c01.Features.Listener.SpeakCost;
import com.xingyi.c01.PGException.UnableAccessGeneralConfigException;
import com.xingyi.c01.SettingManager.GConfigManager;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.*;
import com.xingyi.c01.API.*;

public class PeerLessGamemodeForPC extends JavaPlugin
{
	public static final String PLG = "[PeerLessGamemode]";
	public static FileConfiguration config;
	public static ConsoleMessageManager cmm;
	public static GConfigManager gConfigManager;

	@Override
	public void onEnable()
	{
		setUpPlugin();
	}

	@Override
	public void onDisable()
	{
		gConfigManager.saveConfig();
	}
	public void setUpListener()
	{
		this.getServer().getPluginManager().registerEvents(new SpeakCost(this),this);
		cmm.send(PLG + "Set up Listener succeed!");
//		this.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + PLG + "Set up Listener succeed!");
	}
	public void setUpSettingManager(){
		cmm = new ConsoleMessageManager();
		cmm.setUp(ChatColor.GREEN);
		gConfigManager = GConfigManager.getInstance();
		gConfigManager.saveConfig();
		try {
			config = gConfigManager.loadGeneralConfig(new File("config.yml"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void setUpAPI()
	{
		GeneralPluginProvider.getInstance().setUpPluginGetter(this);
		cmm.send(PLG + "Set up API succeed!");
//		this.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + PLG + "Set up API succeed!");
	}
	public void setUpPlugin()
	{
		setUpSettingManager();
		setUpAPI();
		setUpListener();
	}

	public FileConfiguration getMyConfig() {
		return config;
	}
}
