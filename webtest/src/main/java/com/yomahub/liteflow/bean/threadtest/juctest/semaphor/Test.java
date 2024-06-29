package com.yomahub.liteflow.bean.threadtest.juctest.semaphor;

import java.util.concurrent.Semaphore;
/**
 *
 * @author Joy
 * @date 2024/6/17
 * @param
 *
 */

public class Test {
	private final Semaphore semaphore;

	/**
	 * 构造方法初始化信号量
	 *
	 * @param limit
	 */
	public Test(int limit) {
		this.semaphore = new Semaphore(limit);
	}

	public void useResource() {
		try {
			semaphore.acquire();
			// 使用资源
			System.out.println("资源use:" + Thread.currentThread().getName());
			// 模拟资源使用时间
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
			System.out.println("资源release:" + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// 限制3个线程同时访问资源
		Test pool = new Test(3);

		for (int i = 0; i < 4; i++) {
			new Thread(() -> {
				pool.useResource();
			}).start();
		}
	}
}