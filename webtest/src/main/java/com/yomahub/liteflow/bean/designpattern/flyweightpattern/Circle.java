package com.yomahub.liteflow.bean.designpattern.flyweightpattern;

/**
 * @Author: Joy
 * @Date: 2023/12/28 16:46
 * @Description: 具体享元类
 */
public class Circle implements Shape {

	private final Color color;

	private final double radius;

	public Circle(Color color, double radius) {
		this.color = color;
		this.radius = radius;
	}

	@Override
	public Color getColor() {
		return color;
	}

	public double getRadius() {
		return radius;
	}
}
