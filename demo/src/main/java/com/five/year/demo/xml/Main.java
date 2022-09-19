package com.five.year.demo.xml;

import com.alibaba.fastjson.JSON;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Date 2022/9/18 11:47
 * @Created by ltc
 */

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Object car = context.getBean("car");
        System.out.println(JSON.toJSONString(car));
    }

}
