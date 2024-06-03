package com.yomahub.liteflow.bean.threadLocalTest.mylocal;

/**
 * @author jtl
 * @date 2019/10/11 17:03
 * Thread常见的3种创建方式：Thread子类
 */

public class ThreadDemo {
	public static void main(String[] args) {
		ThreadC threadC = new ThreadC();
		threadC.setName("ThreadC");
		threadC.start();
		System.out.println("ThreadC已经执行完了 ");
	}

	private static class ThreadC extends Thread {
		@Override
		public void run() {
			Thread thread = Thread.currentThread();
			super.run();
			System.out.println("ThreadC name is: " + getName());
		}
	}
}

