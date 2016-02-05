package net.berry64.Nukkit.Essentials.Functions;

import net.berry64.Nukkit.Essentials.NukkitEssentials;

public class SpawnProtect {
	private static int range;
	private static boolean interact_cancel, warni, warnb, enable= false;
	public static void init(NukkitEssentials pl){
		enable = pl.getConfig().getBoolean("Protect.Spawn.Enable");
		if(enable){
			range = pl.getConfig().getInt("Protect.Spawn.Range");
			interact_cancel = pl.getConfig().getBoolean("Protect.Spawn.DisableInteract");
			warni = pl.getConfig().getBoolean("Protect.Spawn.WarnOnInteract");
			warnb = pl.getConfig().getBoolean("Protect.Spawn.WarnOnBuild");
		}
	}
	
	public static Integer getRange(){
		return range;
	}
	public static boolean enabled(){
		return enable;
	}
	public static boolean cancelInteract(){
		return interact_cancel;
	}
	public static boolean warnInteract(){
		return warni;
	}
	public static boolean warnBuild(){
		return warnb;
	}
}
