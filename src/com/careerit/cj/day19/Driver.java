package com.careerit.cj.day19;

import java.time.LocalDate;

public class Driver {
	
	public static void main(String[] args) {
		
			DateCalc obj1 = new DateCalc(LocalDate.of(1984,8,6));
			
			int days = obj1.noOfDays();
			int years = obj1.noOfYears();
			int weeks = obj1.noOfWeeks();
			
			System.out.println(days);
			System.out.println(years);
			System.out.println(weeks);
	}

}
