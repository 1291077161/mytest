package com.ggtest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CfTest {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		CompletableFuture<Object> cf = new CompletableFuture<>();
		CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> "nihao").thenApply(item -> item);
		CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> "shabi").thenCompose(item -> {
			return CompletableFuture.supplyAsync(() -> item + "aa");
		});
		CompletableFuture<String> cf3 = CompletableFuture.supplyAsync(() -> "shabi")
				.thenComposeAsync(item -> CompletableFuture.supplyAsync(() -> "aaa"));

		CompletableFuture<String> cf4 = CompletableFuture.supplyAsync(() -> {
			//try {
				//TimeUnit.SECONDS.sleep(1);
				//System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
			//} catch (InterruptedException e) {
			//	throw new IllegalStateException(e);
			//}
			return "Some Result";
		}).thenApply(result -> {
    /*
      Executed in the same thread where the supplyAsync() task is executed
      or in the main thread If the supplyAsync() task completes immediately (Remove sleep() call to verify)
    */
			System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
			return "Processed Result";
		});

		System.out.println("cf4.join() = " + cf4.join());


		//System.out.println("cf3.join() = " + cf3.join());
		//
		//System.out.println("cf1.join() = " + cf1.join());
		//System.out.println("cf2.join() = " + cf2.join());


		String name = Thread.currentThread().getName();
		System.out.println("name = " + name);
		//Object o = cf.get();
		cf.complete("fnuiasfh");

	}
}

