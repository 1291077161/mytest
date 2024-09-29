package org.springblade.springtest.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.metrics.ApplicationStartup;

@ComponentScan(basePackages = {"org.springblade.springtest.demo1"})
@Configuration
public class MyConfig {

    public static void main(String[] args) {

        ApplicationStartup startup = ApplicationStartup.DEFAULT;
        // startup.start()


        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        // 遍历Spring容器中的beanName
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
