package com.yomahub.liteflow.bean.retrytest.demo3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 *
 * @author Joy
 * @date 2024/4/17
 * @param
 *
 */

@Data
@AllArgsConstructor

public class Student {

	Class aClass;

	String name;

	public static void main(String[] args) {

		Class c = new Class();
		c.setLocation("北京");
		c.setName("二班");

		Student s = new Student(c, "小明");

		System.out.println("修改属性前 = " + s);

		c.setName("其实在三班");

		System.out.println("修改属性后 = " + s);


		Class c1 = new Class();
		c1.setLocation("北京");
		c1.setName("二班");

		Class c2 = new Class();
		c2.setLocation("北京");
		c2.setName("二班");

		List<Class> classes = new ArrayList<Class>();
		classes.add(c1);
		classes.add(c2);

		List<Class> sb = classes.stream().map(item -> {
			item.setName(null);
			return item;
		}).collect(Collectors.toList());


		sb.forEach(System.out::println);


		List<Class> list = new ArrayList<Class>();
		Class aClass = list.stream().findFirst().orElseGet(Class::new);
		String location = aClass.getLocation();

		List<String> strings = new ArrayList<String>();
		// strings.add(null);
		String orElseGet = strings.stream().findFirst().orElseGet(() -> "");

		System.out.println("orElseGet = " + orElseGet);

		Properties properties = System.getProperties();

		boolean empty = properties.isEmpty();


		// properties.forEach(item -> {
		//
		// 	java.lang.Class<?> aClass1 = item.getClass();
		// });


	}


}
