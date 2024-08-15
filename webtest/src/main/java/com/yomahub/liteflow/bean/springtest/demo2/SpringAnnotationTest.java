package com.yomahub.liteflow.bean.springtest.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author Administrator
 */
public class SpringAnnotationTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AppConfig.class);
        ac.refresh();

        IndexDao indexDao = ac.getBean(IndexDao.class);
        System.out.println(indexDao);
        indexDao.query();
    }
}







