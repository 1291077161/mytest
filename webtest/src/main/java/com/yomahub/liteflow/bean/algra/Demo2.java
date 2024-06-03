package com.yomahub.liteflow.bean.algra;

public interface Demo2 {
	public  static  final int a = 0;
	//①在JDK7.0版本之前，接口中仅支持公有的抽象方法：
	public  abstract void hello_world();

	//②从JDK8.0开始，接口中可以由默认方法和静态方法：
	//默认方法
	public default void what_time() {
		System.out.println("姥姥——姥姥——几点啦？");
	}

	//静态方法
	public static double Sum(double x, double y) {
		return x + y;
	}

	//③JDK9.0以后，接口中可以有私有方法 ：
	// private void own() {
	// 	System.out.println("这是👴的私有方法。");
	// }

	// public default void invoke_own() {
	// 	this.own();
	// }
}

class Imple implements Demo2 {
	@Override
	public void hello_world() {
		System.out.println("你好，世界！");
	}
}

class Test2 {
	public static void main(String[] args) {
		Demo2 d2 = new Imple();
		// d2.a
		d2.hello_world();
		System.out.println("---------------------------------");
		d2.what_time();
		System.out.println("传入的x与y的和 = " + Demo2.Sum(141, 135));
		System.out.println("---------------------------------");
		// d2.invoke_own();
	}
}