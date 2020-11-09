package com.careerit.cj.day3;

import java.util.Arrays;

public class EmployeeInformation {
		// 1001 Krish 5.7 5000.0f 
		public static void main(String[] args) {
			
			// Employee number:
			// Name           :
			// Height         :
			// Salary         : Salary + (10%)
			
			System.out.println(Arrays.toString(args));
			
			
			
			int empno = Integer.parseInt(args[0]);
			String name = args[1];
			float height = Float.parseFloat(args[2]);
			double salary = Double.parseDouble(args[3]);
			
			System.out.println("Empno  : "+empno);
			System.out.println("Name   : "+name);
			System.out.println("Height : "+height);
			salary = salary + (salary * 0.1f);
			System.out.println("Salary : "+salary);
			
		
		}
}
