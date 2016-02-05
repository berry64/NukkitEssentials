package net.berry64.Nukkit.Essentials.Commands;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;

public class tpdeny {
	public static void runCommand(CommandSender s, String[] args){
		if(s.hasPermission("Ness.tpdeny")){
			if(s instanceof Player){
				Player p = (Player)s;
				if(TPList.isPending(p)){
					TPList.getData(p).getSender().sendMessage(msgs.TPDENYED_SENDER);
					p.sendMessage(msgs.TPDENYED.replaceAll("{0}", TPList.getData(p).getSender().getName()));
					TPList.denyRequest(p);
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
