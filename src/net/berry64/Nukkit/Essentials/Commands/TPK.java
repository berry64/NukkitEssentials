package net.berry64.Nukkit.Essentials.Commands;

import cn.nukkit.Player;

public class TPK {
	private TPType type;
	private Player target;
	private Player sender;
	
	public TPK(Player s, Player t, TPType tpe){
		type = tpe;
		target = t;
		sender = s;
	}
	public Player getSender(){
		return sender;
	}
	public Player getTarget(){
		return target;
	}
	public TPType getType(){
		return type;
	}
}
