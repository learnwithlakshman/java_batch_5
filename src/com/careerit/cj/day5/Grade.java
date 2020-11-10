package com.careerit.cj.day5;

import java.util.Scanner;

/*
 * Write a program to accept the marks scored in three subjects; determine the sum and average of the entered marks. Grade is awarded based on following criteria.

	If average is < 35 -- “C”; >35 and <60 -- “B”; Otherwise -- “A”
 */
public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Subject1: ");
		int subject1 = sc.nextInt();
		System.out.println("Enter the Subject2: ");
		int subject2 = sc.nextInt();
		System.out.println("Enter the Subject3: ");
		int subject3 = sc.nextInt();
		int sum = subject1 + subject2 + subject3;
		float avg = sum / 3.0f;
		String grade = "";

		if (avg < 35) {
			grade = "C";
		} else if (avg > 35 && avg < 60) {
			grade = "B";
		} else {
			grade = "C";
		}

		System.out.println("Total   : " + sum);
		System.out.println("Average :" + avg);
		System.out.println("Grade   :" + grade);
		sc.close();
	}
}
