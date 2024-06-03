package com.ggtest.aa;

public class SynchronizedMethodTest {

	synchronized public void printHello() throws InterruptedException {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++){
			System.out.println("Hello " + name);
			Thread.sleep(1000);
		}
	}

	synchronized public void printByeBye() throws InterruptedException {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++){
			System.out.println("Bye Bye " + name);
			Thread.sleep(1000);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		SynchronizedMethodTest s1 = new SynchronizedMethodTest();

		new Thread(() -> {
			System.out.println("Thread1 is start");
			//synchronized (s1) {
				try {
					//s1.printHello();
					s1.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread1 is end");
			//}

		}).start();

		new Thread(() -> {
			System.out.println("Thread2 is start");
			try {
				s1.printByeBye();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread2 is end");

		}).start();
	}
}
