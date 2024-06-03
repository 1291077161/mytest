package com.yomahub.liteflow.bean.outpattern;

// 买方
public class Buyer extends AbstractCustomer {
	public Buyer(String name) {
		super(name);
	}

	@Override
	public void send(String ad) {
		System.out.println("我(买方)说: " + ad + "");
		medium.relay(name, ad);
	}

	@Override
	public void receive(String from, String ad) {
		System.out.println(from + "(卖方)说: " + ad + "(转发)");
	}
}
