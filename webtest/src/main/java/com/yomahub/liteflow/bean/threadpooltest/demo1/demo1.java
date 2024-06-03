package com.yomahub.liteflow.bean.threadpooltest.demo1;

import java.util.concurrent.CompletableFuture;

/**
 * @param
 * @author Joy
 * @date 2024/5/5
 */

public class demo1 {
	public static void main(String[] args) {
		// ExecutorService threadPool = Executors.newFixedThreadPool(5);
		// for (int i = 0; i < 5; i++) {
		// 	Future<?> submit = threadPool.submit(() -> {
		// 		System.out.println("current thread name" + Thread.currentThread().getName());
		// 		Object object = null;
		// 		System.out.print("result## " + object.toString());
		// 	});
		//
		// 	threadPool.execute(() -> {
		// 		System.out.println("current thread name" + Thread.currentThread().getName());
		// 		Object object = null;
		// 		System.out.print("result## " + object.toString());
		// 	});
		// }


		CompletableFuture.runAsync(() -> {
			System.out.println("current thread name" + Thread.currentThread().getName());
			Object object = null;
			System.out.print("result## " + object.toString());

			// return "aaa";

		}).join();


		// // 线程池核心线程数设置为 0
		// ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
		// 		0, 10, 1, TimeUnit.SECONDS,
		// 		new ArrayBlockingQueue<>(10));
		// // 给线程池添加任务
		// threadPoolExecutor.execute(() -> {
		// 	System.out.println("www.javacn.site");
		// });

		// CompletableFuture.completedFuture()


		// String join = future.join();

		// threadPool.shutdown();


		// threadPool.execute();

		// ExecutorService executor = Executors.newCachedThreadPool();
		// for (int i = 0; i < 5; i++) {
		// 	executor.execute(() -> {
		// 		System.out.println(Thread.currentThread().getName()+"正在执行");
		// 	});
		// }
		//
		// executor.shutdown();


		// String join = CompletableFuture.supplyAsync(() -> "aaaa").join();
		// System.out.println("join = " + join);
		//
		// CompletableFuture<String> aaa = CompletableFuture.supplyAsync(() -> "aaaa");
		// CompletableFuture<String> bbb = CompletableFuture.supplyAsync(() -> "bbb");
		// CompletableFuture<String> ccc = CompletableFuture.supplyAsync(() -> "ccc");
		//
		// CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(aaa, bbb, ccc);
		// Void join1 = voidCompletableFuture.join();
		//


	}
}
