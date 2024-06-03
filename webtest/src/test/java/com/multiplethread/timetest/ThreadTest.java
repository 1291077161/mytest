package com.multiplethread.timetest;

import com.multiplethread.cpu.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		//Thread run1 = new Thread() {
		//	@Override
		//	public void run() {
		//		System.out.println("\"aaa\" = " + "aaa");
		//	}
		//};
		//Thread run2 = new Thread() {
		//	@Override
		//	public void run() {
		//		System.out.println("\"bbb\" = " + "bbb");
		//	}
		//};
		//
		//run1.start();
		//TimeUnit.SECONDS.sleep(5);
		//run2.start();
		List<String> l = new ArrayList<>();
		l.add("aa");
		l.add("bb");
		l.add("cc");
		l.add("dd");


		List<Student> userList  = new ArrayList();
		userList.add(new Student("aa",121));
		userList.add(new Student("bb",122));
		userList.add(new Student("cc",123));
		userList.add(new Student("dd",124));
		userList.add(new Student("ee",125));
		userList.add(new Student("ff",126));
		userList.add(new Student("gg",127));
		Map<Integer,String> collect = userList.stream().collect(Collectors.groupingBy(
				Student::getAge, Collectors.mapping(Student::getName, Collectors.joining(","))));


		collect.forEach((k,v) -> {

		});



	}


}
