package com.careerit.cj.day6;

import java.util.Scanner;

public class GenerateNPrimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N :");
		int N = sc.nextInt();
		int count = 0;
		int i = 2;
		while (count < N) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
			i++;
			
		}
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
