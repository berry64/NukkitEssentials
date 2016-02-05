package net.berry64.Nukkit.Essentials.Commands;

public class msgscn{
	//UNUSED
	
	//General Strings
	public static String NO_PERM = "§c你没有足够的权限";
	public static String NEED_TO_BE_PLAYER = "§c只有玩家才可以使用这条命令!";
	
	//setspawn commands
	public static String SETSPAWN_SUCCESS = "§a成功设置出生点!";
	
	//spawn commands
	public static String SPAWN_CONSOLE = "§e当前出生点坐标: §6{loc}";
	public static String SPAWN_TELEPORTING = "§e正在传送至出生点";
	
	//TP commands
	public static String TPA_SENT = "§a已向 §6{player} §a发送传送请求";
	public static String TPA_USAGE = "§6使用方法: §c/tpa {目标玩家ID}";
	public static String TPA_NO_PLAYER = "§c玩家 §6{player} §c不存在/不在线!";
	public static String TPACCEPT_NO_REQUEST = "§c你没有待处理的请求";
	public static String TPING = "§e{0} §6同意了你的请求，正在传送";
	public static String TPACCEPTED = "§6你同意了 §e{0} §6的传送请求";
	public static String TPDENYED = "§a你拒绝了 §e{0} §a的传送请求";
	public static String TPDENYED_SENDER = "§c传送请求被拒绝";
	public static String TPREQUEST_SENT = "§a成功发送传送请求!";
	public static String TP_INCOME_FIRST_LINE = "§e{0} §6想要传送到你这里";
	public static String[] TP_INCOME_REQUEST = new String[]{
			"§6输入: §a/tpaccept §6来接受请求",
			"§d或者",
			"§6输入: §c/tpdeny §6来拒绝请求"
	};
	
	//helpop
	public static String HELPOP = "§c[helpop] §6{0}: §c{1}";
	
	//ness
	public static String NESS_HELP = "§c/ness <reload>";
}
