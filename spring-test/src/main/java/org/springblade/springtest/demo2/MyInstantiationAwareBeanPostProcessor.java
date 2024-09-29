package org.springblade.springtest.demo2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    /**
     *
     * @param BeanClass the class of the bean to be instantiated
     * @param BeanName the name of the bean
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> BeanClass, String BeanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor的before()执行了...." + BeanName);
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object Bean, String BeanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor的after()执行了...." + BeanName);
        return false;
    }
}
