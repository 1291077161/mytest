package org.springblade.springtest.demo3;

import lombok.Data;

@Data
public class Father {

	// private Son son

	private static Father father = new Father();
	// private static Son son = new Son();

	public static void main(String[] args) {
		Son son1 = new Son();
		// System.out.println("son1 = " + son1);
		Father father = new Father();
		System.out.println(father);
	}
}
