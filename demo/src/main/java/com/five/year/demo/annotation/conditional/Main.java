package com.five.year.demo.annotation.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date 2022/9/18 11:56
 * @Created by ltc
 */

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigConditional.class);
        context.getBean("son");
    }

}
