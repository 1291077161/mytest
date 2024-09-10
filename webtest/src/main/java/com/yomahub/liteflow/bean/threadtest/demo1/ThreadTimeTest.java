package com.yomahub.liteflow.bean.threadtest.demo1;


import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class ThreadTimeTest {
	Logger logger = Logger.getLogger("aa");

	public static void main(String[] args) {

		// 这个使用的是非守护线程
		Thread thread = new Thread() {
			@SneakyThrows
			@Override
			public void run() {
				TimeUnit.SECONDS.sleep(2);
				System.out.println("aaa");
			}
		};
		thread.setDaemon(true);

		thread.start();

		// 这个使用的是守护线程
		// CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
		// 	System.out.println("5......");
		// 	return "zhuZi";
		// });


	}
}
