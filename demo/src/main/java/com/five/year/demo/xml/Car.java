package com.five.year.demo.xml;

/**
 * @Date 2022/9/18 11:44
 * @Created by ltc
 */

public class Car {
    private String name;

    private String brand;

    private Wheel wheel;

    public Car(String brand, Wheel wheel) {
        this.brand = brand;
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
