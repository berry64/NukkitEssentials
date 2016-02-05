package net.berry64.Nukkit.Essentials.Events;

import cn.nukkit.plugin.PluginManager;
import net.berry64.Nukkit.Essentials.NukkitEssentials;

public class EventMain{
	public static void load(NukkitEssentials l){
		PluginManager pm = l.getServer().getPluginManager();
		pm.registerEvents(new Join(l), l);
		pm.registerEvents(new PNB(l), l);
	}
}
