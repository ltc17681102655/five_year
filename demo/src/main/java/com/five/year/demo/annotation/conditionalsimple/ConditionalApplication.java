package com.five.year.demo.annotation.conditionalsimple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Date 2022/9/19 10:09
 * @Created by ltc
 */
@ComponentScan
@Configuration
public class ConditionalApplication {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(ConditionalApplication.class);
    }
}
