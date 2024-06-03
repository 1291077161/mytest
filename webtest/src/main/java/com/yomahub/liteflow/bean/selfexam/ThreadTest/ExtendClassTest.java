package com.yomahub.liteflow.bean.selfexam.ThreadTest;

import lombok.*;

import java.math.BigDecimal;

/**
 *
 * @author Joy
 * @date 2024/3/28
 * @param
 *
 */
// @Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtendClassTest {
	private int a;
	private int b;

	public void setA(int a) {
		System.out.println("this.a = " + this.a);
		// this.a = a;
		System.out.println("this.a = " + this.a);
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
}

@ToString
@EqualsAndHashCode(callSuper = true)
class Son extends ExtendClassTest {
	private int c;

	private String d;

	private BigDecimal e;

	public Son(int a, int b
			// , int c
	) {
		super(a, b);
		// this.c = c;
	}

	public Son() {
		// super.setA(2);

	}

	public void test() {
		super.setA(2);
	}
	public void test2() {
		// super.setA(2);
		System.out.println("super.getA() = " + super.getA());
	}
}

class Son2 {
	public static void main(String[] args) {
		Son son = new Son(
				// 1, 2
				// , 3
		);
		son.setA(2);
		// son.test();
		son.test2();

		System.out.println("son.getA() = " + son.getA());
		System.out.println("son = " + son);


	}
}
