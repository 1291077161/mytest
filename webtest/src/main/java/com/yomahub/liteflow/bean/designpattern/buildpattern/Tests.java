package com.yomahub.liteflow.bean.designpattern.buildpattern;

public class Tests {
  public static void main(String[] args) {
        Meal m = new Meal();
        MealBuilder mealA = new MealBuilderA();
        Waiter waiter = new Waiter();
        waiter.setMeal(mealA);
        Meal meal = waiter.construct();
        System.out.println("顾客一，套餐：" + meal.toString());
        
        MealBuilder mealB = new MealBuilderB();
        waiter.setMeal(mealB);
        meal = waiter.construct();
        
        System.out.println("顾客二，套餐：" + meal.toString());
    }
}