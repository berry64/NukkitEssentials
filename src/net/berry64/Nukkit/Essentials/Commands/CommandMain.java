package net.berry64.Nukkit.Essentials.Commands;

import cn.nukkit.IPlayer;
import cn.nukkit.Player;
import net.berry64.Nukkit.Essentials.NukkitEssentials;

public class CommandMain{
	static NukkitEssentials pl;
	public static void init(NukkitEssentials s){
		pl = s;
	}
	public static Player getOnilePlayer(String name){
		IPlayer op = pl.getServer().getOfflinePlayer(name);
		if(op.isOnline()){
			return (Player)op;
		} else {
			return null;
		}
	}
}
