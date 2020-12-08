package com.careerit.cj.day24;

interface One {
	public abstract void m1();
}

interface Two {
	public abstract void m2();

}

// 1. If interfaces having common methods then implemented class should provide only once
class Three implements One, Two {
	@Override
	public void m1() {

	}

	@Override
	public void m2() {

	}

}

public class InterfaceExample {

	public static void main(String[] args) {
		Three obj = new Three();
		obj.m1();
		obj.m2();
	}
}
