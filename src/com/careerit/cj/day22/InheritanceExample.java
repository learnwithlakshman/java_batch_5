package com.careerit.cj.day22;

import java.util.concurrent.ThreadLocalRandom;

class One {
	int a = 10;

	protected void show1() {
		System.out.println("One-show1");
	}

}

class Two extends One {
	int a = 100;

	public void show1() {
		System.out.println("Two-show1");
	}

	void show2() {
		System.out.println("Two-show2");
	}

}

class Three extends One {
	int a = 100;

	void show3() {
		System.out.println("Two-show3");
	}

}

public class InheritanceExample {

	public static void main(String[] args) {

//			One obj = new One();
//			System.out.println(obj.a);
//			obj.show1();

//			Two obj=new Two();
//			System.out.println(obj.a);
//			obj.show2();
//			obj.show1();

		One obj = getInstance();
		System.out.println(obj.getClass().getName());
		System.out.println(obj.a);
		obj.show1();
		if (obj instanceof Two) {
			Two two = (Two) obj;
			two.show2();
		}else if(obj instanceof Three) {
			Three three = (Three)obj;
			three.show3();
		}

	}

	private static One getInstance() {

		int num = ThreadLocalRandom.current().nextInt(1, 4);
		if (num == 1)
			return new One();
		else if (num == 2) {
			return new Two();
		} else {
			return new Three();
		}
	}

}





