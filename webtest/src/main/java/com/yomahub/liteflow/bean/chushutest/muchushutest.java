package com.yomahub.liteflow.bean.chushutest;

public class muchushutest {
	public static void main(String[] args) {
		int total = 1500;
		int maxPageSize = 1000000;
		int page1 = total % maxPageSize;
		int page = total / maxPageSize;
		System.out.println("page1 = " + page1);
		System.out.println("page = " + page);
		// if (page1 == 0) {
		//
		// 	return page;
		//
		// } else {
		//
		// 	return page + 1;
		// }
	}
}
