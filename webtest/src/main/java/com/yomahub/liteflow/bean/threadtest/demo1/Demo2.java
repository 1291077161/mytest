package com.yomahub.liteflow.bean.threadtest.demo1;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

/**
 * @param
 * @author Joy
 * @date 2024/5/24
 */

@Slf4j
public class Demo2 {
	@SneakyThrows
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(5);

		for (int i = 0; i < 3; i++) {
			new Thread(() -> {
				System.out.println(Thread.currentThread().getName() + " is working...");
				// 模拟工作时间
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				latch.countDown();
				System.out.println(Thread.currentThread().getName() + " has finished.");
			}).start();
		}

		latch.countDown();
		// latch.countDown();
		// latch.countDown();
		// latch.countDown();
		// latch.countDown();

		try {
			// 主线程等待，直到计数器减为零
			latch.await();
			log.info("All tasks are completed.");
			// System.out.println("All tasks are completed.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		System.out.println("----------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		Thread.sleep(2000);

		// for (int i = 0; i < 3; i++) {
		// 	new Thread(() -> {
		// 		System.out.println(Thread.currentThread().getName() + " is working...");
		// 		// 模拟工作时间
		// 		try {
		// 			Thread.sleep(1000);
		// 		} catch (InterruptedException e) {
		// 			e.printStackTrace();
		// 		}
		// 		latch.countDown();
		// 		System.out.println(Thread.currentThread().getName() + " has finished.");
		// 	}).start();
		// }
		//
		// try {
		// 	latch.await(); // 主线程等待，直到计数器减为零
		// 	System.out.println("All tasks are completed.");
		// } catch (InterruptedException e) {
		// 	e.printStackTrace();
		// }



	}


}
