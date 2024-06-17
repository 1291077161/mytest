package com.yomahub.liteflow.bean.threadtest.juctest.retrant;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @param
 * @author Joy
 * @date 2024/6/13
 */

@Slf4j
public class Demo1 {

	final static ReentrantLock REENTRANT_LOCK = new ReentrantLock();

	final static ThreadPoolExecutor EXECUTOR = new ThreadPoolExecutor(15, 60, 5000, TimeUnit.SECONDS, new LinkedBlockingQueue<>(2000));

	public static void main(String[] args) throws InterruptedException {
		// REENTRANT_LOCK.lock();

		for (int i = 0; i < 10; i++) {
			EXECUTOR.submit(() -> {
				REENTRANT_LOCK.lock();
				REENTRANT_LOCK.lock();
				REENTRANT_LOCK.lock();
				REENTRANT_LOCK.lock();
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
				log.info("thread current current is : {}, queue length is :{}", Thread.currentThread().getName(), REENTRANT_LOCK.getQueueLength());
				REENTRANT_LOCK.unlock();
				REENTRANT_LOCK.unlock();
				REENTRANT_LOCK.unlock();
				REENTRANT_LOCK.unlock();
			});
		}

		TimeUnit.SECONDS.sleep(40);
		// EXECUTOR.shutdownNow();


		TimeUnit.SECONDS.sleep(5);
		log.info("thread pool is terminate:{}", EXECUTOR.isTerminated());


		Runnable runnable = new Runnable() {
			@Override
			public void run() {

			}
		};


		List<String> strings = new ArrayList<>();
		strings.add("111");
		strings.add("222");
		strings.add("222");


		strings.get(2);


		int[] arr = null;


	}

}
