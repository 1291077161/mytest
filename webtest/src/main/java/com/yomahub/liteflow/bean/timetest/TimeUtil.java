package com.yomahub.liteflow.bean.timetest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @ClassName TimeUtil
 * @Description
 * @Author xy
 * @Date 2023/11/21
 * @Version 1.0
 **/
// @Sl4j
public class TimeUtil {
	// private static final Log LOGGER = LogFactory.getLog(TimeUtil.class);
	public static final Logger LOGGER = LoggerFactory.getLogger(TimeUtil.class);

	private static ThreadLocal<Long> startTimeThreadLocal = ThreadLocal.withInitial(System::currentTimeMillis);
	private static Map<String, Long> timeMap = new ConcurrentHashMap<>();

	/**
	 * 统计间隔
	 */
	public static long calcLatestInterval(String tag) {
		long now = System.currentTimeMillis();
		long interval = now - startTimeThreadLocal.get();
		startTimeThreadLocal.set(now);
		LOGGER.info("Thread.id=" + Thread.currentThread().getId() + "====tag==" + tag + "======" + interval + "ms");
		return interval;
	}

	/**
	 * 根据标签统计间隔
	 */
	public static void calcByTagInterval(String tag) {
		//非当前线程，清空数据
		long currentThreadId = Thread.currentThread().getId();
		Long tId = timeMap.get("currentThreadId");
		if (tId == null || !tId.equals(currentThreadId)) {
			timeMap.clear();
			timeMap.put("currentThreadId", currentThreadId);
		}
		String startTimeKey = tag + "-startTime";
		Long startTime = 0L;
		if (!timeMap.containsKey(startTimeKey)) {
			timeMap.put(startTimeKey, System.currentTimeMillis());
		} else {
			startTime = timeMap.get(startTimeKey);
			long now = System.currentTimeMillis();
			long interval = now - startTime;
			timeMap.put(tag + "-interval", interval);
			LOGGER.info(tag + "======" + interval + "ms");
		}
	}

}
