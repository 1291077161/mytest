package org.springblade.springtest.demo2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@AllArgsConstructor
public class Boo implements InitializingBean, DisposableBean, BeanNameAware {
    private Long id;
    private String name;

    public Boo() {
        System.out.println("boo实例化构造方法执行了...");
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("boo执行初始化init()方法了...");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("boo执行初始化destroy()方法了...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("boo执行InitializingBean的afterPropertiesSet()方法了...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("boo执行DisposableBean的destroy()方法了...");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("boo执行BeanNameAware的setBeanName()方法了...");
    }
}
