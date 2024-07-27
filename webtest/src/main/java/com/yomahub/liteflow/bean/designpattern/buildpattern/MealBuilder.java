package com.yomahub.liteflow.bean.designpattern.buildpattern;

/**
 * 制作套餐
 */
public abstract class MealBuilder {
	protected Meal meal = new Meal();

	public abstract void buildFood();

	public abstract void buildDrink();

	public abstract void buildPrice();

	public Meal getMeal() {
		return meal;
	}
}