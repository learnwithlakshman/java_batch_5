package com.careerit.cj.day5;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	
		sc.close();
	}
}
