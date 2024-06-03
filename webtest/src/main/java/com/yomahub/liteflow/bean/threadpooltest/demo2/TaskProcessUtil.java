package com.yomahub.liteflow.bean.threadpooltest.demo2;

import cn.hutool.core.thread.ThreadFactoryBuilder;

import java.util.Map;
import java.util.concurrent.*;

public class TaskProcessUtil {
	/**
	 * 每个任务，都有⾃⼰单独的线程池
	 */
	private final static Map<String, ExecutorService> EXECUTORS_MAP = new ConcurrentHashMap<>();

	// 初始化⼀个线程池
	private static ExecutorService init(String poolName, int poolSize) {
		return new ThreadPoolExecutor(poolSize, poolSize,
				0L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>(),
				new ThreadFactoryBuilder().setNamePrefix("Pool-" +
						poolName).setDaemon(false).build(),
				new ThreadPoolExecutor.CallerRunsPolicy());
	}

	// 获取线程池
	public static ExecutorService getOrInitExecutors(String poolName, int poolSize) {
		ExecutorService executorService = EXECUTORS_MAP.get(poolName);
		if (null == executorService) {
			synchronized (TaskProcessUtil.class) {
				executorService = EXECUTORS_MAP.get(poolName);
				if (null == executorService) {
					executorService = init(poolName, poolSize);
					EXECUTORS_MAP.put(poolName, executorService);
				}
			}
		}
		return executorService;
	}

	// 回收线程资源
	public static void releaseExecutors(String poolName) {
		ExecutorService executorService = EXECUTORS_MAP.remove(poolName);
		if (executorService != null) {
			executorService.shutdown();
		}
	}
}