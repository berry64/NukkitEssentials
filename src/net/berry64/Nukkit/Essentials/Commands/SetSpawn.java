package net.berry64.Nukkit.Essentials.Commands;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import net.berry64.Nukkit.Essentials.NukkitEssentials;
import net.berry64.Nukkit.Essentials.Functions.Spawn;

public class SetSpawn {
	public static void runCommand(CommandSender s, String[] args, NukkitEssentials pl){
		if(s.hasPermission("Ness.setspawn")){
			if(s instanceof Player){
				Player p = (Player)s;
				Spawn.set(p);
				p.sendMessage(msgs.SETSPAWN_SUCCESS);
			} else {
				s.sendMessage(msgs.NEED_TO_BE_PLAYER);
			}
		} else {
			s.sendMessage(msgs.NO_PERM);
		}
	}
}
