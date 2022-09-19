package com.five.year.demo.annotation.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Date 2022/9/18 11:54
 * @Created by ltc
 */

public class BoyFactoryBean implements FactoryBean<Boy> {

    public BoyFactoryBean() {
        System.out.println("BoyFactoryBean was init!");
    }

    //返回Bean的对象
    @Override
    public Boy getObject() throws Exception {
        return new Boy();
    }

    //返回Bean的类型
    @Override
    public Class<?> getObjectType() {
        return Boy.class;
    }

    //是否单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
