package com.yomahub.liteflow.bean.selfexam.ThreadTest;

/**
 * @param
 * @author Joy
 * @date 2024/3/28
 */

public class ThreadTest1 implements Runnable {

	 volatile int task = 20;


	@Override
	public void run() {

		// synchronized (this) {
		while (task > 0) {
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (this) {
				// if (task > 0) {
					System.out.println(Thread.currentThread().getName() + ": 正在完成第 ：" + +(task--) + "    项任务");
				// }
			}
		}

		// }


	}

	public static void main(String[] args) {
		ThreadTest1 threadTest1 = new ThreadTest1();
		new Thread(threadTest1, "线程1++++").start();
		new Thread(threadTest1, "线程2====").start();

	}
}
