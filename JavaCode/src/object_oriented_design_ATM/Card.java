package object_oriented_design_ATM;

//Used as the fictional card passed in to check
//if it is valid
public class Card {
	
	private int pin;
	private int stripNumber;
	
	// Used to create a temp card to check for
	// a valid card strip number in a bank database
	public Card(int stripNumber) {
		this.stripNumber = stripNumber;
	}
	
	// Used to create a temp card to check for
	// a valid card strip number and PIN in a
	// bank database
	public Card(int pin, int stripNumber) {
		this.pin = pin;
		this.stripNumber = stripNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getStripNumber() {
		return stripNumber;
	}

	public void setStripNumber(int stripNumber) {
		this.stripNumber = stripNumber;
	}

}
