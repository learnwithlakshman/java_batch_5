package com.careerit.cj.day9;

public class Test {
	public static void main(String[] args) {
	
		System.out.println(factorial(5));
	}

	public static int factorial(int num) {

		if (num == 0 || num == 1)
			return 1;
		System.out.println("Going calculate factorial");
		int res = 1;
		for (int i = 2; i <= num; i++) {
			res *= i;
		}
		return res;
	}
}
