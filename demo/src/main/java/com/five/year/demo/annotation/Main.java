package com.five.year.demo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @Date 2022/9/18 13:50
 * @Created by ltc
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Configuration
    public static class Config {

    }
}
