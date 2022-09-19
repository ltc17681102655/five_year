package com.five.year.demo.annotation.conditionalsimple;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @Date 2022/9/19 10:09
 * @Created by ltc
 */

@Component
@Conditional(FooConditional.class)
public class FooService {

    public FooService() {
        System.out.println("foo service init!!");
    }
}
