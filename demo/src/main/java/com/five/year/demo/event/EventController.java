package com.five.year.demo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2022/10/23 14:50
 * @Created by ltc
 */
@RestController
public class EventController {
    @Autowired
    ApplicationContext applicationContext;

    @RequestMapping("testPublishMsg")
    public void testPublishMsg(String msg) {
        applicationContext.publishEvent(new MyEvent(this, msg));
    }
}
