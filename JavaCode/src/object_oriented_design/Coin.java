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
		
	}
	
	public String getCoinOption() { return coinOption; }

}
