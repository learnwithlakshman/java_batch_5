package com.careerit.cj.day3;

import java.util.Scanner;

/*
 *  Write a program to accept the following details of an employee:
 *  empno, name and monthly salary; calculate the yearly salary and display the result.
 *
 *   Hi {Ramana}! Your employee id is 1001, monthly salary is Rs 25,000 and yearly salary is Rs 300,000.
 */
public class EmployeeDetails {
	
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the empno: ");
			 int empno = sc.nextInt();
			 sc.nextLine();
			 System.out.println("Enter the ename: ");
			 String name = sc.nextLine();
			 System.out.println("Enter the salary: ");
			 float salary = sc.nextFloat();
			 
			 float y_salary = salary * 12;
			 System.out.println("Hi "+name+"! Your employee id is :"+empno+", monthly salary is Rs "+salary+" and yearly salary is Rs "+y_salary);
			 sc.close();
		}
}
