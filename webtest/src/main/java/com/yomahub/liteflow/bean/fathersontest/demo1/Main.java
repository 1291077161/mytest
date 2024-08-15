package com.yomahub.liteflow.bean.fathersontest.demo1;

class Parent {
	public int variable = 10;

	public void printVariable() {
		System.out.println("Parent variable: " + variable);
	}
}

class Child extends Parent {
	public int variable = 20;

	@Override
	public void printVariable() {
		System.out.println("Child variable: " + variable);
	}
}

public class Main {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		Parent parentRefChild = new Child();

		System.out.println("Parent instance:");
		System.out.println(parent.variable); // 输出 10
		parent.printVariable(); // 输出 Parent variable: 10

		System.out.println("\nChild instance:");
		System.out.println(child.variable); // 输出 20
		child.printVariable(); // 输出 Child variable: 20

		System.out.println("\nParent reference to Child instance:");
		System.out.println(parentRefChild.variable); // 输出 10
		parentRefChild.printVariable(); // 输出 Child variable: 20
	}
}
