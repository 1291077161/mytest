package com.yomahub.liteflow.bean.designpattern.outpattern;

public interface IMedium {
	/**
	 * 客户注册
	 *
	 * @param member
	 */
	void register(AbstractCustomer member);

	/**
	 * 转发
	 *
	 * @param from
	 * @param ad
	 */
	void relay(String from, String ad);
}
