package org.springblade.springtest.demo4;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Joy
 * @date 2024/9/27
 */

@Slf4j
public class QuChong {

	@SneakyThrows
	public static void main(String[] args) {
		File filename = new File("C:\\Users\\Administrator\\Desktop\\需要去重的.txt");
		// FileInputStream fi = new FileInputStream(file);

		InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
		// 建立一个对象，它把文件内容转成计算机能读懂的语言
		BufferedReader br = new BufferedReader(reader);

		List<String> lineList = new ArrayList<>();
		String line = "";
		while (line != null) {
			line = br.readLine();
			lineList.add(line);
		}

		log.info("全部的 size :{}", lineList.size());
		// lineList.stream().


		List<String> list = lineList.stream()
				// .filter(StringUtils::isEmpty)
				.distinct().toList();
		log.info("after line size :{}", list.size());

		// list
		// List<List<String>> partition = Lists.partition(list, 15);


		List<String> du = new ArrayList<>();
		HashSet<String> set = new HashSet<>();
		for (String s : lineList) {
			if (!set.add(s)) {
				// log.info(s);
				du.add(s);
			}
		}

		log.info("duplicate line size :{}", du.size());

		// 多次重复的
		List<String> moreTimesDu = new ArrayList<>();
		HashSet<String> moreTimesDuSet = new HashSet<>();
		for (String s : du) {
			if (!moreTimesDuSet.add(s)) {
				// log.info(s);
				moreTimesDu.add(s);
			}
		}

		log.info("多次重复的line size :{}", moreTimesDu.size());
		List<String> quchonghou = moreTimesDu.stream().distinct().toList();
		log.info("多次重复的去重后line size :{}", quchonghou.size());
		for (String s : quchonghou) {
			log.info("多次重复的去重后:{}" ,s);
		}


		// 重复的
		List<String> emmm = du.stream().distinct().toList();
		log.info("duplicate emmm line size :{}", emmm.size());


		// 指定输出文件路径
		String filePath = "C:\\Users\\Administrator\\Desktop\\去重后.txt";

		BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
		for (String str : list) {
			// if (StringUtils.isNotEmpty(str)) {

			if (!StringUtils.isEmpty(str)) {
				try {
					writer.write(str);
					// 写入换行符
					writer.newLine();
				} catch (IOException e) {
					System.err.println(e.getMessage());
					// throw new RuntimeException(e);
				}
			}

		}


	}

}
