package com.careerit.cj.day6;

import java.util.Scanner;

public class FactorsOfGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Factors count is :"+count);
		sc.close();
	}
}
