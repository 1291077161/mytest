package com.yomahub.liteflow.bean.threadtest.demo1;
/**
 *
 * @author Joy
 * @date 2024/6/13
 *
 */

public class AccountingSync implements Runnable {
	static AccountingSync instance = new AccountingSync();
	static int i = 0;
	static int j = 0;

	@Override
	public void run() {
		for (int j = 0; j < 1000000; j++) {
			// this,当前实例对象锁
			synchronized (this) {
				i++;
				// synchronized的可重⼊性
				increase();
			}
		}
	}

	public synchronized void increase() {
		j++;
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(instance);
		Thread t2 = new Thread(instance);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(i);
	}
}
