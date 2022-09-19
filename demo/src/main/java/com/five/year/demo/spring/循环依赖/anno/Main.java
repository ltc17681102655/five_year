package com.five.year.demo.spring.循环依赖.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Date 2022/9/15 7:26
 * @Created by ltc
 */

@ComponentScan(basePackages = "com.five.year.demo.spring.循环依赖.anno")
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        Object foo = context.getBean("foo");
        System.out.println(foo);
    }

}
