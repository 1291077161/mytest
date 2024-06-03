package com.yomahub.liteflow.bean.algra;

public interface Demo3 {
	public abstract void greet();

	public abstract void exercise();

	void study();   //默认隐含public abstract修饰符
}

abstract class Imple1 implements Demo3 {
	//实现类Imple1类是抽象类，允许拥有抽象方法，因此可以不实现接口中的方法。
}

class Imple2 implements Demo3 {

	@Override
	public void greet() {
		System.out.println("嗨，你好！");
	}

	@Override
	public void exercise() {
		System.out.println("文明其精神，野蛮其体魄！");
	}

	@Override
	public void study() {
		System.out.println("好好学习，天天向上！");
	}
}

class Test3 {
	public static void main(String[] args) {
		Demo3 d3 = new Imple2();
		d3.greet();
		d3.exercise();
		d3.study();
	}
}