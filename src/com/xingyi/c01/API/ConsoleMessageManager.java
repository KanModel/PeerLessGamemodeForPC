package com.xingyi.c01.API;
import org.bukkit.*;

public class ConsoleMessageManager
{
	private static ConsoleMessageManager instance=new ConsoleMessageManager();
	private static ChatColor color;
	public static ConsoleMessageManager getInstance()
	{
		return instance;
	}
	public void setUp(ChatColor c)
	{
		this.color=c;
	}
	public void send(String a)
	{
		Bukkit.getConsoleSender().sendMessage(color+a);
	}
}
