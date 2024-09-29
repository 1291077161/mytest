package org.springblade.springtest.demo2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object Bean, String BeanName) throws BeansException {
        System.out.println("BeanPostProcessor的before()执行了...." + BeanName);
        return Bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object Bean, String BeanName) throws BeansException {
        System.out.println("BeanPostProcessor的after()执行了...."+ BeanName);
        return Bean;
    }
}
