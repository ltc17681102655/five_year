package com.five.year.demo.spring.循环依赖.多例的setter注入;

/**
 * @Date 2022/9/5 6:51
 * @Created by ltc
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Service
public class TestService11 {

    @Autowired
    private TestService22 testService22;

    public void test1() {
    }
}