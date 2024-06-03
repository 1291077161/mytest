package com.containstest;

public class StrTest {

	public static void main(String[] args) {
		//// 对数据进行处理，放入一个map中，key为原map中的"value"值，value为原map中的"id"值
		//Map<String, String> target = testList.stream()
		//		.collect(Collectors.toMap(
		//				t -> t.get("value"),
		//				t -> t.get("id"),
		//				// 定义 o 为原值，n 为新值，
		//				// 策略为保留原值，(o, n) -> 0；
		//				// 保留新值，覆盖原值，(o, n) -> n
		//				(o, n) -> o)
		//		);
		//target.forEach((key, value) -> System.out.println(key + ":" + value));

		//new ThreadPoolExecutor()
		//Executors.newScheduledThreadPool()
		Runnable run1 = new Thread() {
			@Override
			public void run () {
				//super.run();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable run2 = new Thread(() -> {
			System.out.println("aaaaaaaa");
		});

		Runnable run3 = new Runnable(){
			@Override
			public void run() {

			}
		};


		//Executors.
		//new ThreadPoolExecutor(.)
	}
}
