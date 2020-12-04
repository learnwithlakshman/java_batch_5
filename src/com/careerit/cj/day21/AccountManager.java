package com.careerit.cj.day21;

public class AccountManager {

	public static void main(String[] args) {

		Account arr[] = getAllAccounts();

		// Display name and overdaft amount
		
		// find total balance of current and savings account
		double savingTotal = 0;
		double currentTotal = 0;
		for (Account acc : arr) {
			if(acc instanceof SavingsAccount) {
				savingTotal += acc.getBalance();
			}else if(acc instanceof CurrentAccount) {
				currentTotal += acc.getBalance();
			}
		}
		System.out.println("Total balance of Savings account :"+savingTotal);
		System.out.println("Total balance of Current account :"+currentTotal);

	}

	private static Account[] getAllAccounts() {
		Account[] acc = new Account[7];
		acc[0] = new Account("Krish", 56000);
		acc[1] = new SavingsAccount("Manoj", 6000);
		acc[2] = new CurrentAccount("TinTin", 6000);
		acc[3] = new SavingsAccount("Charan", 5000);
		acc[4] = new SavingsAccount("Kiran", 4000);
		acc[5] = new CurrentAccount("SuperCompany", 10000);
		acc[6] = new CurrentAccount("GPAY", 20000);
		return acc;
	}
}
