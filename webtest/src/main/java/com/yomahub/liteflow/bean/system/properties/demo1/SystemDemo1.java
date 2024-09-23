package com.yomahub.liteflow.bean.system.properties.demo1;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class SystemDemo1 {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		properties.forEach((key, value) -> {
			log.info("key:{}, value:{}", key, value);
		});
	}
}
