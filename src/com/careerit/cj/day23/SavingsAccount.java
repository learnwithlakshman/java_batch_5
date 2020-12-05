package com.careerit.cj.day23;

public class SavingsAccount extends Account {


	private double minBalance=1000;

	public SavingsAccount(String name,double balance) {
		super(name,balance);
	}
	@Override
	public double withdraw(double amount) {
		if (amount > (balance - minBalance)) {
			System.out.println("Sorry! you don't have sufficient funds");
		}
		balance -= amount;
		return balance;
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	

}
