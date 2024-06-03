package com.yomahub.liteflow.bean.threadtest.demo1;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


@Slf4j
public class volatileTest3 {


	public AtomicInteger inc = new AtomicInteger();

	public void increase() {
		inc.getAndIncrement();
	}

	@SneakyThrows
	public static void main(String[] args) {
		final volatileTest3 test = new volatileTest3();
		for (int i = 0; i < 10; i++) {
			new Thread() {
				public void run() {
					log.info("Thread.currentThread().getName(): {}", Thread.currentThread().getName());
					for (int j = 0; j < 100; j++)
						test.increase();
				}
			}.start();
		}


		// 保证前⾯的线程都执⾏完
		// while (Thread.activeCount() > 1)
		// 	Thread.yield();
		// Thread.sleep(10, TimeUnit.SECONDS);

		TimeUnit.SECONDS.sleep(2);
		System.out.println("Thread.activeCount() = " + Thread.activeCount());
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Thread.activeCount() = " + Thread.activeCount());


		System.out.println("add AtomicInteger, inc output:" + test.inc);
		System.out.println("Thread.activeCount() = " + Thread.activeCount());
	}
}