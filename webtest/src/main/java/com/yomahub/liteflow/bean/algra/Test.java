package com.yomahub.liteflow.bean.algra;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		//注意事项
		//1.抽象类只能通过子类创建对象(抽象类不能创建对象)。
		//Fu f = new Fu();//error
		//2.抽象类可以有构造器，供子类初始化父类成员。
		Zi zi = new Zi();
		String aaa = zi.getAaa();
		List<String> list = zi.getList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		System.out.println("zi.aaa = " + zi.aaa);

		aaa = "cccc";

		String aaa1 = zi.getAaa();

		//5.抽象类存在的意义是为了被子类继承，体现的是模板思想。

	}
}

abstract class Fu {

	private static final int a = 100;

	public Fu() {
		System.out.println("抽象父类的无参构造");
	}

	public abstract void method();

}

//3.抽象类中，不一定包含抽象方法。（有抽象方法的类一定是抽象类，抽象类不一定有抽象方法）
abstract class Fu2 {

}

class Zi extends Fu {

	private List<String> list = new ArrayList<>();

	public String aaa = new String("aaa");

	public Zi() {
		System.out.println("子类的无参构造");
	}

	@Override
	public void method() {
	}

	public String getAaa() {
		return this.aaa;
	}

	public List<String> getList() {
		return this.list;
	}
}

//4.抽象类的子类，必须重写抽象父类中"所有的"抽象方法，否则子类也必须定义成抽象类
abstract class Zi2 extends Fu {

}

