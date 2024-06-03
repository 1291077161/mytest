package com.yomahub.liteflow.bean.interfacetest;

import org.checkerframework.checker.units.qual.C;

public class HeapSizeMonitoring {
	public static void main(String[] args) {
		// 获取运行时环境
		Runtime runtime = Runtime.getRuntime();

		// 打印JVM的初始内存和最大内存配置
		System.out.println("JVM初始内存大小：" + runtime.totalMemory() / (1024 * 1024) + " MB");
		System.out.println("JVM最大内存大小：" + runtime.maxMemory() / (1024 * 1024) + " MB");







	}
}