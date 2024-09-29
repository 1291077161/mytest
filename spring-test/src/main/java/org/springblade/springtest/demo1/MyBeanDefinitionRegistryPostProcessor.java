package org.springblade.springtest.demo1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
// 需要把该后置处理器注入Spring容器中
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        // 注入boo
        BeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClassName("org.springblade.springtest.demo1.Boo");
        registry.registerBeanDefinition("boo", beanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // 该方法是BeanFactoryPostProcessor的方法，这里就不做任何逻辑处理，后面会单独演示

    }
}
