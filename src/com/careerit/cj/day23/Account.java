package com.careerit.cj.day23;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Account extends Object {

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
	
	public abstract double withdraw(double amount);

	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
	
	
	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("Account [accNumber=%s, name=%s, balance=%s]", accNumber, name, balance);
	}

}
