package org.springblade.sbd;

import lombok.extern.slf4j.Slf4j;
import org.springblade.sbd.config.MyConfig;
import org.springblade.sbd.entity.Pet;
import org.springblade.sbd.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		for (String definitionName : context.getBeanDefinitionNames()) {
			// log.error("definition name : {}", definitionName);
			if ("tom".equals(definitionName)) {
				log.error("definition name :{}", definitionName);
			}
		}

		Pet bean1 = context.getBean(Pet.class);

		//3、从容器中获取组件
		Pet tom01 = context.getBean("tom", Pet.class);
		Pet tom02 = context.getBean("tom", Pet.class);
		System.out.println("组件1："+(tom01 == tom02));
		System.out.println("容器bean class："+(bean1 == tom02));


		User user02 = context.getBean("user01", User.class);
		User user03 = context.getBean("user01", User.class);
		System.out.println("组件2："+(user02 == user03));

		Pet pet1 = user02.getPet();
		Pet pet2 = user03.getPet();
		System.out.println("组件3："+(pet1 == pet2));

		System.out.println("user中的pet是否和容器中的pet一致："+(tom01 == pet2));


		//4、com.atguigu.boot.config.MyConfig$$EnhancerBySpringCGLIB$$51f1e1ca@1654a892
		MyConfig bean = context.getBean(MyConfig.class);
		System.out.println(bean);

		//如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
		//保持组件单实例
		User user = bean.user01();
		User user1 = bean.user01();
		System.out.println(user == user1);


		User user01 = context.getBean("user01", User.class);
		Pet tom = context.getBean("tom", Pet.class);

		System.out.println("用户的宠物："+(user01.getPet() == tom));


		context.close();
	}

}
