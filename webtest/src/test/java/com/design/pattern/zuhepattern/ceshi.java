package com.design.pattern.zuhepattern;

public class ceshi {
	public static void main(String[] args) {
		Component school = new School("清华大学");

		Component college1 = new College("计算机学院");
		college1.add(new Department("软件工程"));
		college1.add(new Department("网络工程"));

		Component college2 = new College("信息工程学院");
		college2.add(new Department("通信工程"));
		college2.add(new Department("信息工程"));

		school.add(college1);
		school.add(college2);

		school.display();
	}
}
