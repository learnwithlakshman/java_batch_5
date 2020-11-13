package com.careerit.cj.day8;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0) {
				continue;
			}
			System.out.println(i);
		}
		sc.close();
	}
}
