package com.multiplethread;

public class ThreadTest {
	public static void main(String[] args) {
		//
		//try {
		//	MyThread thread = new MyThread();
		//	thread.start();
		//	//Thread.sleep(10);
		//	//TimeUnit.SECONDS.sleep(10);
		//	thread.interrupt();
		//	thread.join();
		//	//System.out.println("ccc" + thread.isInterrupted());
		//	//System.out.println("ccc" + thread.isInterrupted());
		//	//Thread.currentThread().interrupt();
		//
		//	System.out.println("bbb" + thread.interrupted());
		//	System.out.println("aaa" + thread.interrupted());
		//} catch (Exception e) {
		//	System.out.println("main catch");
		//	e.printStackTrace();
		//}
		MyThread thread = new MyThread();
		thread.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.start();

	}



}

