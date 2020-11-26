package com.careerit.cj.day16;

import java.time.LocalDate;

public class MethodExamples {

	// Methods

	// 1. Method with return type with parameter(s)

	public int factorial(int num) {
		int res = 1;
		if (num == 1 || num == 0) {
			return res;
		}
		for (int i = 2; i <= num; i++) {
			res *= i;
		}
		return res;
	}

	// 2. Method without return type with parameter(s)

	public void printTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(String.format("%d * %d = %d", num, i, num * i));
		}
	}

	// 3. Method with return type without arguments

	public int numberOfDaysInCurrentMonth() {
		return LocalDate.now().getDayOfMonth();
	}

	// 4. Method without return type without arguments
	
	public  void greet() {
		System.out.println("Hi User, Welcome to Java World!");
	}
	
	public static void main(String[] args) {
		
			MethodExamples obj = new MethodExamples();
			
			obj.printTable(19);
			int num = 6;
			int res = obj.factorial(num);
			System.out.println("Factorial of "+num +" is "+res);
			int days = obj.numberOfDaysInCurrentMonth();
			System.out.println("Day of the month is :"+days);
			
			// M ^ N  ( 3 ^  4)
			System.out.println(Math.pow(3, 4));
			
	}
}
