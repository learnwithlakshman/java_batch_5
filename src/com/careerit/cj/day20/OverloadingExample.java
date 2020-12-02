package com.careerit.cj.day20;

public class OverloadingExample {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}


	public float add(int a, float b) {
		return a + b;
	}

	public float add(float a, float b) {
		System.out.println("here...");
		return a + b;
	}

	public String add(String a, String b) {
		return a + b;
	}

	public static final void main(final String... args) {
		OverloadingExample obj = new OverloadingExample();
		byte b = 10;
		byte c = 15;
		int res = obj.add(b, c);
		System.out.println(res);

		float fres = obj.add(2.3f, 4);

		String sres = obj.add("Hello", "Java");

		obj.add(1);

		res = obj.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(res);
		
		String str = "Hello Java";
		
	}
	
	public int add(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}

	public int add(int... arr) {
		int sum = 0;
		for (int ele : arr) {
			sum += ele;
		}
		return sum;
	}


}
