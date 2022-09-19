package com.five.year.demo.annotation.imports.selector;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date 2022/9/18 11:56
 * @Created by ltc
 */

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigSelector.class);
        context.getBean(Child.class);
    }

}
