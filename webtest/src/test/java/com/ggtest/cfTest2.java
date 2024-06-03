package com.ggtest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class cfTest2 {
	public static void main(String[] args) throws InterruptedException {
		CompletableFuture<Long> cf = CompletableFuture.supplyAsync(() -> {
			System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
			long count = 0L;
			for (long i = 0; i <= 1000000L; i++) {
				count = i * i / 2;
			}
			return count;
		});
		TimeUnit.SECONDS.sleep(5);

		//CompletableFuture.
		//Executors.
		String [] arr = {"aa","bb","cc","dd","dd"};
		int [] irr = {1,2,3};

		new Function<String,String>() {
			@Override
			public String apply(String o) {
				return null;
			}
		};


		System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
		System.out.println("cf.getNow(99L) = " + cf.getNow(99L));


	}
}
