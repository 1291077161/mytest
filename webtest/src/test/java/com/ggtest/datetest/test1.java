package com.ggtest.datetest;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class test1 {
	public static void main(String[] args) {

		//System.out.println("LocalDate.now() = " + LocalDate.now());
		//System.out.println("LocalDate.of(2020,1,10) = " + LocalDate.of(2020, 1, 10));
		//
		//System.out.println("LocalTime.now() = " + LocalTime.now());
		//System.out.println("LocalDateTime.now() = " + LocalDateTime.now());
		//System.out.println("Instant.now() = " + Instant.now());

		LocalDate localDate = LocalDate.of(2019, 9, 10);
		String s1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		//自定义格式化
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String s3 = localDate.format(dateTimeFormatter);

		System.out.println("Instant.now() = " + Instant.now());
		System.out.println("new Date() = " + new Date());


	}
}
