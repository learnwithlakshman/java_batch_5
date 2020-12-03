package com.careerit.cj.day21;

import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {

		Account acc1 = new Account("Krish", 50000);
		Scanner sc = new Scanner(System.in);
		System.out.println(acc1);
		while (true) {
			System.out.println("1. Deposit 2. Withdraw 3.exit");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("Enter the amount to deposit :");
				double amount = sc.nextDouble();
				double balance = acc1.deposit(amount);
				System.out.println("The current balance is :" + balance);
			} else if (ch == 2) {
				System.out.println("Enter the amount to withdraw :");
				double amount = sc.nextDouble();
				double balance = acc1.withdraw(amount);
				System.out.println("The current balance is :" + balance);

			} else {
				break;
			}
		}
		System.out.println("Thanks for banking with us.....");
		sc.close();
	}
}
