package com.careerit.cj.day21;

import java.util.concurrent.ThreadLocalRandom;

public class Account extends Object {

	protected int accNumber;
	protected String name;
	protected double balance;

	// private > (default) > protected > public
	// default keyword : switch, default method ( Java8 )

	public Account(String name,double balance) {
		this.accNumber = ThreadLocalRandom.current().nextInt(1001,10000);
		this.name = name;
		this.balance = balance;
	}
	
	public double withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Sorry! you don't have sufficient funds");
		}
		balance -= amount;
		return balance;
	}

	public double deposit(double amount) {
		balance += amount;
		return balance;
	}

	@Override
	public String toString() {
		return String.format("Account [accNumber=%s, name=%s, balance=%s]", accNumber, name, balance);
	}

}
