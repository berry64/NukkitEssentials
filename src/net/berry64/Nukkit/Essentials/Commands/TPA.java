package net.berry64.Nukkit.Essentials.Commands;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;

public class TPA {
	public static void runCommand(CommandSender s, String[] args){
		if(s.hasPermission("Ness.tpa")){
			if(s instanceof Player){
				if(args.length >= 1){
					Player p = CommandMain.getOnilePlayer(args[0]);
					if(p != null){
						TPList.sendRequest(p, (Player)s, TPType.TPA);
						s.sendMessage(msgs.TPA_SENT.replaceAll("{player}", p.getName()));
					} else {
						s.sendMessage(msgs.TPA_NO_PLAYER.replaceAll("{player}", args[0]));
					}
				} else {
					s.sendMessage(msgs.TPA_USAGE);
				}
			} else {
				s.sendMessage(msgs.NEED_TO_BE_PLAYER);
			}
		} else {
			s.sendMessage(msgs.NO_PERM);
		}
	}
}
