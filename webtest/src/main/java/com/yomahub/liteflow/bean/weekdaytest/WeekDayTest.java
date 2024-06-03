package com.yomahub.liteflow.bean.weekdaytest;

import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.WeekFields;

public class WeekDayTest {
	/**
	 * 以2023-01-01为例，如果是以周一为一周的开始，那么这天是属于2022的最后一周（即2023年有52周）
	 * 如果以周日为一周的开始，那么这天属于2023年的第一周（即2023年还是52周），因为2023-12-31属于2024的第一周了
	 * @param args
	 */
	public static void main(String[] args) {
		// WeekFields weekFields = WeekFields.of(Locale.getDefault());
		// WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY, 1);
		// LocalDate currentDate = LocalDate.now();

		// LocalDate parse = LocalDate.parse("2022-12-26", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		// LocalDate parse = LocalDate.parse("2023-12-25", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		// int weekNumber = parse.get(weekFields.weekOfWeekBasedYear());


		// 周日为一周的开始
		WeekFields weekFields = WeekFields.of(DayOfWeek.SUNDAY, 1);


		// 周一为一周的开始
		// WeekFields weekFields = WeekFields.of(DayOfWeek.SUNDAY, 1);


		// WeekFields weekFields = WeekFields.ISO;

		LocalDate date = LocalDate.of(2023, 12, 31);
		// LocalDate date = LocalDate.of(2023, 1, 2);

		// 计算2022年12月26日所属的周数
		int weekNumber = date.get(weekFields.weekOfWeekBasedYear());

		System.out.println(date.getYear() + "年的第 " + weekNumber + " 周");

		BigDecimal bigDecimal1 = new BigDecimal(10);
		BigDecimal bigDecimal2 = new BigDecimal(10);
		System.out.println("bigDecimal1.equals(bigDecimal2) = " + bigDecimal1.equals(bigDecimal2));

		DecimalFormat df = new DecimalFormat("##.00%");


		int a = 3;
		int b = 100;
		int c = a / b ;
		System.out.println("c = " + c);
		String format = df.format((double) a / b);
		System.out.println("format = " + format);

		JSONObject jsonObject = new JSONObject();
		// jsonObject.

		System.out.println("jsonObject = " + jsonObject);


	}
}
