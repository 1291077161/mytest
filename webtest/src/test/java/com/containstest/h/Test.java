package com.containstest.h;

public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}
}

class Fu {
	int num = 10;

	public Fu() {

	}
}

class Zi extends Fu {
	int num = 20;

	public void show() {
		int num = 30;
		System.out.println(this.num);
		System.out.println(num);
		System.out.println(super.num);
	}
}