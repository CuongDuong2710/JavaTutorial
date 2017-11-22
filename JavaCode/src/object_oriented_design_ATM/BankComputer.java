package object_oriented_design_ATM;

import java.util.ArrayList;

public class BankComputer {
	
	private int bankID = 9;
	private String bankName = "";
	private ArrayList<Account> accounts = new ArrayList<>();
	
	public static int numberOfBanks = 0;
	
	public BankComputer(String newBankName) {
		
		this.bankName = newBankName;
		
		numberOfBanks++;
		
		this.bankID += numberOfBanks;
	}
	
	public void addAcctToBank(Account newAccount) {
		this.accounts.add(newAccount);
	}
	
	public int getBankId() {
		return bankID;
	}
	
	// Verifies that a card with the strip number is in a bank
	public boolean verifyTheStripNumber(Card theCard) {
		
		boolean cardVerification = false;
		
		for (Account account : accounts) {
			
			if (account.getStripNumber() == theCard.getStripNumber()) {
				
				cardVerification = true;
				
			}
		}
		return cardVerification;
	}
	
	//TODO: creating verifyThePIN() and requestWithdrawalAmt()
}
