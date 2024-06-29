package com.yomahub.liteflow.bean.filetest.day01;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Data
@Slf4j
public class Test {
	public static void main(String[] args) {

		// String logLine = "2024-06-25 18:57:08.180 CST [16991] LOG:  duration: 121884.418 ms  execute <unnamed>: SELECT id FROM stat_production_5m WHERE is_deleted = 0 AND (work_order_id = $1 AND workshop_id = $2 AND line_id = $3 AND route_id = $4 AND shift_group_id = $5 AND shift_id = $6 AND product_master_id = $7 AND operator_id = $8 AND section_id = $9 AND is_first_route = $10 AND is_first_in_section = $11 AND is_last_route = $12 AND is_last_in_section = $13 AND window_time = $14 AND window_hour = $15 AND operators = $16 AND equipments = $17 AND station_id = $18)\n";
		// String detailLine = "2024-06-25 18:57:08.180 CST [16991] DETAIL:  parameters: $1 = '1805037819248308225', $2 = '1544626648947163137', $3 = '1544635002308792322', $4 = '1805039026679377921', $5 = '1641320829602021378', $6 = '1681195451125661697', $7 = '1735493141281173505', $8 = '1544605468019208193', $9 = '1698940896082997249', $10 = 't', $11 = 't', $12 = 't', $13 = 't', $14 = '2024-06-25', $15 = '18:00', $16 = '1544605468019208193', $17 = '[]', $18 = '1544636153569742849'\n";


		String logLine = "2024-06-25 20:24:20.573 CST [21799] LOG:  duration: 800.530 ms  execute S_22: SELECT product_id FROM mfg_material_deduction WHERE is_deleted = 0 AND (product_id IN ($1) AND route_code = $2 AND feeding_type = $3) AND tenant_id = '943415' AND site_id = 1544605451081547778\n";
		String detailLine = "2024-06-25 20:24:20.573 CST [21799] DETAIL:  parameters: $1 = '1805488896841138190', $2 = 'fa1440ecdb0824e400d7c72b4fd330cb', $3 = 'GENERAL'\n";

		Entity2 entity2 = new Entity2();

		int select = logLine.indexOf("SELECT");
		String needReplaceSql = logLine.substring(select);
		// log.info("needReplaceSql:========== {}  =========", needReplaceSql);


		int durationIndex = logLine.indexOf("duration:");
		int executeIndex = logLine.indexOf("execute");
		String costTime = logLine.substring(durationIndex, executeIndex);
		log.info("costTime:{}", costTime);


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




		int paramNeedReplace = detailLine.indexOf("$1");
		String paramReplaceSql = detailLine.substring(paramNeedReplace);
		log.info("paramReplaceSql:{}", paramReplaceSql);

		String[] split = paramReplaceSql.split(",");
		List<Map<String, String>> maps = Arrays.stream(split).map(item -> {
			String[] split1 = item.split("=");
			String replaceHolder = split1[0].trim();
			String param = split1[1].trim();
			Map<String, String> map = new HashMap<>();
			map.put(replaceHolder, param);
			return map;
		}).collect(Collectors.toList());

		for (Map<String, String> map : maps) {
			for (Map.Entry<String, String> entry : map.entrySet()) {
				needReplaceSql = needReplaceSql.replace(entry.getKey(),entry.getValue());
			}
		}

		log.info("needReplaceSql:========== {}  =========", needReplaceSql);


		entity2.setSql(needReplaceSql);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();



	}
}
