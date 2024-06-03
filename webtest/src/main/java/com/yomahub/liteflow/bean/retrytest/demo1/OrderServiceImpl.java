package com.yomahub.liteflow.bean.retrytest.demo1;

import lombok.SneakyThrows;

class OrderServiceImpl {

	@SneakyThrows
	public static void main(String[] args) {



		new Thread() {

			@SneakyThrows
			@Override
			public void run() {
				super.run();
				while (true) {
					System.out.println("子休眠1s");
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		}.start();

		Thread.sleep(2000);
		System.out.println("主线程结束");


	}


}







