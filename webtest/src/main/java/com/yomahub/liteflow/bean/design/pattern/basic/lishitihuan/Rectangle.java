package com.yomahub.liteflow.bean.design.pattern.basic.lishitihuan;

// Rectangle(长方形)
public class Rectangle {
	private int length;
	private int width;

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;

	}
}

// Square(正方形)
class Square extends Rectangle {
	// 设置边长
	@Override
	public void setLength(int length) {
		super.setLength(length);
		super.setWidth(length);
	}

	@Override
	public void setWidth(int width) {
		super.setLength(width);
		super.setWidth(width);
	}
}




