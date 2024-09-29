package org.springblade.sbd.config;

import org.springblade.sbd.entity.Pet;
import org.springblade.sbd.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false) // 告诉SpringBoot这是一个配置类 == 配置文件
public class MyConfig {

	/**
	 * Full:外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
	 *
	 * @return
	 */
	@Bean // 给容器中添加组件。以方法名作为组件的id。返回类型就是组件类型。返回的值，就是组件在容器中的实例
	public User user01() {
		User zhangsan = new User("zhangsan", 18);
		// user组件依赖了Pet组件
		zhangsan.setPet(tomcatPet());
		return zhangsan;
	}

	@Bean("tom")
	public Pet tomcatPet() {
		return new Pet("tomcat");
	}
}
