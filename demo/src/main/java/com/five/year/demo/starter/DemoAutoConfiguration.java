package com.five.year.demo.starter;

import org.springframework.context.annotation.Bean;

/**
 * @Date 2022/9/19 20:10
 * @Created by ltc
 */

public class DemoAutoConfiguration {

    @Bean
    public DemoHandler demoHandler() {
        return new DemoHandler();
    }

    @Bean
    public DemoListener demoListener() {
        return new DemoListener();
    }
}

