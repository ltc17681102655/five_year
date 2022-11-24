package com.five.year.demo.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @Date 2022/11/23 21:56
 * @Created by ltc
 */

public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        /**
         * loader :类加载器，用于加载代理对象。
         * interfaces : 被代理类实现的一些接口；
         * h : 实现了 InvocationHandler 接口的对象；
         */
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 目标类的类加载
                target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个
                new DebugInvocationHandler(target)   // 代理对象对应的自定义 InvocationHandler
        );
    }

    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
    }
}
