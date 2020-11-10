package com.careerit.cj.day5;

import java.util.Scanner;

/*
 * Write a program to accept two numbers num1 and num2; when one is subtracted from the other, the result should always be a positive number.
 */
public class MathOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2: ");
		int num2 = sc.nextInt();

		int res = 0;

		if (num1 > num2) {
			res = num1 - num2;
		} else {
			res = num2 - num1;
		}
		System.out.println("Result : " + res);
		sc.close();

	}
}
