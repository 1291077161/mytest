package com.ggtest.cc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ThreadLocaltest {
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");


	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			new Thread(() -> {
				try {
					System.out.println(DATE_FORMAT.parse("2023-01-29"));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}).start();
		}

		ThreadLocal<String> local = new ThreadLocal<>();
		local.set("aa");
		//local.get()



	}


}
