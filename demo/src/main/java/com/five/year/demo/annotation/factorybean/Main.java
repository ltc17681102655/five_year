package com.five.year.demo.annotation.factorybean;

import com.alibaba.fastjson.JSON;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date 2022/9/18 11:56
 * @Created by ltc
 */

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigFactorybean.class);
//        System.out.println(context.getBean("person"));
        Object factoryBean = context.getBean("boyFactoryBean");
        System.out.println(JSON.toJSONString(factoryBean));
    }

}
