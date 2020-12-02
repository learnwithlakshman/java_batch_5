package com.careerit.cj.day20;

public class Manager {

	public static void main(String[] args) {
		
		TaskManager obj1 = TaskManager.getInstance();
		TaskManager obj2 = TaskManager.getInstance();
		TaskManager obj3 = TaskManager.getInstance();
		TaskManager obj4 = TaskManager.getInstance();
		

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
	
	}
}
