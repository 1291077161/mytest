package com.yomahub.liteflow.bean.properties;

import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("aa","aa");
		boolean empty = properties.isEmpty();
	}
}

