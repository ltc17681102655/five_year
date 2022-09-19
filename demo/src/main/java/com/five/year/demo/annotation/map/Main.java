package com.five.year.demo.annotation.map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date 2022/9/18 11:56
 * @Created by ltc
 */

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigMap.class);
        Business bean = (Business) context.getBean("business");
        bean.doBusiness();
    }

}
