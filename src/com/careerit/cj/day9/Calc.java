package com.careerit.cj.day9;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2:");
		int num2 = sc.nextInt();
		int res = 0;
		String choice = "";
		do {
			System.out.println("1.Add 2. Sub 3.Mul 4.Did 5.Mod 6.exit ");
			System.out.println("Enter the choice:");
			int ch = sc.nextInt();
			
			switch (ch) {

			case  1:
				res = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + res);
				break;
			case 2:
				res = num1 > num2 ? num1 - num2 : num2 - num1;
				System.out.println(num1 + " - " + num2 + " = " + res);
				break;

			case 3:
				res = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + res);
				break;
			case 4:
				res = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + res);
				break;
			case 5:
				res = num1 % num2;
				System.out.println(num1 + " % " + num2 + " = " + res);
				break;
			case 6:
				break;

			default:
				System.out.println("Default...");

			}
			System.out.println("Do you want to continue.... (Y/N)");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));
		sc.close();
	}
}
