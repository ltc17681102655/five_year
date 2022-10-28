package com.five.year.demo.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Date 2022/10/23 14:46
 * @Created by ltc
 */
public class MyEvent extends ApplicationEvent {

    private String msg;

    public MyEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
