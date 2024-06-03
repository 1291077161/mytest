package com.yomahub.liteflow.bean.flyweightpattern;

/**
 * @Author: Joy
 * @Date: 2023/12/28 16:54
 * @Description: 形状枚举类
 */
public enum ShapeType {

	CIRCLE(Circle.class),
	SQUARE(Square.class),
	TRIANGLE(Triangle.class);

	private Class<? extends Shape> shapeClass;

	ShapeType(Class<? extends Shape> getShapeClass) {
		this.shapeClass = shapeClass;
	}

	public Class<? extends Shape> getShapeClass() {
		return shapeClass;
	}
}




