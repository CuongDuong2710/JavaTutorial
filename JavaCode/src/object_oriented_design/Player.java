package object_oriented_design;

/**
 * Making Player
 * @author QUOC CUONG
 *
 */
public class Player {
	
	private String name = "";
	private String coinOption = "";
	
	public String[] coinValue = {"Heads", "Tails"};
	
	Player(String newName) {
		this.name = newName;
	}
	
	public String getCoinOption() { return coinOption; }
	
	/**
	 * set opponent coin for other player
	 * @param opponentFlip
	 */
	public void setCoinOption(String opponentFlip) {
		
		coinOption = (opponentFlip == "Heads") ? "Tails" : "Heads";
		
	}
	
	/**
	 * pick random coin option
	 * @return
	 */
	public String getRandCoinOption() {
		
		int randNum = (Math.random() < 0.5) ? 0 : 1;
		
		coinOption = coinValue[randNum];
		
		return coinValue[randNum];
		
	}
	
	/**
	 * Checking winning player
	 * @param winningFlip
	 */
	public void didPlayerWin(String winningFlip) {
		
		if (coinOption == winningFlip) {
			
			System.out.println(name + " won with a flip of " + coinOption);
			
		} else {
			
			System.out.println(name + " lost with a flip of " + coinOption);
			
		}
	}

}
