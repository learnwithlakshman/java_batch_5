package com.careerit.cj.day26;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		
		System.out.println("Main method starts");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of num2: ");
		int num2 = sc.nextInt();
		try {
			int res = compute(num1, num2);
			System.out.println(String.format("%s / %s = %s", num1, num2, res));
		}catch (ArithmeticException e) {
			System.out.println("Value of num2 can't be zero ");
			e.printStackTrace();
		}
		System.out.println("End of main method");
		sc.close();

	}

	public static int compute(int a, int b) {
	
		return a / b;
	}
}
