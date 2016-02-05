package net.berry64.Nukkit.Essentials.Commands;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import net.berry64.Nukkit.Essentials.NukkitEssentials;
import net.berry64.Nukkit.Essentials.Functions.Spawn;

public class Spawncmd {
	public static void runCommand(CommandSender s, String[] args, NukkitEssentials pl){
		if(s.hasPermission("Ness.spawn")){
			if(s instanceof Player){
				((Player) s).teleport(Spawn.getLoc());
				s.sendMessage(msgs.SPAWN_TELEPORTING);
			} else {
				s.sendMessage(msgs.SPAWN_CONSOLE
						.replaceAll("{loc}", Spawn.getLocAsString()));
			}
		} else {
			s.sendMessage(msgs.NO_PERM);
		}
	}
}
