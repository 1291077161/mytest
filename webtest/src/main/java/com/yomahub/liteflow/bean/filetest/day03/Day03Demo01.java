package com.yomahub.liteflow.bean.filetest.day03;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springblade.core.tool.utils.Func;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Joy
 * @date 2024/6/28
 */
@Data
@Slf4j
@RequiredArgsConstructor
public class Day03Demo01 {

	static final String PATH_NAME = "D:\\Downloads\\慢sql20240704.log";

	@SneakyThrows
	public static void main(String[] args) {
		// 要读取以上路径的input。txt文件
		File filename = new File(PATH_NAME);
		// 建立一个输入流对象reader
		InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
		// 建立一个对象，它把文件内容转成计算机能读懂的语言
		BufferedReader br = new BufferedReader(reader);
		// int size = br.lines().collect(Collectors.toList()).size();
		// log.info("size is :{}", size);

		List<String> sqlList = new ArrayList<>();
		String line = "";
		while (line != null) {
			// 一次读入一行数据
			String costTime = br.readLine();
			// log.info("costTime is : {}", costTime);
			line = costTime;

			String logSql = br.readLine();
			// log.info("logsql is : {}", logSql);
			line = logSql;

			if (Func.isNotEmpty(logSql) && logSql.toUpperCase().contains("FROM")) {
				sqlList.add(costTime);
				sqlList.add(logSql);
			}
		}


		// 指定输出文件路径
		String filePath = "D:\\Downloads\\慢sql20240705.log";

		BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
		for (String str : sqlList) {
			try {
				writer.write(str);
				// 写入换行符
				writer.newLine();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

	}


}


