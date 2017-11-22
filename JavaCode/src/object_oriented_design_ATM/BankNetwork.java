package object_oriented_design_ATM;

import java.util.ArrayList;

public class BankNetwork {
	
	private ArrayList<BankComputer> banksInDatabase = new ArrayList<>();
	
	public void addBankToNetWork(BankComputer newBank) {
		
		this.banksInDatabase.add(newBank);
		
	}
	
	public boolean isATMCardsBankInNetWork(Card theCard) {
		
		boolean cardVerification = false;
		
		int cardBankID = getFirstTwoDigits(theCard.getStripNumber()); 
		
	}

	// Returns the first 2 digits from the number passed to it
	static int getFirstTwoDigits(int stripNumber) {
		
		String stringOfStripNumber = Integer.toString(stripNumber);
		
		// Get the first 2 numbers from the stripNumber and save them as an int
		int bankIDFromStrip = Integer.parseInt(stringOfStripNumber.substring(0, 2));
		
		return bankIDFromStrip;
	}
	
	public boolean verifyThePin(Transaction transaction) {
		
		boolean cardVerification = false;
		
		if (transaction.isDidCardVerify()) {
			
			for (BankComputer bank : banksInDatabase) {
				
				if (bank.getBankId() == transaction.getBankID()) {
					
					bank.verifyThePIN(transaction);
					
					cardVerification = true;
					
				} else {
					
					System.out.println("The card Bank ID doesn't match any in the system");
					
				}
				
			}
			
		}
		
		return cardVerification;
		
	}
	
	public void requestWithdrawalAmt(Transaction transaction) {
		
		if (transaction.isDidCardVerify()) {
			
			for (BankComputer bank : banksInDatabase) {
				
				if (bank.getBankId() == transaction.getBankID()) {
					
					bank.requestWithdrawalAmt(transaction);
					
				}
				
			}
			
		} else {
			
			System.out.println("An Error Occurred During the Withdrawal");
			
		}
		
	}

}
