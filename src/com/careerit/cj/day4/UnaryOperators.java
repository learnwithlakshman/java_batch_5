package com.careerit.cj.day4;

import java.util.Scanner;

public class UnaryOperators {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount :");
			int amount = sc.nextInt();
			
			if(amount < 0) {
				amount = -amount;
			}
			System.out.println("Entered amount is :"+amount);
			sc.close();
			
		}
}
