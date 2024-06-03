package com.yomahub.liteflow.bean.selfexam;

import java.util.ArrayList;
import java.util.List;

public class wuliaotest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");

		String s = list.get(0);
		String s1 = s.toUpperCase();
		// s = "eee";

		System.out.println("list = " + list);
	}
}
