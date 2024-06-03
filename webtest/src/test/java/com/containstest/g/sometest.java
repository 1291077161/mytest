package com.containstest.g;

public class sometest {
	public static void main(String[] args) {

	}
}
class ggTest extends Thread {
	String s = new String();

	@Override
	public void run() {
		//super.run();
		synchronized (s) {
			System.out.println(Thread.currentThread().getName() + "获取到了锁对象");

		}
	}

	public synchronized void mythest() {

	}
}

class gg {

	public static void main(String[] args) {
		new Thread(new ggTest(),"gg1").start();
		new Thread(new ggTest(),"gg2").start();
	}
}
