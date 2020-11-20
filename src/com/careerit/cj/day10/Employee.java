package com.careerit.cj.day10;

public class Employee {

	private int empno;
	private String ename;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	public void setValues(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	public void showInfo() {
		System.out.println("Empno     :" + empno);
		System.out.println("Name      :" + ename);
		System.out.println("Salary    :" + salary);
	}

	public void incrementSalary(double percentage) {
		salary = salary + (salary * percentage) / 100;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
