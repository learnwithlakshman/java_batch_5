package com.careerit.cj.day8;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		while (temp != 0) {
			int r = temp % 10;
			rev = rev * 10 + r;
			temp /= 10;
		}
		if (rev == num) {
			System.out.println(num + " is palindrome");
		} else {
			System.out.println(num + " is not a palindrome");
		}
		sc.close();
	}
}
