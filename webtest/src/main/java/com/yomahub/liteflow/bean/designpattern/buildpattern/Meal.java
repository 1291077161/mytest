package com.yomahub.liteflow.bean.designpattern.buildpattern;

import lombok.Data;

import java.math.BigDecimal;

/**
 * kfc套餐，包括吃的，喝的
 */
@Data
public class Meal {
	private String food;
	private String drink;
	private BigDecimal price;
}