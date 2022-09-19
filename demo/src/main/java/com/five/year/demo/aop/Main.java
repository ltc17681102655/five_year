package com.five.year.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Date 2022/9/18 23:31
 * @Created by ltc
 */

@ComponentScan(basePackages = {"com.five.year.demo.aop"})
@Configuration
@EnableAspectJAutoProxy
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        IService service = context.getBean("service", IService.class);
        service.doService();
    }
}
