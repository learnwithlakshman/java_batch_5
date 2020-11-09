package com.careerit.cj.day2;

import java.util.Scanner;

public class SwapOfTwoNumbers {
		
		/***
		 * Program execution starts from main method
		 * @param args
		 */
		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the value of a: ");
				int a = sc.nextInt();
				System.out.println("Enter the value of b: ");
				int b = sc.nextInt();
				
				System.out.println("Before swap  value of a = "+a +" and b = "+b);
			
	
				a = a + b;  // Swapping numbers without temp variable
				b = a - b;
				a = a - b;
				
				System.out.println("After swap  value of a = "+a +" and b = "+b);
				sc.close();
				
		}
}
