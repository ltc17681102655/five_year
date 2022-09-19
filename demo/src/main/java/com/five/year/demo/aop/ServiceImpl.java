package com.five.year.demo.aop;

import org.springframework.stereotype.Service;

/**
 * @Date 2022/9/18 23:32
 * @Created by ltc
 */

@Service("service")
public class ServiceImpl implements IService {

    @Override
    public void doService() {
        System.out.println("do service ...");
    }

    public void matchMethod() {
        System.out.println("ServiceImpl.notMatchMethod");
    }
}

