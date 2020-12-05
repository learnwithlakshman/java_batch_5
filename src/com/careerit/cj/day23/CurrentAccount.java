package com.careerit.cj.day23;

public class CurrentAccount extends Account {

	private double overDraft = 10000;

	public CurrentAccount(String name, double balance) {
		super(name, balance);
	}
	@Override
	public double withdraw(double amount) {
		if (amount > (balance + overDraft )) {
			System.out.println("Sorry! you don't have sufficient funds");
		}
		balance -= amount;
		return balance;
	}

	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}
	
	

}
