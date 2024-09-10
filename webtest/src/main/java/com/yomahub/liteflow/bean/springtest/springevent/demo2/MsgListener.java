package com.yomahub.liteflow.bean.springtest.springevent.demo2;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MsgListener {

	@SneakyThrows
	@EventListener(MsgEvent.class)
	public void sendMsg(MsgEvent event) {
		String orderId = event.getOrderId();
		long start = System.currentTimeMillis();
		log.info("开发发送短信");
		log.info("开发发送邮件");
		Thread.sleep(4000);
		long end = System.currentTimeMillis();
		log.info("{}：发送短信、邮件耗时：({})毫秒", orderId, (end - start));
	}
}
