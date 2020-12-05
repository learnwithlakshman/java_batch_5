package com.careerit.cj.day23;

import com.careerit.cj.day21.Account;

public class JointAccount extends Account {

	public JointAccount(String name,double balance) {
		super(name,balance);
	}
	@Override
	public double withdraw(double amount) {
		return 0;
	}

	

}
