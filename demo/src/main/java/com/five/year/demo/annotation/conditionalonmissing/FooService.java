package com.five.year.demo.annotation.conditionalonmissing;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.stereotype.Component;

/**
 * @Date 2022/9/19 10:09
 * @Created by ltc
 */

@Component
//@ConditionalOnMissingBean(value = {FooConditional.class})
@ConditionalOnMissingClass(value = {"com.five.year.demo.annotation.conditionalonmissing.FooConditional"})
public class FooService {

    public FooService() {
        System.out.println("foo service init!!");
    }
}
