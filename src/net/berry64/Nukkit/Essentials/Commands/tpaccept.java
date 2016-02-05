package net.berry64.Nukkit.Essentials.Commands;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;

public class tpaccept {
	public static void runCommand(CommandSender s, String[] args){
		if(s.hasPermission("Ness.tpaccept")){
			if(s instanceof Player){
				Player p = (Player)s;
				if(TPList.isPending(p)){
					TPK data = TPList.getData(p);
					Player sender = data.getSender();
					TPList.acceptRequest(p);
					sender.sendMessage(msgs.TPING.replaceAll("{0}", p.getName()));
					p.sendMessage(msgs.TPACCEPTED.replaceAll("{0}", sender.getName()));
				} else {
					s.sendMessage(msgs.TPACCEPT_NO_REQUEST);
				}
			} else {
				s.sendMessage(msgs.NEED_TO_BE_PLAYER);
			}
		} else {
			s.sendMessage(msgs.NO_PERM);
		}
	}
}
