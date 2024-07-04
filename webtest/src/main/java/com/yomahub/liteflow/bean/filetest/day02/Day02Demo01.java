package com.yomahub.liteflow.bean.filetest.day02;

import com.yomahub.liteflow.bean.filetest.day01.Entity;
import com.yomahub.liteflow.bean.filetest.day01.Entity2;
import com.yomahub.liteflow.bean.filetest.day01.Entity3;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springblade.core.tool.utils.Func;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Joy
 * @date 2024/6/28
 */
@Data
@Slf4j
@RequiredArgsConstructor
public class Day02Demo01 {

	static final String PATH_NAME = "D:\\Downloads\\postgresql-2024-072-04";
	static final String PATH_NAME2 = "D:\\Downloads\\postgresql-2024-072-04 - 副本";

	static Pattern pattern = Pattern.compile("SELECT", Pattern.CASE_INSENSITIVE);

	@SneakyThrows
	public static void main(String[] args) {
		// String pathname =
		// 		// "C:\\测试数据.txt";
		// 		"D:\\Downloads\\postgresql-2024-072-04";

		// 要读取以上路径的input。txt文件
		File filename = new File(PATH_NAME);
		// 建立一个输入流对象reader
		InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
		// 建立一个对象，它把文件内容转成计算机能读懂的语言
		BufferedReader br = new BufferedReader(reader);

		List<Entity> entities = new ArrayList<>();
		String line = "";
		while (line != null) {
			// 一次读入一行数据
			String key = br.readLine();
			line = key;
			if (Func.isEmpty(key) || !key.contains(" LOG: ")) {
				continue;
			}

			String value = br.readLine();
			if (Func.isEmpty(value) || !value.contains(" DETAIL: ")) {
				continue;
			}
			line = value;
			if (Func.isNotEmpty(key) && Func.isNotEmpty(value) && key.contains(" execute ") && key.contains(" SELECT ") && value.contains(" $1 ")) {
				Entity entity = new Entity();
				entity.setKey(key);
				entity.setValue(value);
				entities.add(entity);
			}
		}

		List<Entity2> entity2List = new ArrayList<>();

		// entities.forEach(
		// 		item -> {
		// 			handleResult(entity2List,item);
		// 		}
		// );

		// 处理所有的包含占位符的Log和Detail
		for (Entity entity : entities) {
			handleResult(entity2List, entity);
		}

		log.error("before size is:{}", entity2List.size());


		handleSecondSqlString(entity2List);

		log.error("after size is:{}", entity2List.size());


		List<String> sqlList = new ArrayList<>();
		// List<Entity2> collect = entity2List.stream().sorted(Comparator.comparing(Entity2::getCostTime).reversed()).collect(Collectors.toList());

		Map<String, BigDecimal> map = new HashMap<>(16);
		for (Entity2 entity2 : entity2List) {
			map.put(entity2.getSql(), entity2.getCostTime());
		}


		// collect.forEach(item -> {
		// 	sqlList.add("-- " + item.getCostTime().toString());
		// 	sqlList.add(item.getSql());
		// });


		List<Entity2> new1 = new ArrayList<>();
		for (Map.Entry<String, BigDecimal> entry : map.entrySet()) {
			Entity2 entity2 = new Entity2();
			entity2.setSql(entry.getKey());
			entity2.setCostTime(entry.getValue());
			new1.add(entity2);
		}

		List<Entity2> collect = new1.stream().sorted(Comparator.comparing(Entity2::getCostTime).reversed()).collect(Collectors.toList());

		collect.forEach(item -> {
			sqlList.add("-- " + item.getCostTime().toString());
			sqlList.add(item.getSql());
		});


		// 指定输出文件路径
		String filePath = "D:\\Downloads\\慢sql20240704.log";

		BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
		for (String str : sqlList) {
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

	public static void handleSecondSqlString(List<Entity2> entity2List) throws IOException {
		List<String> stringList = readingSecond();
		for (String originSql : stringList) {
			Entity2 entity2 = new Entity2();
			Matcher matcher = pattern.matcher(originSql);
			if (matcher.find()) {
				String realSql = originSql.substring(matcher.start());
				handleDurationTime(originSql, entity2);
				entity2.setSql(realSql);
				if (entity2.getCostTime().compareTo(new BigDecimal(800)) > 0) {
					entity2List.add(entity2);
				}
			}
		}




	}


	public static List<String> readingSecond() throws IOException {
		System.err.println("第二遍读取开始");
		List<String> costTimeStringSqlLog = new ArrayList<>();
		// List<String> smallSelect = new ArrayList<>();
		// List<String> bigSelect = new ArrayList<>();
		// 要读取以上路径的input。txt文件
		File filename = new File(PATH_NAME2);
		// 建立一个输入流对象reader
		InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
		// 建立一个对象，它把文件内容转成计算机能读懂的语言
		BufferedReader br = new BufferedReader(reader);

		// BufferedReader br = new BufferedReader(new FileReader(filename));
		// int size = br.lines().collect(Collectors.toList()).size();
		// System.out.println("size = " + size);

		// List<String> lines = Files.readAllLines(filename, StandardCharsets.UTF_8);

		String line = "";
		while (line != null) {
			// 一次读入一行数据
			line = br.readLine();
			// log.info("line is :{}", line);
			// 必须是log的，并且不能含有占位符
			if (line!= null && line.contains("LOG: ") && line.contains("duration: ") && !line.contains("$")) {
				if (line.toUpperCase().contains("SELECT")){
					costTimeStringSqlLog.add(line);
				}
			}
		}

		return costTimeStringSqlLog;
	}


	public static void handleResult(List<Entity2> entity2List, Entity original) {
		String logLine = original.getKey();
		String detailLine = original.getValue();


		Entity2 entity2 = new Entity2();

		int select = logLine.indexOf("SELECT");
		String needReplaceSql = logLine.substring(select);
		// log.info("needReplaceSql:========== {}  =========", needReplaceSql);
		// System.out.println();


		handleDurationTime(logLine, entity2);


		int paramNeedReplace = detailLine.indexOf("$1");
		String paramReplaceSql = detailLine.substring(paramNeedReplace);
		// log.info("paramReplaceSql:{}", paramReplaceSql);
		// System.out.println();

		String[] split = paramReplaceSql.split(", ");

		// String[] split = splitKeepingJsonIntact(paramReplaceSql);
		List<Entity3> maps = Arrays.stream(split).map(item -> {
			try {
				String[] split1 = item.split("=");
				String replaceHolder = split1[0].trim();
				String param = split1[1].trim();
				Entity3 entity3 = new Entity3();
				entity3.setKey(replaceHolder);
				entity3.setValue(param);
				return entity3;
			} catch (Exception e) {
				log.error("error message is :{}, detail message is:{}", e ,e.getMessage());
			}
			return null;
		}).collect(Collectors.toList());

		List<Entity3> entity3s = maps.stream().filter(Func::isNotEmpty).sorted(Comparator.comparing(Entity3::getKey).reversed()).collect(Collectors.toList());

		for (Entity3 map : entity3s) {
			needReplaceSql = needReplaceSql.replace(map.getKey(), map.getValue());
		}

		// log.info("needReplaceSql:========== {}  =========", needReplaceSql);


		entity2.setSql(needReplaceSql);

		// System.out.println();
		// System.out.println();
		// System.out.println();
		// System.out.println();


		if (entity2.getCostTime().compareTo(new BigDecimal(800)) > 0) {
			entity2List.add(entity2);
		}


	}


	public static String[] splitKeepingJsonIntact(String input) {
		List<String> result = new ArrayList<>();
		String[] aa = new String[]{};
		String regex = "'(?:[^']|'')*'|\\[.*?\\]|[^,]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
			result.add(matcher.group());
		}

		return result.toArray(aa);
	}


	public static void handleDurationTime(String logLine, Entity2 entity2) {



		log.info("logLine:{}", logLine);
		int durationIndex = logLine.indexOf("duration:");
		int executeIndex = -1;
		if (logLine.contains("execute")) {
			executeIndex = logLine.indexOf("execute");
		}

		if (logLine.contains("statement")) {
			executeIndex = logLine.indexOf("statement");
		}
		String costTime = logLine.substring(durationIndex, executeIndex);
		// log.info("costTime:{}", costTime);
		// System.out.println();


		String pattern = "duration:\\s*([0-9.]+)\\s*ms";
		Pattern compiledPattern = Pattern.compile(pattern);
		Matcher matcher = compiledPattern.matcher(costTime);
		if (matcher.find()) {
			String durationStr = matcher.group(1);
			try {
				entity2.setCostTime(new BigDecimal(durationStr));
			} catch (NumberFormatException e) {
				System.err.println("Failed to parse duration: " + e.getMessage());
			}
		}

	}
}
