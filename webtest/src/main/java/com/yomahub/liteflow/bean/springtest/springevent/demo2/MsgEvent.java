package com.yomahub.liteflow.bean.springtest.springevent.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MsgEvent {

	/**
	 * 该类型事件携带的信息
	 */
	public String orderId;
}
