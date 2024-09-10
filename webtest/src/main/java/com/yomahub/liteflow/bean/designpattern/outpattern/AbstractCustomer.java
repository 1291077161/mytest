package com.yomahub.liteflow.bean.designpattern.outpattern;

// 客户
public abstract class AbstractCustomer {
	protected IMedium medium;
	protected String name;

	public AbstractCustomer(String name) {
		this.name = name;
	}

	public IMedium getMedium() {
		return medium;
	}

	public void setMedium(IMedium medium) {
		this.medium = medium;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void send(String ad);

	public abstract void receive(String from, String ad);
}
