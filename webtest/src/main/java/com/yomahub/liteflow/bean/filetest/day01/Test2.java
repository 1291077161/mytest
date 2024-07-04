package com.yomahub.liteflow.bean.filetest.day01;

import lombok.Data;
import lombok.SneakyThrows;
import org.springblade.core.tool.utils.Func;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Joy
 * @date 2024/6/29
 */

@Data
public class Test2 {
	@SneakyThrows
	public static void main(String[] args) {
		String pathname =
				// "C:\\测试数据.txt";
				"D:\\Downloads\\慢sql20240704.log";

		// 要读取以上路径的input。txt文件
		File filename = new File(pathname);
		// 建立一个输入流对象reader
		InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
		// 建立一个对象，它把文件内容转成计算机能读懂的语言
		BufferedReader br = new BufferedReader(reader);

		List<String> strings = new ArrayList<>();
		String line = "";
		while (line != null) {
			// 一次读入一行数据
			line = br.readLine();

			if (Func.isNotEmpty(line) && line.contains("select")
					// && line.contains("WHERE")
					&& line.contains("WHERE")
			) {

				strings.add(line);
			}
		}

		Set<String> results = new HashSet<>();
		for (String value : strings) {
			int from = value.indexOf("FROM");
			int where = value.indexOf("WHERE");
			results.add(value.substring(from, where));
		}

		results.forEach(item -> System.out.println(item));


	}
}
