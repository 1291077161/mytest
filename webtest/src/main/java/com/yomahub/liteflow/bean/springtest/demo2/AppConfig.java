package com.yomahub.liteflow.bean.springtest.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// AppConfig.java类
@ComponentScan({"com.yomahub.liteflow.bean.springtest.demo2"})
@Configuration
class AppConfig {
    @Bean
    public ConfigDao1 configDao1() {   // 自己写一个configDao1类即可
        return new ConfigDao1();
    }

    @Bean
    public ConfigDao2 configDao2() {   // 自己写一个configDao2类即可
        configDao1();
        return new ConfigDao2();
    }
}