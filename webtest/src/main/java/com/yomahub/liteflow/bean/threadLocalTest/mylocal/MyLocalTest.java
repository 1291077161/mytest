package com.yomahub.liteflow.bean.threadLocalTest.mylocal;

import java.util.HashMap;
import java.util.Map;

public class MyLocalTest {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("map1", "map1");
		Map<String, String> map2 = new HashMap<>();
		map2.put("map2", "map2");



		ThreadLocal<Map<String, String>> threadLocal1 = new ThreadLocal<>();
		ThreadLocal<Map<String, String>> threadLocal2 = new ThreadLocal<>();

		threadLocal1.set(map1);
		Map<String, String> stringStringMap1 = threadLocal1.get();

		threadLocal1.set(map2);
		Map<String, String> stringStringMap2 = threadLocal1.get();

		threadLocal2.set(map2);

		Thread thread = Thread.currentThread();
		thread.setPriority(10);

		// thread.threadLocals



		boolean daemon = thread.isDaemon();
		System.out.println("daemon = " + daemon);


		// Map<String, String> stringStringMap2 = threadLocal2.get();
		//
		// System.out.println("stringStringMap2.toString() = " + stringStringMap2.toString());

	}
}
