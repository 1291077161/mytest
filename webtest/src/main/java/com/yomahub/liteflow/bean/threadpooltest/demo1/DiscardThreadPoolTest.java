package com.yomahub.liteflow.bean.threadpooltest.demo1;

import java.util.concurrent.*;

/**
 * 关注公众号：捡田螺的小男孩
 */
public class DiscardThreadPoolTest {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		// 一个核心线程，队列最大为1，最大线程数也是1.拒绝策略是DiscardPolicy
		ThreadPoolExecutor executorService = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.MINUTES,
				new ArrayBlockingQueue<>(1), new ThreadPoolExecutor.DiscardPolicy());


		int i = 8 >> 2;
		System.out.println("i = " + i);
		// SynchronousQueue
		// CopyOnWriteArrayList

		// ThreadPoolBuilder

		//
		// Future f1 = executorService.submit(() -> {
		// 	System.out.println("提交任务1");
		// 	try {
		// 		Thread.sleep(3000);
		// 	} catch (InterruptedException e) {
		// 		e.printStackTrace();
		// 	}
		// });
		//
		// Future f2 = executorService.submit(() -> {
		// 	System.out.println("提交任务2");
		// });
		//
		// Future f3 = executorService.submit(() -> {
		// 	System.out.println("提交任务3");
		// });
		//
		// // 等待任务1执行完毕
		// System.out.println("任务1完成" + f1.get());
		// // 等待任务2执行完毕
		// System.out.println("任务2完成" + f2.get());
		// // 等待任务3执行完毕
		// System.out.println("任务3完成" + f3.get());

		// 关闭线程池，阻塞直到所有任务执行完毕
		// executorService.shutdown();


		int size = Integer.SIZE;

		boolean s = size > 45 ? false : true;

	}
}

