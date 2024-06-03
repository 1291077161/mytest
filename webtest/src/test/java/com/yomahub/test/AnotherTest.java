package com.yomahub.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AnotherTest extends Thread implements Runnable {


	public static void main(String[] args) {
		//new Thread() {
		//	private volatile int num = 0;
		//	private AtomicInteger val = new AtomicInteger();
		//	StringBuilder sb = new StringBuilder();
		//	@Override
		//	public void run() {
		//		for (int i = 0; i < 500; i++) {
		//			sb.append("aaaaaaaa");
		//			sb.append(val.get());
		//			val.addAndGet(100);
		//			sb.append(",").append(val.get());
		//			System.out.println("sb=" + sb);
		//		}
		//	}
		//}.start();
		//System.out.println("String.class.getClassLoader() = " + String.class.getClassLoader());
		System.out.println("AnotherTest.class.getClassLoader() = " + AnotherTest.class.getClassLoader());
		System.out.println("AnotherTest.class.getClassLoader().getParent() = " + AnotherTest.class.getClassLoader().getParent());
		//System.out.println("AnotherTest.class.getClassLoader().getParent().getParent() = " + AnotherTest.class.getClassLoader().getParent().getParent());
		//System.out.println("AnotherTest.class.getClassLoader().getParent().getParent().getParent().getParent() = " + AnotherTest.class.getClassLoader().getParent().getParent().getParent());

		//Class clazz = Class.forName



		int i = Runtime.getRuntime().availableProcessors();
		System.out.println("i = " + i);
		//IntStream.rangeClosed(1,10).mapToObj()


	}

	static {
		try {
			Properties p = new Properties();
			InputStream resourceAsStream = AnotherTest.class.getClassLoader().getResourceAsStream("banner.txt");
			p.load(resourceAsStream);
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
		}
		//p.getProperty()

	}

}
