package com.yomahub.liteflow.bean.outpattern;

// 卖方
public class Seller extends AbstractCustomer {
	public Seller(String name) {
		super(name);
	}

	public void send(String ad) {
		System.out.println("我(卖方)说: " + ad + "");
		medium.relay(name, ad);
	}

	public void receive(String from, String ad) {
		System.out.println(from + "(买方)说: " + ad + "(转发)");
	}
}