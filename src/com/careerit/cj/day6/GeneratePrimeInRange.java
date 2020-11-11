package com.careerit.cj.day6;

import java.util.Scanner;

public class GeneratePrimeInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lb :");
		int lb = sc.nextInt();
		System.out.println("Enter the ub :");
		int ub = sc.nextInt();
		int count =0;
		for (int i = lb; i <= ub; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("Prime count :"+count);
		sc.close();

	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		if (num % 2 == 0 && num != 2) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
