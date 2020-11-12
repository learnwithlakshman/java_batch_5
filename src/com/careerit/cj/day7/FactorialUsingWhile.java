package com.careerit.cj.day7;

import java.util.Scanner;

public class FactorialUsingWhile {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num:");
			int num = sc.nextInt();
			
			int res = 1;
			int i = 1;
			
			while(i<=num) {
				res *= i;
				i++;
			}
			System.out.println("Factorial of "+num+" is "+res);
			sc.close();
			
		}
}
