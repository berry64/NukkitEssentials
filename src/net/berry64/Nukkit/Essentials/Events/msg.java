package net.berry64.Nukkit.Essentials.Events;

public enum msg {
	AT(" at world "),
	
	PNB_INTERACT_CANCEL("&cYou cannot use {0} here"),
	PNB_BLOCK_CANCEL("&cYou cannot place/break blocks here");
	
	
	
	
	
	
	
	private String content;
	private msg(String l){
		content = l;
	}
	public String getContent() {
		return content;
	}
}
