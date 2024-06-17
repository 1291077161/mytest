package com.yomahub.liteflow.bean.logbacktest;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

@Slf4j
public class MdcExample {

	private static final Logger logger = LoggerFactory.getLogger(MdcExample.class);

	public static void main(String[] args) {
		// 设置MDC属性
		MDC.put("userId", "123456");
		MDC.put("requestId", "987654");

		new Thread() {

			@Override
			public void run() {
				// logger.info("AAAA This is a log message with userId={} and requestId={}, thread is :{}", MDC.get("userId"), MDC.get("requestId"),Thread.currentThread().getName());

				System.out.println("AAAA This is a log message with userId={} and requestId={}, thread is :{}");
				// super.run();
			}
		}.start();

		// try {
		// 	Thread.sleep(20);
		// } catch (InterruptedException e) {
		// 	// e.printStackTrace();
		// 	log.error("ssss: {}, ccc:{}", e, e.getMessage());
		// }


		// 输出日志
		logger.info("This is a log message with userId={} and requestId={}, thread is :{}", MDC.get("userId"), MDC.get("requestId"), Thread.currentThread().getName());
		// System.out.println("aaaaa");


		// 清除MDC属性
		MDC.clear();
	}
}
