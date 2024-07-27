package com.yomahub.liteflow.bean.jdk17test.day1.day101;

import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.trie.PatriciaTrie;

import java.io.IOException;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @param
 * @author Joy
 * @date 2024/7/5
 */

public class Demo1 {

	static final String CONST = PackageConst.COLA;


	public static void main(String[] args) throws IOException {

		// int select = Selector.open().select();

		// System.in.read();

		PatriciaTrie<String> stringPatriciaTrie = new PatriciaTrie<>();

		Trie<String, String> trie = new PatriciaTrie<>();


		String cola = PackageConst.COLA;

		String cola1 = PackageConst.COLA;

		Optional<String> cola11 = Optional.ofNullable(null);
		cola11.isEmpty();

		// 获取当前正在运行的 JVM 的进程
		ProcessHandle currentProcess = ProcessHandle.current();
		// 输出进程的 id
		System.out.println(currentProcess.pid());
		// 输出进程的信息
		System.out.println(currentProcess.info());

		ReentrantLock reentrantLock = new ReentrantLock();

	}


}
