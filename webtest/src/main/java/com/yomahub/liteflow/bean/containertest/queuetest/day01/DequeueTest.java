package com.yomahub.liteflow.bean.containertest.queuetest.day01;

import java.util.ArrayDeque;

/**
 *
 * @author Joy
 * @date 2024/6/17
 * @param
 *
 */

public class DequeueTest {

	private static final ArrayDeque<String> ARRAY_DEQUE = new ArrayDeque<>(2);
	public static void main(String[] args) {

		// ARRAY_DEQUE.add("aa");
		ARRAY_DEQUE.offer("bb");
		ARRAY_DEQUE.offer("cc");
		ARRAY_DEQUE.offer("dd");
		boolean ee = ARRAY_DEQUE.offer("ee");
		System.out.println("ee = " + ee);

		System.out.println("ARRAY_DEQUE = " + ARRAY_DEQUE);

	}
}
