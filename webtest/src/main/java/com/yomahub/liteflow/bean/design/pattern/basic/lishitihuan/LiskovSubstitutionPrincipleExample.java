package com.yomahub.liteflow.bean.design.pattern.basic.lishitihuan;

interface Flyable {
	void fly();
}

class Bird {
	// Bird 的其他方法和属性
}

class Sparrow extends Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("Sparrow is flying");
	}
}

class Penguin extends Bird {
	// Penguin 特有的方法和属性
}

/**
 * @param
 * @author Joy
 * @date 2024/7/2
 */

class LiskovSubstitutionPrincipleExample {
	public static void letBirdFly(Flyable bird) {
		bird.fly();
	}

	public static void main(String[] args) {
		Flyable sparrow = new Sparrow();
		// 这行代码工作正常
		letBirdFly(sparrow);


		// Penguin 不实现 Flyable 接口，所以不能传递给 letBirdFly 方法
	}
}
