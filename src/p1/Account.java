package p1;

import java.io.Serializable;

public class Account implements Serializable,Comparable<Account> 
{

	private String accountHolderName;
	private int accountNumber;
	private int balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accountHolderName, int accountNumber, int balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		String a = accountHolderName;
		String b = balance + "";

		return a + " - " + b;

	}

	@Override
	public int hashCode() {
		System.out.println(" inside hashcode for "+this.accountHolderName);
		
		int hash = accountNumber+accountHolderName.length();
		
		return hash;
	}

	@Override
	public boolean equals(Object obj) {

		System.out.println(" inside equals for "+this.accountHolderName);
		boolean isValid = false;

		if (obj instanceof Account) {
			Account a = (Account) obj;

			boolean isValidAccountNumber = (this.accountNumber == a.accountNumber);
			boolean isValidName = this.accountHolderName.equals(a.accountHolderName);
			boolean isValidBalance = this.balance == a.balance;

			isValid = isValidAccountNumber && isValidBalance && isValidName;

		}

		return isValid;
	}

	@Override
	public int compareTo(Account acc) {
		
		return acc.balance - this.balance;
	}
	
	

}

















