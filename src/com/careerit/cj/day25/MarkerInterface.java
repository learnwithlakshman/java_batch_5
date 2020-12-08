package com.careerit.cj.day25;

class Employee implements Cloneable {

	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public void increment(double amount) {
		this.salary += amount;
	}

	@Override
	public String toString() {
		return String.format("Employee [name=%s, salary=%s]", name, salary);
	}
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
}

public class MarkerInterface {

		public static void main(String[] args) throws CloneNotSupportedException {
			Employee emp = new Employee("Krish", 50000);
			emp.increment(5000);
			
			// Before increment once again we need to copy existing object
			System.out.println(emp);
			Employee emp1 = emp.clone();
			System.out.println(emp1);
			
			emp.increment(5000);
			System.out.println("--------------------");
			System.out.println(emp);
			System.out.println(emp1);
			
			
		}
}
