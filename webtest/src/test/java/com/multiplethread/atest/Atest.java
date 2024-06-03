package com.multiplethread.atest;

public class Atest {
	public static void main(String[] args) {
		Thread a = new Thread() {
			@Override
			public void run() {
				while (!this.isInterrupted()) {
					System.out.println("aaaaaa");
				}
			}
		};


		a.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		a.interrupt();

		//new Runnable() {
		//	@Override
		//	public void run() {
		//
		//	}
		//};


	}
}
