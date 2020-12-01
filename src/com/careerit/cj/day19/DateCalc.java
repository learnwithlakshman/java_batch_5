package com.careerit.cj.day19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateCalc {

	private LocalDate inputDate;

	public DateCalc(LocalDate inputDate) {
		this.inputDate = inputDate;
	}

	public int noOfDays() {

		return (int) ChronoUnit.DAYS.between( inputDate,LocalDate.now());
	}

	public int noOfYears() {
		return (int) ChronoUnit.YEARS.between( inputDate,LocalDate.now());
	}

	public int noOfWeeks() {
		return (int)ChronoUnit.WEEKS.between(inputDate,LocalDate.now());
		
	}

}
