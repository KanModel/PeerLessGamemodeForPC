package com.xingyi.c01.Features.Listener;

import com.xingyi.c01.PeerLessGamemodeForPC;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

/**
 * Created by kgdwhsk on 2016/9/19.
 */
public class SpeakCost implements Listener {

    private FileConfiguration config;

    public SpeakCost(PeerLessGamemodeForPC peerLessGamemodeForPC){
        config = peerLessGamemodeForPC.getMyConfig();
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent asyncPlayerChatEvent) {
        Player Player = asyncPlayerChatEvent.getPlayer();
        int ChatCost = config.getInt("defaultSpeakCost");
        if (!Player.isOp()) {
            Player.setFoodLevel(Player.getFoodLevel() - ChatCost);
//            Player.sendMessage("你扣饥饿了！");
        }
    }
}
