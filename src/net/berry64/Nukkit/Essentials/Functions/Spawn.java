package net.berry64.Nukkit.Essentials.Functions;

import cn.nukkit.Player;
import cn.nukkit.level.Level;
import cn.nukkit.level.Location;
import cn.nukkit.math.Vector3;
import net.berry64.Nukkit.Essentials.NukkitEssentials;
import net.berry64.Nukkit.Essentials.Events.msg;

public class Spawn {
	private static NukkitEssentials plu;
	private static Location location;
	public static void load(NukkitEssentials pl){
		plu = pl;
		double x = pl.getConfig().getDouble("Spawn.default.X");
		double y = pl.getConfig().getDouble("Spawn.default.Y");
		double z = pl.getConfig().getDouble("Spawn.default.Z");
		double pitch = pl.getConfig().getDouble("Spawn.default.Pitch");
		double yaw = pl.getConfig().getDouble("Spawn.default.Yaw");
		Level l = pl.getServer().getLevelByName(pl.getConfig().getString("Spawn.default.Level"));
		location = new Location(x,y,z,pitch,yaw,l);
	}
	
	public static void set(Player p){
		plu.getConfig().set("Spawn.default.X", p.getLocation().getX());
		plu.getConfig().set("Spawn.default.Y", p.getLocation().getY());
		plu.getConfig().set("Spawn.default.Z", p.getLocation().getZ());
		plu.getConfig().set("Spawn.default.Level", p.getLocation().level.toString());
		plu.getConfig().set("Spawn.default.Pitch", p.getLocation().getPitch());
		plu.getConfig().set("Spawn.default.Yaw", p.getLocation().getYaw());
		plu.saveConfig();
	}
	
	public static Location getLoc(){
		return location;
	}
	public static String getLocAsString(){
		double x = location.getX();
		double y = location.getY();
		double z = location.getZ();
		String l = location.getLevel().getName();
		return (x+", "+y+", "+z+msg.AT.getContent()+l);
	}
	public static Vector3 getLocAsV3(){
		return new Vector3(location.getX(), location.getY(), location.getZ());
	}
}
