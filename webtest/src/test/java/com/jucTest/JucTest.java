package com.jucTest;

import java.util.concurrent.TimeUnit;

public class JucTest {
	public static class T extends Thread {
		@Override
		public void run() {
			while (true) {
				//循环处理业务
				//下面模拟阻塞代码
				try {
					TimeUnit.SECONDS.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					this.interrupt();
				}
				if (this.isInterrupted()) {
					System.out.println("线程被中断了");
					break;
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		T t = new T();
		t.start();
		TimeUnit.SECONDS.sleep(1);
		t.interrupt();
	}
}
