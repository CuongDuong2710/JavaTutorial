package object_oriented_design_ATM;

public class TestATM {

	public static void main(String[] args) {
		
		// creating new account
		Account theAccount = new Account(10, "Derek Banas", "C", 10000.0, 1234);
		
		// creating new card
		Card customersATMCard = new Card(theAccount.getPin(), theAccount.getStripNumber());
		
		// creating new customer
		Customer theCustomer = new Customer(customersATMCard);
		
		// creating new bank computer
		BankComputer xyzBankComputer = new BankComputer("XYZ");
		
		// adding account to bank
		xyzBankComputer.addAcctToBank(theAccount);
		
		// creating new bank network
		BankNetwork theBankNetwork = new BankNetwork();
		
		// adding bank to network
		theBankNetwork.addBankToNetWork(xyzBankComputer);
		
		ATM mainStreetATM = new ATM(theBankNetwork);
		
	}
}
