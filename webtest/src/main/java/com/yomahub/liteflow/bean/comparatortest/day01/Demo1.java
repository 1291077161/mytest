package com.yomahub.liteflow.bean.comparatortest.day01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Joy
 * @date 2024/6/17
 * @param
 *
 */

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Demo1 implements Comparator<Demo1> {

	String name;

	int age;


	@Override
	public int compare(Demo1 o1, Demo1 o2) {
		return o1.getAge() - o2.getAge();
	}


	public static void main(String[] args) {
		List<Demo1> list = new ArrayList<>();
		list.add(new Demo1("aa", 15));
		list.add(new Demo1("bb", 78));
		list.add(new Demo1("cc", 11));
		list.add(new Demo1("dd", 46));
		list.add(new Demo1("aa", 23));

		list.sort(new Demo1());

		// Arrays.sort();

		list.forEach(item -> {


		});



	}

}
