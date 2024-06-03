package com.ctest;

import lombok.SneakyThrows;

public class Ctest {

	// private static ExecutorService executor = Executors.newFixedThreadPool(2);

	@SneakyThrows
	public static void main(String[] args) {

		//CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
		//	return 10 / 0;
		//}, executor).whenComplete((res, exception) -> {
		//	//虽然能得到异常信息，但是没法修改返回数据
		//	System.out.println("supplyAsync 完成,返回值是" + res);
		//	System.out.println("异常是:" + exception);
		//}).exceptionally(thorwable -> {
		//	//出现异常返回默认值
		//	return 3333;
		//}).handle((t, u) -> {
		//	//方法执行完成后的处理
		//	if (t != null) return t * 2;
		//	if (u != null) return 0;
		//	return 0;
		//});
		//System.out.println("future.join() = " + future.join());
		//
		//executor.shutdownNow();

		// CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
		// 	throw new RuntimeException("Oops!");
		// });
		//
		// CompletableFuture<String> result = future.exceptionally(ex -> {
		// 	System.out.println("Error occurred: " + ex);
		// 	return "Default Value";
		// });
		//
		// System.out.println("result.join() = " + result.join());

		// StopWatch s = new StopWatch();
		// s.start();

		// Thread thread = Thread.currentThread();
		// Thread.currentThread().interrupt();
		// System.out.println("Thread.interrupted() = 1 " + Thread.interrupted());
		// thread.interrupt();
		// System.out.println("Thread.interrupted() = 2" + Thread.interrupted());
		// System.out.println("Thread.interrupted() = 3" + Thread.interrupted());
		// System.out.println("Thread.interrupted() = 4" + Thread.interrupted());

		// Runnable run = () -> System.out.println("aaaaaaaaaaaaa");
		//
		// Thread thread = new Thread(run);
		// thread.start();
		// System.out.println("thread.isAlive() = " + thread.isAlive());
		// TimeUnit.SECONDS.sleep(1);
		// System.out.println("thread.isAlive() = " + thread.isAlive());
		// thread.stop();
		// System.out.println("thread.isAlive() = " + thread.isAlive());
		// TimeUnit.SECONDS.sleep(1);
		// thread.start();


		String s  = "aasdss,g,g";
		System.out.println("s.substring(0,s.length() - 1) = " + s.substring(0, s.length() - 1));


	}
}
