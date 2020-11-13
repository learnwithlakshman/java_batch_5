package com.careerit.cj.day8;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum += (r * r * r);
			temp /= 10;
		}
		if (num == sum) {
			System.out.println(num+" is an Amstrong ");
		} else {
			System.out.println(num +" is not an Amstrong");
		}
			
		sc.close();
	}
}
