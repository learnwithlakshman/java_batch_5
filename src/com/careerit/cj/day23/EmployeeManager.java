package com.careerit.cj.day23;

class Person { // Object is super
	
	protected int pid;
	protected String name;
	protected int age;

	public Person(int pid,String name,int age) {
		super();
		System.out.println("Person Constructor");
		this.pid = pid;
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(String.format("%s %s %s", pid,name,age));
	}

}

class Employee extends Person {
	protected double salary;
	protected int age;

	public Employee(int pid,String name,int age,double salary) {
		super(pid,name,age);
		this.salary = salary;
		System.out.println("Employee Constructor");
	}
	public void showInfo() {
		System.out.println(super.age);
		super.showInfo();
		System.out.println("Salary :"+salary);
	}
	

}

public class EmployeeManager {

	public static void main(String[] args) {
		Person obj = new Employee(1001,"Krish",34,50000);
		obj.showInfo();
	}
}
