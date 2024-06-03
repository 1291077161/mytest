package com.yomahub.liteflow.bean.flyweightpattern;

/**
 * @Author: Joy
 * @Date: 2023/12/28 16:49
 * @Description:
 */
public class Triangle implements Shape {

	private final Color color;

	private final double sideLength;

	public Triangle(Color color, double sideLength) {
		this.color = color;
		this.sideLength = sideLength;
	}

	@Override
	public Color getColor() {
		return color;
	}

	public double getSideLength() {
		return sideLength;
	}
}
