package com.yomahub.liteflow.bean.flyweightpattern;

/**
 * @Author: Joy
 * @Date: 2023/12/28 16:48
 * @Description:
 */
public class Square implements Shape {

	private final Color color;

	private final double sideLength;


	public Square(Color color, double sideLength) {
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
