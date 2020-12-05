package com.careerit.cj.day23;

abstract class One {

	abstract void m1();
	public void m2() {
		m1();
	}
	abstract void m3();
}
abstract class Two extends One{
	@Override
	void m1() {
		System.out.println("M1");
		
	}
}
class Three extends Two{
	@Override
	void m3() {
		
	}
}

public class AbstractClassExample {

		public static void main(String[] args) {
		
		}
}
