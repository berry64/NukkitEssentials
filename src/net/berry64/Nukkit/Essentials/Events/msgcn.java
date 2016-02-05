package net.berry64.Nukkit.Essentials.Events;

public enum msgcn {
	AT(" 在 "),
	
	PNB_INTERACT_CANCEL("&c你不能在这里使用 {0}"),
	PNB_BLOCK_CANCEL("&c你不能在这里放置/破坏方块");
	
	
	
	
	
	
	
	private String content;
	private msgcn(String l){
		content = l;
	}
	public String getContent() {
		return content;
	}
}
