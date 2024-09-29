package org.springblade.springtest.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"org.springblade.springtest.demo2"})
@Configuration
public class MyConfig {

	@Bean
	public Boo boo() {
		return new Boo();
	}

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(MyConfig.class);
		String[] BeanDefinitionNames = applicationContext.getBeanDefinitionNames();
		// 遍历Spring容器中的BeanName
		for (String BeanDefinitionName : BeanDefinitionNames) {
			if (BeanDefinitionName.contains("boo")) {
				System.out.println(BeanDefinitionName);
			}
		}
		// 这里调用的applicationContext的close()触发Bean的销毁回调方法
		applicationContext.close();
	}
}
