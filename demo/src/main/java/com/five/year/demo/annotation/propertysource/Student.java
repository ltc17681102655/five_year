package com.five.year.demo.annotation.propertysource;

import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

/**
 * @Date 2022/9/18 13:22
 * @Created by ltc
 */

public class Student {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;
    @Value("${score}")
    private BigDecimal score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}
