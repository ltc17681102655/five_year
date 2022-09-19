package com.five.year.demo.annotation.conditionalmanual;

import org.springframework.stereotype.Component;

/**
 * @Date 2022/9/19 19:11
 * @Created by ltc
 */
@Component
@ConditionalOnFoo(true)
public class FooService {

    public FooService() {
        System.out.println("foo service init!!");
    }
}

