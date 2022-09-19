package com.five.year.demo.annotation.map;

import org.springframework.stereotype.Service;

/**
 * @Date 2022/9/18 13:29
 * @Created by ltc
 */

@Service
public class ThreeMyServiceImpl implements MyService {
    @Override
    public void doService() {
        System.out.println("ThreeServiceImpl.doService");
    }
}
