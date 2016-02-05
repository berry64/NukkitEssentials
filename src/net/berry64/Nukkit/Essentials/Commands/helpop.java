package net.berry64.Nukkit.Essentials.Commands;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import net.berry64.Nukkit.Essentials.NukkitEssentials;

public class helpop {
	public static void runCommand(CommandSender s, String[] args, NukkitEssentials pl){
		if(s.hasPermission("Ness.helpop")){
			if(s instanceof Player){
				if(args.length >= 1){
					String msg = args[0];
					// TODO - Allow space
					for(String key:pl.getServer().getOnlinePlayers().keySet()){
						Player p = pl.getServer().getOnlinePlayers().get(key);
						if(p.isOp()){
							p.sendMessage(msgs.HELPOP
									.replaceAll("{0}", s.getName())
									.replaceAll("{1}", msg.replaceAll("&", "§")));
						}
					}
				}
			} else {
				s.sendMessage(msgs.NEED_TO_BE_PLAYER);
			}
		} else {
			s.sendMessage(msgs.NO_PERM);
		}
	}
}
