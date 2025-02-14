package com.yomahub.liteflow.bean.springtest.springevent.demo1;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderProductListener implements ApplicationListener<OrderProductEvent> {

	/**
	 * 使用 onApplicationEvent 方法对消息进行接收处理
	 */
	@SneakyThrows
	@Override
	public void onApplicationEvent(OrderProductEvent event) {
		String orderId = event.getOrderId();
		long start = System.currentTimeMillis();
		Thread.sleep(2000);
		long end = System.currentTimeMillis();
		log.info("{}：校验订单商品价格耗时：({})毫秒", orderId, (end - start));
	}
}
