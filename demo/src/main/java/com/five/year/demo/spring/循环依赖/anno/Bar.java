package com.five.year.demo.spring.循环依赖.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Date 2022/9/15 7:25
 * @Created by ltc
 */

@Component
public class Bar {
    @Autowired
    private Foo foo;
}
