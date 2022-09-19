package com.five.year.demo.annotation.propertysource;

import com.alibaba.fastjson.JSON;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Date 2022/9/18 11:56
 * @Created by ltc
 */

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigPropertySource.class);
        Object bean = context.getBean("student");
        System.out.println(JSON.toJSONString(bean));
    }

}
