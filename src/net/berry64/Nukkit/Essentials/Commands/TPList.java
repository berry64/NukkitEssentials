package net.berry64.Nukkit.Essentials.Commands;

import java.util.HashMap;
import java.util.Map;

import cn.nukkit.Player;

public class TPList {
	private static Map<Player, TPK> tp = new HashMap<>();
	
	public static boolean isPending(Player target){
		return tp.containsKey(target);
	}
	public static void sendRequest(Player target, Player sender, TPType type){
		tp.remove(target);
		tp.put(target, new TPK(target,sender,type));
	}
	public static void denyRequest(Player target){
		tp.remove(target);
	}
	public static void acceptRequest(Player target){
		TPK data = tp.get(target);
		if(data.getType() == TPType.TPA){
			Player sender = data.getSender();
			Player s = CommandMain.getOnilePlayer(sender.getName());
			Player t = CommandMain.getOnilePlayer(target.getName());
			if(s != null && t != null){
				s.teleport(t.getLocation());
			}
			tp.remove(target);
		} else if (data.getType() == TPType.TPAHERE){
			Player sender = data.getSender();
			Player s = CommandMain.getOnilePlayer(sender.getName());
			Player t = CommandMain.getOnilePlayer(target.getName());
			if(s != null && t != null){
				t.teleport(s.getLocation());
			}
			tp.remove(target);
		} else {
			System.out.println("INTERNAL ERROR HAS OCCURED");
			System.out.println("TPType is neither TPA or TPAHERE");
			tp.remove(target);
		}
	}
	public static TPK getData(Player target){
		return tp.get(target);
	}
}
