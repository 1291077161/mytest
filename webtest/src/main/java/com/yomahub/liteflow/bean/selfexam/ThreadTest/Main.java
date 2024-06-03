package com.yomahub.liteflow.bean.selfexam.ThreadTest;

import java.math.BigDecimal;

class Parent {
	private int parentValue;

	private String parentValueString;

	private BigDecimal parentValueBigDecimal;

	public Parent() {
	}

	public Parent(int value) {
		this.parentValue = value;
		System.out.println("Parent constructor called");
	}


	public int getParentValue() {
		return parentValue;
	}
}

class Child extends Parent {
	private int childValue;

	public Child(int parentValue, int childValue) {

		// 调用父类构造函数
		// super(parentValue);
		this.childValue = childValue;
		System.out.println("Child constructor called");
	}

	public void printValues() {
		// 通过父类的公有方法访问父类的属性
		System.out.println("Parent value: " + getParentValue());
		System.out.println("Child value: " + childValue);
	}
}

public class Main {
	public static void main(String[] args) {
		Child child = new Child(10, 20);
		child.printValues();
	}
}
