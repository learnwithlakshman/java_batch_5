package com.careerit.cj.day5;

import java.util.Scanner;

public class SumOfFirstNNatural {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
		sc.close();
	}
}
