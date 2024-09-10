package com.yomahub.liteflow.bean.lambdafunction;

import java.util.function.Function;

/**
 * @author Administrator
 */
public class MyTestFunction implements Function<String, String> {

	/**
	 * Applies this function to the given argument.
	 *
	 * @param s the function argument
	 * @return the function result
	 */
	@Override
	public String apply(String s) {
		return s + "aa";
	}


	public static void main(String[] args) {

		Function<String, String> function = new MyTestFunction();
		String bb = function.apply("bb");
		System.out.println("bb = " + bb);

		Function<String, String> function2 = code ->
				code + "qq";


		String zz = function2.apply("zz");
		System.out.println("zz = " + zz);


		// IntStream.range(1, 10)
		// 		.peek(x -> System.out.print("\nA" + x))
		// 		.skip(6)
		// 		.peek(x -> System.out.print("B" + x))
		// 		.forEach(x -> System.out.print("C" + x));
	}
}
