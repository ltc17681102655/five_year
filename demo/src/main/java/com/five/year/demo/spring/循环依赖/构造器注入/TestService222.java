package com.five.year.demo.spring.循环依赖.构造器注入;

import org.springframework.stereotype.Service;

/**
 * @Date 2022/9/5 7:12
 * @Created by ltc
 */
@Service
public class TestService222 {
    public TestService222(TestService111 testService111) {
    }
}
