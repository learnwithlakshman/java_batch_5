package com.careerit.cj.day9;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no tickets :");
		int tickets = sc.nextInt();
		System.out.println("Enter the day (1-7) 1- Monday.... 7- Sunday :");
		int day = sc.nextInt();
		String[] dayNames = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		double ticketPrice = 0;

		switch (day) {
		case 1:
		case 3:
		case 4:
		case 5:
			ticketPrice = 250;
			break;
		case 2:
			ticketPrice = 200;
			break;
		case 6:
		case 7:
			ticketPrice = 400;
			break;

		default:
			System.out.println("Enter correct day ( 1- 7) ");
		}

		double netAmount = ticketPrice * tickets;
		System.out.println("No tickets        :" + tickets);
		System.out.println("Ticket Price      :" + ticketPrice);
		System.out.println("Day               :" + dayNames[day - 1]);
		System.out.println("Total amount      :" + netAmount);
		sc.close();
	}
}
