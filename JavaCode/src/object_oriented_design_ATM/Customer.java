package object_oriented_design_ATM;

public class Customer {

	private Card customerATMCard;
	
	public Customer(Card newATMCard) {
		
		this.customerATMCard = newATMCard;
		
	}
	
	public Card getATMCard() {
		return this.customerATMCard;
	}
}
