package com.careerit.cj.day8;

import java.util.Scanner;

public class SumOfDigitsUntilSingleDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;

//		while (temp > 9) {
//			int sum = 0;
//			while (temp != 0) {
//				int r = temp % 10;
//				sum += r;
//				temp /= 10;
//			}
//			temp = sum;
//		}
		
		while(temp > 9) {
			int sum =  temp / 10 + temp % 10;
			temp = sum;
		}

		System.out.println(temp);
		sc.close();
	}
}
