package com.yomahub.liteflow.bean.designpattern.buildpattern;

public class Waiter {
	private MealBuilder meal;

	public Meal construct() {
		meal.buildDrink();
		meal.buildFood();
		meal.buildPrice();
		return meal.getMeal();
	}

	public void setMeal(MealBuilder meal) {
		this.meal = meal;
	}
}