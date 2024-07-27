package com.yomahub.liteflow.bean.designpattern.flyweightpattern;

/**
 * @Author: Joy
 * @Date: 2023/12/28 16:43
 * @Description: 内部状态-颜色
 */
public class Color {

	private int value;

	public Color(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}