package com.five.year.demo.proxy.jdk;

/**
 * @Date 2022/11/23 21:54
 * @Created by ltc
 */

public class SmsServiceImpl implements SmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
