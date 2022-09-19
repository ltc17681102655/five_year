package com.five.year.demo.annotation.map;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Date 2022/9/18 13:29
 * @Created by ltc
 */

@Component
public class Business {

    private final Map<String, MyService> serviceMap;

    public Business(Map<String, MyService> serviceMap) {
        this.serviceMap = serviceMap;
    }

    public void doBusiness(){
        serviceMap.forEach((key,service)->{
            service.doService();
        });
    }
}
