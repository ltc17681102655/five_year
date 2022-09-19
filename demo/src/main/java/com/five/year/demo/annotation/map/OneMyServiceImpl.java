package com.five.year.demo.annotation.map;

import org.springframework.stereotype.Service;

/**
 * @Date 2022/9/18 13:28
 * @Created by ltc
 */

@Service
public class OneMyServiceImpl implements MyService {
    @Override
    public void doService() {
        System.out.println("OneServiceImpl.doService");
    }
}
