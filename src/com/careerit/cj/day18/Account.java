package com.careerit.cj.day18;
import static com.careerit.cj.day18.MaskUtil.maskAccountNumber;


public class Account {
	
	static String bankName = "SBI";
	long accNumber;
	String name;
	double balance;
	String email;
	
	
	// Constructor overloading 
	// 1. No of parameters 2. Order 3 Type  must be different
	
	
	public Account(int accNumber, String name, double balance,String email) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
		this.email = email;
	}

	public Account(int accNumber, String name, double balance) {
		this(accNumber, name, balance, "N/A");
	}
	
	

	public void withDraw(double amount) {
		if (amount <= balance) {
			this.balance -= amount;
			System.out.println("Your account number " + maskAccountNumber(accNumber) + "is debited with  "
					+ amount + " current balance is :" + balance);
		} else {
			System.out.println("Sorry! you don't have sufficient funds, current balance is :" + balance);
		}
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Your account number " + maskAccountNumber(accNumber) + "is credited with  "
				+ amount + " current balance is :" + balance);
	}

	public void showInfo() {
		System.out.println(String.format("Dear %s, \n\taccount number %s, email : %s and balance is : %s ", name,
				maskAccountNumber(accNumber), email, balance));
	}

}
