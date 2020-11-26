package com.careerit.cj.day16;

public final class MyMathOperations {
	
	
		private MyMathOperations() {
			
		}
		public static int add(int a,int b) {
			return a + b;
		}
		
		public static int factorial(int num) {
			int res = 1;
			if (num == 1 || num == 0) {
				return res;
			}
			for (int i = 2; i <= num; i++) {
				res *= i;
			}
			return res;
		}
		public static boolean isPrime(int num) {
			if(num <= 0 || num == 1) {
				return false;
			}
			for(int i=2;i<=(int)Math.sqrt(num);i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		}
}
