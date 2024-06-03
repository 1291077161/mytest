// package com.multiplethread.cpu;
//
// import lombok.extern.slf4j.Slf4j;
// import org.springframework.data.redis.core.StringRedisTemplate;
// import org.springframework.stereotype.Component;
//
// import java.time.LocalDateTime;
// import java.time.ZoneOffset;
// import java.time.format.DateTimeFormatter;
//
// @Component
// @Slf4j
// public class RedisIdWorker {
//
//     // 2023年对应的时间戳
//     private static final Long BEGIN_TIMESTAMP =1672531200L;
//     // 序列号位数
//     private static final int COUNT_BITS = 32;
//     private StringRedisTemplate stringRedisTemplate;
//
//     public RedisIdWorker(StringRedisTemplate stringRedisTemplate) {
//         this.stringRedisTemplate = stringRedisTemplate;
//     }
//
//     public long nextId(String keyPrefix) {
//         // 1.生成时间戳
//         LocalDateTime now = LocalDateTime.now();
//         long nowSecond = now.toEpochSecond(ZoneOffset.UTC);
//         long timestamp = nowSecond - BEGIN_TIMESTAMP;
//
//         // 2.生成序列号
//         // 2.1.获取当前日期，精确到天
//         String date = now.format(DateTimeFormatter.ofPattern("yyyy:MM:dd"));
//         // 2.2.自增长
//         long count = stringRedisTemplate.opsForValue().increment("icr:" + keyPrefix + ":" + date);
//         log.info("产生的id为{}",timestamp << COUNT_BITS | count);
//         // 3.拼接并返回
//         return timestamp << COUNT_BITS | count;
//     }
//
//     public static void main(String[] args) {
//         LocalDateTime time = LocalDateTime.of(2023, 1, 1, 0, 0, 0);
//         long second = time.toEpochSecond(ZoneOffset.UTC);
//         System.out.println(second);
//     }
//
// }
