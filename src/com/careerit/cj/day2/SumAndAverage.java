package com.careerit.cj.day2;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age1: ");
		int age1 = sc.nextInt();
		System.out.println("Enter the age2: ");
		int age2 = sc.nextInt();
		System.out.println("Enter the age3: ");
		int age3 = sc.nextInt();
		
		int sum = age1 + age2 + age3;
		float avg = sum /(float)3;
		System.out.println("The sum of ages :"+sum);
		System.out.println("The average age is: "+avg);
		sc.close();
	}
}
