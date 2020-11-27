package com.careerit.cj.day16;

public class Employee {
		
		int empno;
		String name;
		float salary;
		static String orgName="XYZC Org";
		public Employee() {
		}
		
		public Employee(int empno,String name,float salary) {
			this.empno = empno;
			this.name = name;
			this.salary = salary;
		}
		
		public void Employee() {
			System.out.println("Never do this");
		}
		
		public void setValues(int empno,String name,float salary) {
			this.empno = empno;
			this.name = name;
			this.salary = salary;
		}
		
		public void showInfo() {
			System.out.println(String.format("Employee [empno: %d, name: %s and salary: %f]", empno,name,salary));
		}
		
		
			
}
