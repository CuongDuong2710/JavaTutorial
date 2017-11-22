package object_oriented_design_ATM;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
	
	// Formats the date of the transaction
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	private int bankID;
	private Date currentDateTime;
	private String customerName;
	private double acctBalance;
	private int withdrawalAmt;
	private int acctNumberUsed;
	private int pin;
	private int stripNumber;
	private int acctToWithdrawalFrom;
	
	// I decided to add verification that the card is allowed
	// to access the bank accounts
	private boolean didCardVerify;

	public DateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public int getBankID() {
		return bankID;
	}

	// returns the current date and time as a String
	public String getCurrentDateTime() {
		return dateFormat.format(currentDateTime);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAcctBalance() {
		return acctBalance;
	}

	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}

	public int getWithdrawalAmt() {
		return withdrawalAmt;
	}
	
	public void setWithdrawalAmt(int withDrawalAmt) {
		this.withdrawalAmt = withDrawalAmt;
	}

	public int getAcctNumberUsed() {
		return acctNumberUsed;
	}

	public void setAcctNumberUsed(int acctNumberUsed) {
		this.acctNumberUsed = acctNumberUsed;
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

	public int getAcctToWithdrawalFrom() {
		return acctToWithdrawalFrom;
	}

	// Gets sent a 1 for savings or a 2 for checking
	// That number is added to the end of the accountNumberUsed
	public void setAcctToWithdrawalFrom(int acctToWithdrawalFrom) {
		
		this.acctToWithdrawalFrom = acctToWithdrawalFrom;
		
		this.acctNumberUsed = (stripNumber * 10) + acctToWithdrawalFrom;
	}

	public boolean isDidCardVerify() {
		return didCardVerify;
	}

	// Sets that the card has a valid stripNumber
	public void setDidCardVerify(boolean cardVerified) {
		this.didCardVerify = (cardVerified) ? true : false;
	}
	
	Transaction(int stripNumber) {
		
		bankID = BankNetwork.getFirstTwoDigits(stripNumber);
		
		currentDateTime = new Date();
		
		// Holds the account number minus either 1 for savings, or
		// 2 for checking at the end until that is added by
		// setAccountNumberUsed() below

		acctNumberUsed = stripNumber;
		
	}

}
