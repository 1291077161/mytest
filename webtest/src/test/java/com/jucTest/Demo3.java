package com.jucTest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class Demo3 {
	// static ReentrantLock lock = new ReentrantLock();
	// static Condition condition = lock.newCondition();

	private static final Object object = new Object();

	public static void main(String[] args) throws InterruptedException {

		Thread s1 = new Thread() {
			public void run() {
				this.setName("aa");
				// super.run();
				synchronized (object) {
					System.out.println(Thread.currentThread().getName() + "获得了锁");
					LockSupport.park();
					System.out.println("运行结束，释放锁");
				}

			}
		};

		Thread s2 = new Thread() {
			public void run() {
				this.setName("bb");
				// super.run();
				synchronized (object) {
					System.out.println(Thread.currentThread().getName() + "获得了锁");
					LockSupport.park();
					System.out.println("运行结束，释放锁");
				}

			}
		};

		s1.start();
		s2.start();
		TimeUnit.SECONDS.sleep(1);

		LockSupport.unpark(s1);

		TimeUnit.SECONDS.sleep(1);

		LockSupport.unpark(s2);

		// LockSupport.park();
	}
}