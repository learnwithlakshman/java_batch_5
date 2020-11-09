package com.careerit.cj.day3;

import java.util.Scanner;

public class SumofNaturalNumbers {

		public static void main(String[] args) {
			// n = 5 => 1 + 2 + 3 + 4 + 5
			// (n * (n + 1)) /2;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the N value :");
			int N = sc.nextInt();
			int res = (N * (N + 1))/2;
			System.out.println("The sum of first "+N+" value is :"+res);
			sc.close();
			
			
			
					
		}
}
