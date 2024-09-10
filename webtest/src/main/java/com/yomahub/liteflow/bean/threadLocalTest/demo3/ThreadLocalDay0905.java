package com.yomahub.liteflow.bean.threadLocalTest.demo3;

/**
 *
 * @author Joy
 * @date 2024/9/5
 *
 */

public class ThreadLocalDay0905 {

	public static void main(String[] args) {

		ThreadLocal<String> local1 = ThreadLocal.withInitial(() -> "uuu");
		ThreadLocal<String> local2 = ThreadLocal.withInitial(() -> "uuu");
		// String a1 = local1.get();

		// FastThreadLocal


		local1.set("aaa");
		local1.set("bbb");
		local1.set("ccc");

		String a2 = local1.get();
		System.out.println("string = " + a2);


	}
}
