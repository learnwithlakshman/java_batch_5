package com.careerit.cj.day5;

import java.util.Scanner;

// lb = 10   ub = 30  => even = ? odd = ?  (10,11,12.... 30)
public class EvenOddCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lb: ");
		int lb = sc.nextInt();
		System.out.println("Enter the ub: ");
		int ub = sc.nextInt();

		int ecount = 0;
		int ocount = 0;
		for (int i = lb; i <= ub; i++) {

			if (i % 2 == 0) {
				ecount++;
			} else {
				ocount++;
			}
		}
		System.out.println("Even count :" + ecount);
		System.out.println("Odd count  :" +ocount);
		sc.close();

	}
}
