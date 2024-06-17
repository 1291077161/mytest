package com.yomahub.liteflow.bean.stringtest.demo1;

public class SubStringTest {
	public static void main(String[] args) {

		String fromSequenceNumber = "a1aaabb";
		// String toSequenceNumber = "1a111a";

		String prefix = "a1a";
		String suffix = "a";

		String fromSerialNumber = StringUtil123.subBetween(fromSequenceNumber, prefix, suffix);
		// String toSerialNumber = StringUtil123.subBetween(toSequenceNumber, prefix, suffix);


		System.out.println("fromSerialNumber = " + fromSerialNumber);
		// System.out.println("toSerialNumber = " + toSerialNumber);


	}


}

class StringUtil123 {
	public static String subBetween(String str, String prefix, String suffix) {
		if (str == null || prefix == null || suffix == null) {
			// 返回空字符串
			return "";
		}
		int start = str.indexOf(prefix);
		int end = str.lastIndexOf(suffix);

		// 返回前后缀之间的内容
		if (start != -1 && end != -1 && start + prefix.length() <= end) {
			return str.substring(start + prefix.length(), end);
		}

		// 如果 prefix 或 suffix 未找到，返回空字符串
		return "";
	}
}
