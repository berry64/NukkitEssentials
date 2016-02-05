package net.berry64.Nukkit.Essentials;

import java.io.File;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandExecutor;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;
import net.berry64.Nukkit.Essentials.Commands.*;
import net.berry64.Nukkit.Essentials.Events.EventMain;

public class NukkitEssentials extends PluginBase implements CommandExecutor{
	@Override
	public void onEnable(){
		loadConfig();
		getLogger().info("Initializing Nukkit Essentials");
		getLogger().info("A plugin made by berry64.......");
		getLogger().info("=======================");
		EventMain.load(this);
	}
	private void loadConfig(){
		File f = new File(this.getDataFolder(), "config.yml");
		if(f.exists()){
			this.reloadConfig();
		} else {
			this.saveDefaultConfig();
		}
	}
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		switch(cmd.getName().toLowerCase())
		{
		case"setspawn":SetSpawn.runCommand(s, args, this);break;
		case"helpop":helpop.runCommand(s, args, this);break;
		case"spawn":Spawncmd.runCommand(s, args, this);break;
		case"tpa":TPA.runCommand(s, args);break;
		case"tpaccept":tpaccept.runCommand(s, args);break;
		case"tpdeny":tpdeny.runCommand(s, args);break;
		}
		return true;
	}
}
