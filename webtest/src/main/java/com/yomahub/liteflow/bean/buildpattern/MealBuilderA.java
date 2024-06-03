package com.yomahub.liteflow.bean.buildpattern;

import java.math.BigDecimal;

// 套餐A
public class MealBuilderA extends MealBuilder {

	@Override
	public void buildFood() {
		meal.setFood("一个鸡腿汉堡");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("一杯可乐");
	}

	@Override
	public void buildPrice() {
		meal.setPrice(new BigDecimal("30"));
	}
}