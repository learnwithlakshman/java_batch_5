package com.careerit.cj.day25;

import java.math.BigInteger;
import java.util.Arrays;

interface MyMath {

	boolean isPrime(int num);

	boolean isEven(int num);
	
	default double power(int m,int n) {
		return pow(m,n);
	}

	default int countPrimeInRange(int lb, int ub) {
		int count = 0;
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	default int[] primeNumbers(int lb, int ub) {
		int count = countPrimeInRange(lb, ub);
		int[] arr = new int[count];
		int c = 0;
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i)) {
				arr[c++] = i;
			}
		}
		return arr;
	}
	
	private double pow(int m,int n) {
		//Logic
    	return Math.pow(m, n);
	}
	
	public static BigInteger factorial(int num) {
			BigInteger res = BigInteger.valueOf(1);
			for(int i=2;i<=num;i++) {
				res = BigInteger.valueOf(res.longValue()*i);
			}
			return res;
	}
	
	private static int fact(int num) {
		return 0;
	}
	
}

class MyMathImpl implements MyMath {

	@Override
	public boolean isPrime(int num) {

		return false;
	}

	@Override
	public boolean isEven(int num) {

		return false;
	}

}

class MathImpl implements MyMath {

	@Override
	public boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num % 2 == 0 && num != 2)
			return false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isEven(int num) {

		return false;
	}
	
	

}

public class InterfaceExample {

	public static void main(String[] args) {

		MyMath obj = new MathImpl();
		int[] arr = obj.primeNumbers(2, 10);
		System.out.println(Arrays.toString(arr));
		
	}
}
