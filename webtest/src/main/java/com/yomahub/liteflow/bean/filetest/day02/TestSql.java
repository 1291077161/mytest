package com.yomahub.liteflow.bean.filetest.day02;

import com.yomahub.liteflow.bean.filetest.day01.Entity3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author Joy
 * @date 2024/7/4
 * @param 
 * 
 */

public class TestSql {
	public static void main(String[] args) {
		String sql = "SELECT id FROM stat_production_5m WHERE is_deleted = 0 AND (work_order_id = $1 AND workshop_id = $2 AND line_id = $3 AND route_id = $4 AND shift_group_id = $5 AND shift_id = $6 AND product_master_id = $7 AND operator_id = $8 AND section_id = $9 AND is_first_route = $10 AND is_first_in_section = $11 AND is_last_route = $12 AND is_last_in_section = $13 AND window_time = $14 AND window_hour = $15 AND operators = $16 AND equipments = $17 AND station_id = $18)";

		String replace = "$1 = '1795805543333466113', $2 = '100191', $3 = '100005084708', $4 = '1795806135319080961', $5 = '1699315757104050178', $6 = '1699315419772956674', $7 = '1734034039938527234', $8 = '1697126649407590401', $9 = '1701868044213612545', $10 = 't', $11 = 't', $12 = 'f', $13 = 'f', $14 = '2024-07-02', $15 = '13:15', $16 = '1697126649407590401', $17 = '[{\"id\":6045,\"code\":\"SPI1\",\"name\":\"A1线第一台SPI设备\",\"model\":\"\"}]', $18 = '561'";



		String[] split = replace.split(", ");
		// String[] split = splitKeepingJsonIntact(replace);
		List<Entity3> maps = Arrays.stream(split).map(item -> {
			String[] split1 = item.split("=");
			String replaceHolder = split1[0].trim();
			String param = split1[1].trim();
			Entity3 entity3 = new Entity3();
			entity3.setKey(replaceHolder);
			entity3.setValue(param);
			return entity3;
		}).collect(Collectors.toList());
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
}
