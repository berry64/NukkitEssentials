package net.berry64.Nukkit.Essentials.Events;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.block.BlockBreakEvent;
import cn.nukkit.event.block.BlockPlaceEvent;
import cn.nukkit.event.player.PlayerInteractEvent;
import net.berry64.Nukkit.Essentials.NukkitEssentials;
import net.berry64.Nukkit.Essentials.Functions.Spawn;
import net.berry64.Nukkit.Essentials.Functions.SpawnProtect;;

public class PNB implements Listener {
	NukkitEssentials pl;
	public PNB(NukkitEssentials l) {
		pl = l;
	}
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent evt){
		if(SpawnProtect.enabled()){
			if(!evt.getPlayer().isOp()){
				if(evt.getPlayer().getLevel().equals(Spawn.getLoc().getLevel())){
					double d = evt.getBlock().getLocation().distance(Spawn.getLocAsV3());
					if(d < SpawnProtect.getRange()){
						if(SpawnProtect.warnBuild()){
							evt.getPlayer().sendMessage(msg.PNB_BLOCK_CANCEL.getContent());
						}
						evt.setCancelled(true);
					}
				}
			}
		}
	}
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent evt){
		if(SpawnProtect.enabled()){
			if(!evt.getPlayer().isOp()){
				if(evt.getPlayer().getLevel().equals(Spawn.getLoc().getLevel())){
					double d = evt.getBlock().getLocation().distance(Spawn.getLocAsV3());
					if(d < SpawnProtect.getRange()){
						if(SpawnProtect.warnBuild()){
							evt.getPlayer().sendMessage(msg.PNB_BLOCK_CANCEL.getContent());
						}
						evt.setCancelled(true);
					}
				}
			}
		}
	}
	@EventHandler
	public void onInteract(PlayerInteractEvent evt){
		if(SpawnProtect.enabled()){
			if(!evt.getPlayer().isOp()){
				if(evt.getPlayer().getLevel().equals(Spawn.getLoc().getLevel())){
					double d = evt.getBlock().getLocation().distance(Spawn.getLocAsV3());
					if(d < SpawnProtect.getRange()){
						if(SpawnProtect.cancelInteract()){
							if(SpawnProtect.warnInteract()){
								evt.getPlayer().sendMessage(msg.PNB_INTERACT_CANCEL.getContent()
										.replaceAll("{0}", evt.getItem().getName()));
							}
							evt.setCancelled(true);
						}
					}
				}
			}
		}
	}
}
