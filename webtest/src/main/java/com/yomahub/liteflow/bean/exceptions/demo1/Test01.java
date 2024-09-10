package com.yomahub.liteflow.bean.exceptions.demo1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test01 {
	public static void main(String[] args) {


		try {
			int zero = 0 ;
			int s = 1 / zero;
		} catch (Exception e) {
			log.error("error message is : {} , detail is : {}", e, e.getMessage());

			log.error("error message is :", e, e.getMessage());

			log.error("error message is :", e);


		}
	}

}
