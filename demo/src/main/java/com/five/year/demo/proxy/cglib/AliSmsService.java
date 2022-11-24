package com.five.year.demo.proxy.cglib;

/**
 * @Date 2022/11/23 22:07
 * @Created by ltc
 */

public class AliSmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
