package com.yomahub.liteflow.bean.logbacktest.MDCtest;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.core.task.TaskDecorator;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @author Joy
 * @date 2024/6/12
 */

@Slf4j
@Component
public class TraceAsyncConfigurer implements AsyncConfigurer {
	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(8);
		executor.setMaxPoolSize(16);
		executor.setQueueCapacity(100);
		executor.setThreadNamePrefix("async-pool-");
		executor.setTaskDecorator(new MdcTaskDecorator());
		executor.setWaitForTasksToCompleteOnShutdown(true);
		executor.initialize();
		return executor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return (throwable, method, params) -> log.error("asyc execute error, method={}, params={}", method.getName(),
				Arrays.toString(params));
	}

	public static class MdcTaskDecorator implements TaskDecorator {
		@Override
		public Runnable decorate(Runnable runnable) {
			Map<String, String> contextMap = MDC.getCopyOfContextMap();
			return () -> {
				if (contextMap != null) {
					MDC.setContextMap(contextMap);
				}
				try {
					runnable.run();
				} finally {
					MDC.clear();
				}
			};
		}
	}
}

class MDCLogThreadPoolExecutor extends ThreadPoolExecutor {
	public MDCLogThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
	                                BlockingQueue workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
	}

	@Override
	public void execute(Runnable command) {
		super.execute(MDCLogThreadPoolExecutor.executeRunable(command, MDC.getCopyOfContextMap()));
	}

	@Override
	public Future<?> submit(Runnable task) {
		return super.submit(MDCLogThreadPoolExecutor.executeRunable(task, MDC.getCopyOfContextMap()));
	}

	@Override
	public Future submit(Callable callable) {
		return super.submit(MDCLogThreadPoolExecutor.submitCallable(callable, MDC.getCopyOfContextMap()));
	}

	public static Runnable executeRunable(Runnable runnable, Map<String, String> mdcContext) {
		return new Runnable() {
			@Override
			public void run() {
				if (mdcContext == null) {
					MDC.clear();
				} else {
					MDC.setContextMap(mdcContext);
				}
				try {
					runnable.run();
				} finally {
					MDC.clear();
				}
			}
		};
	}

	private static Callable submitCallable(Callable callable, Map<String, String> context) {
		return () -> {
			if (context == null) {
				MDC.clear();
			} else {
				MDC.setContextMap(context);
			}
			try {
				return callable.call();
			} finally {
				MDC.clear();
			}
		};
	}
}