package com.yomahub.liteflow.bean.interfacetest.demo1;

/**
 *
 * @author Joy
 * @date 2024/7/3
 *
 */

public interface MyInterface {
	/**
	 *
	 */
	static void staticMethod() {
		System.out.println("Static method in MyInterface");
	}
}

class MyClass implements MyInterface {
	// MyClass可以实现MyInterface，但不能继承MyInterface的静态方法
}

class Main {
	public static void main(String[] args) {
		// 正确的调用方式
		MyInterface.staticMethod();  // 输出: Static method in MyInterface

		// 创建实现类的实例
		MyClass myClass = new MyClass();

		MyInterface myInterface = new MyClass();

		// Optional.ofNullable(null).ifPresent(System.out::println);


		// 错误的调用方式，不能通过实现类的实例调用接口的静态方法
		// myClass.staticMethod();  // 编译错误

		// 也不能通过实现类的类名调用接口的静态方法
		// MyClass.staticMethod();  // 编译错误
	}
}
