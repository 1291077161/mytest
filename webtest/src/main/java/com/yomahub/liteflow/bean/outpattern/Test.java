package com.yomahub.liteflow.bean.outpattern;

public class Test {
	public static void main(String[] args) {
		//房产中介
		IMedium md = new MediumImpl();
		AbstractCustomer seller, buyer;
		seller = new Seller("张三");
		buyer = new Buyer("李四");
		//客户注册
		md.register(seller);
		md.register(buyer);

		buyer.send("房子多少钱");
		System.out.println(" ------------  ");
		seller.send("100w，不能再少了");
	}
}
