package com.yomahub.liteflow.bean.threadLocalTest.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springblade.core.tool.utils.Func;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Joy
 * @date 2024/5/15
 * @param
 *
 */

public class BoringTest {
	public static void main(String[] args) {
		// Map<String, Stu> map = new HashMap<>(16);
		Stu s1 = new Stu(12,"aaa");
		Stu s2 = new Stu(15, "bbb");
		Stu s3 = new Stu(15, "ccc");
		Stu s4 = new Stu(15, "ddd");

		List<Stu> list1 = new ArrayList<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		System.out.println("before change list1 = " + list1);
		System.out.println();
		List<Stu> list2 = new ArrayList<>(list1);
		System.out.println("before change list2 = " + list2);
		System.out.println();

		list2.forEach(item -> item.setName("熊一帆"));
		System.out.println("after change list1 = " + list1);
		System.out.println();
		System.out.println("after change list2 = " + list2);

		List<Stu> list3 = new ArrayList<>();
		List<Stu> collect = list3.stream().filter(item -> Func.isNotEmpty(item.getName())).collect(Collectors.toList());


		// throw new RuntimeException("aaa");
		// for (Stu stu : collect) {
		//
		// }


		// List<Stu> collect = list.stream().collect(Collectors.toList());

		// collect.forEach(item -> {
		// 	item.setName("dashabi");
		// });

		// s1.setName("dashabi");




		// map.put("aaa",s1);
		// map.put("bbb",s2);
		//
		// Stu bbb = map.get("bbb");
		// System.out.println("bbb = " + bbb);
		//
		// s2.setName("dashabi");
		//
		// Stu bbb2 = map.get("bbb");
		// System.out.println("bbb2 = " + bbb2);
		// System.out.println("list = " + list);
		// System.out.println("collect = " + collect);

	}



}

@Data
@AllArgsConstructor
@Accessors(chain = true)
class Stu{
	int age;
	String name;
}