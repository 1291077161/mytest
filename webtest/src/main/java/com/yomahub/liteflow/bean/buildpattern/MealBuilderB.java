package com.yomahub.liteflow.bean.buildpattern;

import java.math.BigDecimal;

// 套餐B
public class MealBuilderB extends MealBuilder {

	@Override
	public void buildFood() {
		meal.setFood("一个牛肉汉堡");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("一杯果汁");
	}

	@Override
	public void buildPrice() {
		meal.setPrice(new BigDecimal("38"));
	}
}