package com.yomahub.liteflow.bean.lambdafunction;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Slf4j
public class Main {

	// 函数：将输入的整数加倍
	public static Integer doubleIt(Integer x) {
		return x * 2;
	}

	// 函数：将输入的整数求平方
	public static Integer squareIt(Integer x) {
		return x * x;
	}

	public static void main(String[] args) {


		String map = "map";
		String[] split = map.split("");
		List<String> list1 = Arrays.asList(split);

		int[] intarr = {1,2,3};
		List<int[]> ints1 = Arrays.asList(intarr);


		Integer[] integers = {1,2,3};
		List<Integer> integers1 = Arrays.asList(integers);


		String[] message={"map","flatMap","compare"};
		Stream<String[]> wordSream = Arrays.stream(message).map(ele -> ele.split(""));
		List<String[]> collect = wordSream.collect(Collectors.toList());


		wordSream.forEach(item  -> {
			int length = item.length;
			System.out.println("item[0] = " + item[0]);
			System.out.println("length = " + length);
		});



		// wordSream.forEach(System.out::println);


		String aaaaa = null;
		Student student = null;
		Optional<String> s1 = Optional.ofNullable(student).map(Student::getName);

		String s2 = s1.get();


		String s = Optional.of(student).map(Student::getName).get();
		System.out.println("s = " + s);

		// 定义两个函数对象
		Function<Integer, Integer> doubleFunction = Main::doubleIt;
		Function<Integer, Integer> squareFunction = Main::squareIt;

		// 创建一个新的函数对象，将输入的整数先加倍再求平方
		Function<Integer, Integer> doubleAndSquareFunction = doubleFunction.andThen(squareFunction);


		Integer sss = 5;
		Function<Integer, Integer> doubleToIntFunction = (Integer a) -> a * a;
		Function<Integer, Integer> doubleTox2 = a -> a * 2;
		Function<Integer, Integer> integerIntegerFunction = doubleToIntFunction.andThen(doubleTox2);
		integerIntegerFunction.apply(sss);

		// Integer wb = (a -> a * 2).apply(2);

		// Integer apply = doubleToIntFunction.apply(sss);

		// s -> ((a -> a * a).andThen(b -> b * 2));
		// (a -> a * a).andThen(b -> b * 2)


		Function<Integer, Integer> integerIntegerFunction1 = doubleToIntFunction.andThen(b -> b * 2);

		// t -> doubleToIntFunction.andThen(b -> b * 2).apply()


		Integer apply = doubleToIntFunction.andThen(b -> b * 2).apply(sss);


		// 测试新函数对象
		System.out.println(doubleAndSquareFunction.apply(5)); // 输出 100 (5 * 2 = 10, 10 * 10 = 100)


		Function<Integer, Integer> functionA = i -> i * 2;
		Function<Integer, String> functionB = i -> "-" + i;

		// (i -> i * 2).app

		String apply1 = functionA.andThen(functionB).apply(2);
		System.out.println("apply1 = " + apply1);

		Function<Integer, String> functionC = t -> functionB.apply(functionA.apply(t));
		// (t -> functionB.apply(functionA.apply(t)))


		String apply2 = functionC.apply(3);
		System.out.println("apply2 = " + apply2);

		BigDecimal bigDecimal1 = BigDecimal.ZERO;
		BigDecimal bigDecimal2 = new BigDecimal(1);
		int i = bigDecimal1.compareTo(bigDecimal2);

		System.out.println("i = " + i);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		IntStream intStream = list.stream().mapToInt(Integer::intValue);
		int[] ints = intStream.toArray();
		long count = intStream.count();
		System.out.println("intStream = " + intStream);


		// functionA.compose(functionB)


		// 创建一个将整数先加 1，然后再乘 2 的函数
		Function<Integer, Integer> addOneAndMultiplyByTwo = a -> (a + 1) * 2;

		// 创建一个将整数先平方，然后再减去 10 的函数
		Function<Integer, Integer> squareAndSubtractTen = b -> b * b - 10;

		// 使用 compose 方法将 addOneAndMultiplyByTwo 和 squareAndSubtractTen 函数组合起来
		Function<Integer, Integer> combinedFunction = addOneAndMultiplyByTwo.compose(squareAndSubtractTen);

		// 测试组合后的函数
		System.out.println(combinedFunction.apply(5)); // 输出 86 (((5 * 5) - 10 + 1) * 2 = 86)

		try {
			testReferenceType1(new Student());
		} catch (Exception e) {
			System.out.println("抓到了");
			// e.printStackTrace();
			log.info("info:{}", e);
			log.error("error:{}, message:{}",e, e.getMessage());
			// throw new IOException();
		} finally {
			System.out.println("\"最终释放\" = " + "最终释放");
		}


	}


	public void testBaseType(final int i) {
		int n = i;
		n = n + 1;
		//编译报错
		// i = 9;
		System.out.println("i = " + i);
		System.out.println("n = " + n);
	}


	public void testReferenceType(final Student stu) {
		stu.setName("hoover");
		stu.setAge(25);
		System.out.println(stu.toString());
		Student stu1 = new Student();
		//编译报错
		// stu = stu1;

	}

	public static void testReferenceType1(Student stu) throws Exception {

		stu.setName("hoover");
		stu.setAge(25);
		System.out.println(stu.toString());
		Student stu1 = new Student();
		stu = stu1;

		System.out.println("准备抛出空指针");
		try {
			System.out.println("io exception");
			throw new IOException();
		} catch (Exception e) {
			// throw  new Exception(e);
			throw  e;
			// e.printStackTrace();
			// e.printStackTrace();
			// System.out.println("\"----------------------\" = " + "----------------------");
			// log.error("aaaaaaa,:", e);
			// log.error("aaaaaaa:{}, message:{}", e, e.getMessage());
		}





	}


}


class Student {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";

		// Expert expert = Optional.of(experts.stream().filter(ex -> Objects.equals("女",ex.getGender())).findFirst())
		// 		.get()
		// 		.orElseGet(Expert::new);

	}


}
