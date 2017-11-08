package object_oriented_design;

public class Player {
	
	private String name = "";
	private String coinOption = "";
	
	public String[] coinValue = {"Heads", "Tails"};
	
	Player(String newName) {
		this.name = newName;
	}
	
	public String getCoinOption() { return coinOption; }
	
	public void setCoinOption(String opponentFlip) {
		
	}
	
	public String getRandCoinOption() {
		
	}
	
	public void didPlayerWin(String winningFlip) {
		
	}

}
