package object_oriented_design_ATM;

import java.util.Scanner;

public class ATM {
	
	private Transaction theTransaction = null;
	private BankNetwork networkOfBankOnATM = null;
	
	// Used to get input from the customer
	static Scanner userInput = new Scanner(System.in);
	
	ATM(BankNetwork networkOfBankOnATM) {
		
		this.networkOfBankOnATM = networkOfBankOnATM;
		
	}
	
	public boolean isStripReadable(Card theCard) {
		
		// Returns the number of digits in stripNumber
		int numberOfDigitsInStrip = (int) (Math.log10(theCard.getStripNumber()) + 1);
		
		theTransaction = new Transaction(theCard.getStripNumber());
		
		if (numberOfDigitsInStrip == 10) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	// Sends the card inserted to BankNetwork to see if there
	// are any matching bankIDs
	public boolean isATMCardsBankInNetwork(Card theCard) {
		
		if (networkOfBankOnATM.isATMCardsBankInNetWork(theCard)) {
			
			theTransaction.setStripNumber(theCard.getStripNumber());
			
			// Sets that the stripNumber has been verified so it is ok
			// to access account info to verify pin later
			theTransaction.setDidCardVerify(true);
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public boolean insertPIN(Card theCard, int pin) {
		
		// Finds the number of digits in the PIN
		int numberOfDigitsInPin = (int) (Math.log10(pin) + 1);
		
		if (numberOfDigitsInPin != 4) {
			
			System.out.println("You have to enter 4 digits for a PIN");
			
			return false;
			
		} else {
			
			theTransaction.setPin(pin);
			
			// I decided to pass the transaction instead of the card
			// like I did in the sequence diagram
			networkOfBankOnATM.verifyThePin(theTransaction);
			
		}
		
		return false;
		
	}
	
	public void pickAcctToAccess() {
		
		System.out.println("What Account do you Want to Withdrawal From ");
		System.out.println("( 1 - Savings, 2 - Checking ) ");

		if (userInput.hasNextInt()) {
			
			int numberEntered = userInput.nextInt();
			
			theTransaction.setAcctToWithdrawalFrom(numberEntered);
			
		} else {
			
			System.out.println("You Entered an Invalid Option");
			
		}
	}
	
	public void amountToWithdrawal() {
		
		System.out.println("How much do you want to withdrawal ");
		System.out.println("( Increments of 10 ) ");
		
		if (userInput.hasNextInt()) {
			
			int numberEntered = userInput.nextInt();
			
			theTransaction.setWithdrawalAmt(numberEntered);
			
			networkOfBankOnATM.requestWithdrawalAmt(theTransaction);
			
		} else {
			
			System.out.println("You Entered an Invalid Amount");
			
		}

	}
	
	public void getTransactionInfo() {
		
		System.out.println("Thank you " + theTransaction.getCustomerName() + 
						" for using the XYZ Bank ATM\n");
		
		System.out.println("Date / Time of Transaction: " + 
					theTransaction.getCurrentDateTime());
		
		System.out.println("\nTransaction");
		
		System.out.println("Remove $" + theTransaction.getWithdrawalAmt() + " from your" );
		
		if (theTransaction.getAcctToWithdrawalFrom() == 1) {
			
			System.out.println("Savings account.\nYour current balance is " + 
						theTransaction.getAcctBalance());
			
		} else {
			
			System.out.println("Checking account.\nYour current balance is " + 
					theTransaction.getAcctBalance());
			
		}
		
	}


}
