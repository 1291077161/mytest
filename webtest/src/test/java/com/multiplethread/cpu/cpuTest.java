package com.multiplethread.cpu;

import java.util.HashMap;
import java.util.Map;

public class cpuTest {
	public static void main(String[] args) {

		//List<String> l1 = new ArrayList<String>();
		//Collection<Integer> l2 = new ArrayList<Integer>();
		//List<?> l3 = new ArrayList<>();
		//
		//
		//l2.add(44);
		////l3.add();
		//l3.size();
		////l3.add();
		//l1.add("aaa");
		//
		//System.out.println(l1.getClass() == l2.getClass());
		//Runnable run = new


		Map<Long, String> map = new HashMap<Long, String>();
		map.put(222L,"aaaa");
		map.put(333L,"aaaa");
		map.put(444L,"aaaa");
		map.put(555L,"aaaa");
		map.put(666L,"aaaa");
		map.forEach((k,v) -> {

		});



		//Student s1 = new Student("aa",1);
		//Student s2 = new Student("aa",1);
		//
		//System.out.println("s1 == s2 = " + (s1.equals(s2)));
		//System.out.println("s1 == s2 = " + (s1 == s2));
		//throw new IOException("aa");
		//throw  new RuntimeException("aaaaaa");


		//cpuTest.class.getClassLoader().getParent().getParent().getParent().getParent();
		//while (true) {
		//
		//}
		//System.out.println("Runtime.getRuntime().availableProcessors() = " + Runtime.getRuntime().availableProcessors());
		////获取逻辑核心数，如6核心12线程，那么返回的是12
		//new Thread() {
		//	@Override
		//	public void run() {
		//		super.run();
		//	}
		//}.join();

		//
		//CompletableFuture<String> future = CompletableFuture.completedFuture("hello!")
		//		.thenApply(s -> s + "world!");
		//assertEquals("hello!world!", future.get());
		//// 这次调用将被忽略。
		//future.thenApply(s -> s + "nice!");
		//assertEquals("hello!world!", future.get());

















	}
}
