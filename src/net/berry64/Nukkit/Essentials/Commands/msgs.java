package net.berry64.Nukkit.Essentials.Commands;

public class msgs {
  //TODO - USE A LANGUAGE FILE
  
	//Genral Strings
	public static String NO_PERM = "§cYou do not have enough permissionsn to do so.";
	public static String NEED_TO_BE_PLAYER = "§cYou have to be a player to use this command!";
	
	//setspawn commands
	public static String SETSPAWN_SUCCESS = "§aSuccessfully setted spawn point to current location!";
	
	//spawn commands
	public static String SPAWN_CONSOLE = "§eSpawnPoint location: §6{loc}";
	public static String SPAWN_TELEPORTING = "§eTeleporting to Spawn....";
	
	//TP commands
	public static String TPA_SENT = "§aSent request to Player: §6{player}";
	public static String TPA_USAGE = "§6Please Use: §c/tpa {target player ID}";
	public static String TPA_NO_PLAYER = "§cPlayer §6{player} §ccannot be found!";
	public static String TPACCEPT_NO_REQUEST = "§cYou do not have any pending requests";
	public static String TPING = "§e{0} §6accepted your request, teleporting...";
	public static String TPACCEPTED = "§6You accepted §e{0}'s §6teleport request";
	public static String TPDENYED = "§aYou denied §e{0}'s §ateleport request";
	public static String TPDENYED_SENDER = "§cYour request has been denied";
	public static String TPREQUEST_SENT = "§aRequest Sent!";
	public static String TP_INCOME_FIRST_LINE = "§e{0} §6Wants to teleport to you";
	public static String[] TP_INCOME_REQUEST = new String[]{
			"§6Use: §a/tpaccept §6To accept request",
			"§dOr",
			"§c/tpdeny §6to deny the request"
	};
	
	//helpop
	public static String HELPOP = "§c[helpop] §6{0}: §c{1}";
	
	//ness
	public static String NESS_HELP = "§c/ness <reload>";
}
