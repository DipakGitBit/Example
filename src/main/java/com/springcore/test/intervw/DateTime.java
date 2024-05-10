package com.springcore.test.intervw;

import java.time.Duration;
import java.time.*;
import java.time.Period;

public class DateTime {

	public static void main(String[] args) {
		LocalDateTime d1=LocalDateTime.of(2020,12,1,11,20,20);
		LocalDateTime d2=LocalDateTime.of(2021,12,1,11,20,20);
		Duration dur=Duration.between(d1, d2);
		System.out.println(dur.getSeconds());
		
		LocalDate d3=LocalDate.of(2020,12,1);
		LocalDate d4=LocalDate.of(2021,12,1);
		Period per=Period.between(d4, d3);
		System.out.println(per.getDays());

	}

}
