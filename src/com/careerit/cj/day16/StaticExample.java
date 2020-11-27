package com.careerit.cj.day16;

import static com.careerit.cj.day16.MyMathOperations.factorial;
import static com.careerit.cj.day16.MyMathOperations.isPrime;
import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

public class StaticExample {

	// Gets executed only once at the time of loading class ( JVM )
	static {
		System.out.println("Static block-1 ");
	}
	
	public static int add(int a,int b) {
		return a + b;
	}

	public static void main(String[] args) {

		int res = MyMathOperations.add(10, 20);
		boolean prime = isPrime(33);
		int fact = factorial(6);
		
		out.println(res);
		out.println(prime);
		out.println(fact);
		System.out.println(PI);
		System.out.println(pow(2, 3));
		System.out.println(sqrt(9));
		System.out.println(abs(-10));
		System.out.println(pow(3,4));

	}

}
