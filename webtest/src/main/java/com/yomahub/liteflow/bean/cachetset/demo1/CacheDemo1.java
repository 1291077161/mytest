package com.yomahub.liteflow.bean.cachetset.demo1;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.checkerframework.checker.nullness.qual.NonNull;

public class CacheDemo1 {
	public static void main(String[] args) {

		// Cache<String, String> cache = Caffeine.newBuilder()
		// 		.maximumSize(1)
		// 		.expireAfterAccess(10, TimeUnit.MINUTES)
		// 		.recordStats()
		// 		.build();
		//
		// Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
		//
		// // 模拟数据访问
		// cache.put("键1", "值1");
		// String value = cache.getIfPresent("键1");
		//
		// // 获取并打印统计信息
		// CacheStats stats = cache.stats();
		// System.out.println("命中率：" + stats.hitRate());


		// System.loadLibrary();
		// Weigher.boundedWeigher()


		// RemovalListener<String, String> listener = (key, value, cause) ->
		// 		System.out.println("被移除的键：" + key + ", 原因：" + cause);
		//
		// Cache<String, String> cache = Caffeine.newBuilder()
		// 		.removalListener(listener)
		// 		.build();
		//
		// cache.put("键1", "值1");
		// // 手动移除，触发监听器
		// cache.invalidate("键1");


		Cache<String, String> cache = Caffeine.newBuilder()
				.recordStats()
				.build();

		cache.put("键1", "值1");
		// 命中
		cache.getIfPresent("键1");
		// 未命中
		cache.getIfPresent("键2");

		// 打印统计信息
		System.out.println(cache.stats());



		checkString(null);

	}

	public static void checkString(@NonNull String a) {

		System.out.println("a:==" + a);

	}
}
