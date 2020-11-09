package com.careerit.cj.day4;

import java.util.Scanner;

public class BillCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount :");
		float bill_amount = sc.nextFloat();
		float discount_amount = 0;
		float net_amount = 0;

		if (bill_amount >= 5000) {
			discount_amount = bill_amount * 0.1f;
		}
		net_amount = bill_amount - discount_amount;
		System.out.println("Bill amount is     :" + bill_amount);
		System.out.println("Discount amount is :" + discount_amount);
		System.out.println("Net amount is      :" + net_amount);
		sc.close();
	}
}
