package object_oriented_design_ATM;

import java.util.ArrayList;

public class BankComputer {
	
	private int bankID = 9;
	private String bankName = "";
	private ArrayList<Account> accounts = new ArrayList<>();
	
	public static int numberOfBanks = 0;
	
	public BankComputer(String newBankName) {
		
		this.bankName = newBankName;
		
		// increase number of banks
		numberOfBanks++;
		
		// increase bankID
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
	
	// Verifies that a card with the strip number and PIN is in a bank
	public boolean verifyThePIN(Transaction transaction) {
		
		boolean cardVerification = false;
		
		if (transaction.isDidCardVerify()) {
			
			for (Account account : accounts) {
				
				if (account.getPin() == transaction.getPin() &&
						(account.getStripNumber() == transaction.getStripNumber())) {
					
					cardVerification = true;
					
					transaction.setCustomerName(account.getCustomerName());
					
				}
			}
			
		}
		
		return cardVerification;
		
	}
	
	public void requestWithdrawalAmt(Transaction transaction) {
		
		for (Account account : accounts) {
			
			if (account.getAcctNumber() == transaction.getAcctNumberUsed()) {
				
				if (account.getAcctBalance() >= transaction.getWithdrawalAmt()) {
					
					double newAcctBalance = account.getAcctBalance() - 
									transaction.getWithdrawalAmt();
					
					account.setAcctBalance(newAcctBalance);
					
					transaction.setAcctBalance(newAcctBalance);
					
				} else {
					
					System.out.println("You can't withdrawal that much money");
					
				}
				
			}
			
		}
		
	}
}
