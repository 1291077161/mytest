package com.yomahub.liteflow.bean.collectiontest.linkhashset;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.LinkedHashSet;

@Slf4j
@Data
public class Demo1 {
	public static void main(String[] args) {
		LinkedHashSet<String> hashSet = new LinkedHashSet<>();
		hashSet.add("bb");
		hashSet.add("aa");
		hashSet.add("aa");
		hashSet.add("bb");
		hashSet.forEach(item -> {
			// System.out.println("item = " + item);
		});

		SpringFactoriesLoader.ArgumentResolver hello = SpringFactoriesLoader
				.ArgumentResolver.of(String.class, "hello");
		// hello.resolve()

		// hello.and(hello);

		System.out.println("hello = " + hello.toString());

	}
}
