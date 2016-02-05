package net.berry64.Nukkit.Essentials.Events;

import java.util.List;

import cn.nukkit.command.CommandSender;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.TextContainer;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerQuitEvent;
import net.berry64.Nukkit.Essentials.NukkitEssentials;
import net.berry64.Nukkit.Essentials.Commands.Spawncmd;

public class Join implements Listener {
	NukkitEssentials pl;
	public Join(NukkitEssentials e){
		pl = e;
	}
	
	@SuppressWarnings("unchecked")
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent evt){
		Boolean b = (Boolean)pl.getConfig().get("TeleportLogin");
		String s = (String)pl.getConfig().get("JoinMessage");
		if(s != null){
			if(!s.equalsIgnoreCase("none")){
				evt.setJoinMessage(new TextContainer(s
						.replaceAll("&", "§")
						.replaceAll("%player", evt.getPlayer().getDisplayName())));
				List<String> p = (List<String>)pl.getConfig().get("MOTD");
				if(p != null){
					for(String k: p){
						evt.getPlayer().sendMessage(k
								.replaceAll("&", "§")
								.replaceAll("%player", evt.getPlayer().getDisplayName()));
					}
				}
			} else {
				evt.setJoinMessage(new TextContainer(""));
			}
		}
		if(b){
			Spawncmd.runCommand((CommandSender)evt.getPlayer(), new String[]{}, pl);
		}
	}
	
	@SuppressWarnings("unchecked")
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent evt){
		String s = (String)pl.getConfig().get("QuitMessage");
		if(s != null){
			if(!s.equalsIgnoreCase("none")){
				evt.setQuitMessage(new TextContainer(s
						.replaceAll("&", "§")
						.replaceAll("%pleyer", evt.getPlayer().getDisplayName())));
				List<String> p = (List<String>)pl.getConfig().get("MOTD");
				if(p != null){
					for(String k: p){
						evt.getPlayer().sendMessage(k
								.replaceAll("&", "§")
								.replaceAll("%player", evt.getPlayer().getDisplayName()));
					}
				}
			} else {
				evt.setQuitMessage(new TextContainer(""));
			}
		}
	}
}
