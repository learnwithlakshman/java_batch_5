package com.careerit.cj.day16;

public class EmployeeManager {

		public static void main(String[] args) {
			Employee emp1 = new Employee();
			emp1.setValues(1001,"Manoj",8000);
			emp1.showInfo();
			
			
			Employee emp2 = new Employee(1002, "Krish", 5000);
			emp2.showInfo();

			
		
		}
		
		
		
		
}
