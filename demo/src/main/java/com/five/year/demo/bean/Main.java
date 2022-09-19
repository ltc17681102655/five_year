package com.five.year.demo.bean;

import com.five.year.demo.xml.Wheel;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @Date 2022/9/18 18:50
 * @Created by ltc
 */

public class Main {
    public static void main(String[] args) {
        //创建一个DefaultListableBeanFactory实例
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //创建一个BeanDefinition
        RootBeanDefinition beanDefinition = new RootBeanDefinition(Wheel.class);
        //将BeanDefinition注册到容器中
        beanFactory.registerBeanDefinition("wheel", beanDefinition);
    }
}
