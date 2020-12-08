package com.careerit.cj.day24;

import java.math.BigInteger;

public class Manager {

	public static void main(String[] args) {

		NumberOperations obj = new NumberOperationsV2Impl();
		// Can't create object for interface, but reference variable can be created

		int num = 17;
		BigInteger res = obj.factorial(num);
		boolean prime = obj.isPrime(num);
		int count = obj.factors(num);
		System.out.println("Factorial of " + num + " is " + res);
		System.out.println(num + " is prime :" + prime);
		System.out.println("Factors count of :" + num + " is " + count);
	}
}
