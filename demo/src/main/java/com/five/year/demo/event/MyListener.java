package com.five.year.demo.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Date 2022/10/23 14:48
 * @Created by ltc
 */
@Component
@Slf4j
public class MyListener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info("MyListener收到了MyEvent的消息：{}", event.getMsg());
    }
}
