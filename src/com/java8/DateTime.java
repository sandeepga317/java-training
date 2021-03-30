package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class DateTime {
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		OffsetDateTime offSet = OffsetDateTime.now();
		System.out.println(offSet);
		
		ZoneId  india = ZoneId.of("Asia/Kolkata");
		
		ZonedDateTime zone1  = ZonedDateTime.of(localDateTime, india);
		System.out.println(zone1);
		
		ZoneId  america = ZoneId.of("America/Los_Angeles");
		ZonedDateTime americaZone  = zone1.withZoneSameInstant(america);
		System.out.println(americaZone);
	}

}
