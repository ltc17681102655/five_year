package com.five.year.demo.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date 2022/9/19 9:25
 * @Created by ltc
 */

public class Main {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(FooConfigConfiguration.class);
    }
}
