package com.five.year.demo.configuration;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * @Date 2022/9/19 9:26
 * @Created by ltc
 */

public class Test {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        // 设置继承的父类
        enhancer.setSuperclass(FooConfigConfiguration.class);
        // 设置拦截的方法
        enhancer.setCallback((MethodInterceptor) (obj, method, args1, methodProxy) -> {
            // 调用父类方法前打印一行日志
            System.out.println("cglib proxy!");
            return methodProxy.invokeSuper(obj, args1);
        });
        final FooConfigConfiguration fooConfig = (FooConfigConfiguration) enhancer.create();
//        fooConfig.bar();
    }
}
