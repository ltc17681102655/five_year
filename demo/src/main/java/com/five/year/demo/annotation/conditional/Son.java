package com.five.year.demo.annotation.conditional;

/**
 * @Date 2022/9/18 13:17
 * @Created by ltc
 */

public class Son {
    public Son(Father father) {
        System.out.println("has father! " + father);
        System.out.println("Son was init!");
    }
}
