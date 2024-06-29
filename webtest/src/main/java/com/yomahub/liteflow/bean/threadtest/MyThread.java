package com.yomahub.liteflow.bean.threadtest;

import lombok.SneakyThrows;

public class MyThread extends Thread {

	private static final Thread thread = new Thread();


	@Override
	public void run() {
		thread.start();
		// super.run();
	}

	@SneakyThrows
	public static void main(String[] args) {
		Thread t1 = new Thread(thread);
		Thread t2 = new Thread(thread);

		// Thread t1 = new Thread(new MyThread());
		// Thread t2 = new Thread(new MyThread());

		t1.start();
		t2.start();

		Thread.sleep(2000);
		System.out.println("aaaaaaa");
	}
}
