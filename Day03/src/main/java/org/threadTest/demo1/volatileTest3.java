package org.threadTest.demo1;

import java.util.concurrent.atomic.AtomicInteger;


public class volatileTest3 {


	public AtomicInteger inc = new AtomicInteger();

	public void increase() {
		inc.getAndIncrement();
	}

	public static void main(String[] args) {
		final volatileTest3 test = new volatileTest3();
		for (int i = 0; i < 10; i++) {
			new Thread() {

				public void run() {

					System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
					for (int j = 0; j < 100; j++)
						test.increase();
				}

				;
			}.start();
		}

		while (Thread.activeCount() > 1) // 保证前⾯的线程都执⾏完
			Thread.yield();
		System.out.println("add AtomicInteger, inc output:" + test.inc);
	}
}