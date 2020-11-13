package com.careerit.cj.day8;

import java.util.Scanner;

public class SumOfDigits {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			int temp = num;
			int sum = 0;
			while(temp!=0) {
				int r = temp % 10;
				sum += r;
				temp /= 10;
			}
			System.out.println("The sum of "+num + " digts is "+sum);
			sc.close();
		}
}
