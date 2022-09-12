package com.five.year.demo.spring.循环依赖.单列的setter注入;

/**
 * @Date 2022/9/5 6:51
 * @Created by ltc
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService1 {

    @Autowired
    private TestService2 testService2;

    public void test1() {
    }
}