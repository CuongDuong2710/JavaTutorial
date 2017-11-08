package object_oriented_design;

/**
 * Making coin object
 * @author QUOC CUONG
 *
 */
public class Coin {
	
	private String coinOption = "";
	public String[] coinValue = {"Heads", "Tails"};
	
	// Constructor
	Coin() {
		
		int randNum = (Math.random() < 0.5) ? 0 : 1;
		coinOption = coinValue[randNum];
	}
	
	public String getCoinOption() { return coinOption; }

}
