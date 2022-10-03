package com.five.year.demo.lifecycle;

import org.springframework.context.Lifecycle;

public class MyLifecycle implements Lifecycle {

    @Override
    public void start() {
        System.out.println("============================================startOk============================================");
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
