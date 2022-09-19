package com.five.year.demo.starter;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import javax.annotation.Resource;

/**
 * @Date 2022/9/19 20:30
 * @Created by ltc
 */

public class DemoListener implements ApplicationListener<ContextRefreshedEvent> {

    @Resource
    private DemoHandler demoHandler;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        demoHandler.hello();
    }
}

