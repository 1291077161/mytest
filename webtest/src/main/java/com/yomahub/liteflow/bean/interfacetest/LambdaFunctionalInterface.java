package com.yomahub.liteflow.bean.interfacetest;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface LambdaFunctionalInterface {
	void f();
}

class LambdaClass {
	public static void forEg() {
		lambdaInterfaceDemo(() -> System.out.println("自定义函数式接口"));
	}

	//函数式接口参数
	static void lambdaInterfaceDemo(LambdaFunctionalInterface i) {
		i.f();
		System.out.println(i.toString());
	}


	public static void main(String[] args) {
		forEg();


		String s = "aaaa";

		// ImmutableList<Integer> integers = ImmutableList.of(1, 2, 3, 4, 5);
		// Stream<Integer> stream = integers.stream();
		// stream.map(item -> {
		//     item = 3;
		//     return item;
		// }).forEach(item -> {
		//     if (item > 2) {
		//         item = 10;
		//     }
		//     System.out.println(item);
		// });

		// 获取运行时环境
		Runtime runtime = Runtime.getRuntime();

		// 打印JVM的初始内存和最大内存配置
		System.out.println("JVM初始内存大小：" + runtime.totalMemory() / (1024 * 1024) + " MB");
		System.out.println("JVM最大内存大小：" + runtime.maxMemory() / (1024 * 1024) + " MB");

		// int i = Integer.parseInt(s);
		// System.out.println("i = " + i);


		List<String> a = new ArrayList<String>();
		// String s1 = a.get(0);

		// String orElseGet = Optional.ofNullable(a.get(0)).orElseGet(() -> "");


	}
}