package com.yomahub.liteflow.bean.jdk17test.day1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


/**
 *
 * @author Joy
 * @date 2024/6/14
 *
 */

@Data
@AllArgsConstructor
public class Demo1 {

	public static void main(String[] args) {


		try {
			//简单的空指针
			String str = null;
			str.length();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			//复杂一点的空指针
			List<String> arr = null;
			String str = (String)arr.get(0);
			str.length();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
