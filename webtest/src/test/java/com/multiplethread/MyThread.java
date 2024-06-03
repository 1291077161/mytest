package com.multiplethread;

public class MyThread extends Thread {
	@Override
	public void run() {
		//super.run();
		for (long i = 0L; i < 10; i++) {
			//System.out.println("i = " + (i + 1));

			//i  = i * (i + i);
			System.out.println("MyThread" + this.isInterrupted());
		}
	}
}
