package com.careerit.cj.day21;

class C1 {

	int a = 100;

	public void m1() {
		System.out.println("C1 - M1");
	}

	public int biggest(int a, int b, int c) {
		System.out.println("C1 - biggest using if else if");
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

	public Number getResult(int num) {
		return num;
	}

}

class C2 extends C1 {

	// 1. Can't reduce viability ( private > (default) > protected > public )
	// 2. Return type must same except co-varient type
	// 3. Parameters list must be same
	// 4. Exception: should be same or with out exception ( Shouldn't be super type
	// or new exception)

	public int biggest(int a, int b) {
		return a > b ? a : b;
	}

	@Override
	public int biggest(int a, int b, int c) {
		return a > b && a > c ? a : b > c ? b : c;
	}

	

	@Override
	public Integer getResult(int num) {
		return num;
	}

}

public class OverridingExample {

	public static void main(String[] args) {

		C2 obj = new C2();
		System.out.println(obj.a);
		obj.m1();
	}
}
