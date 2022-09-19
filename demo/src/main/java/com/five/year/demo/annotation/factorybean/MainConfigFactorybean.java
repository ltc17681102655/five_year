package com.five.year.demo.annotation.factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Date 2022/9/18 11:56
 * @Created by ltc
 */
@Configuration
public class MainConfigFactorybean {

    @Bean(value = "person")
    //@Scope(value = "prototype")
    //@Lazy
    public Person person1() {
        return new Person();
    }

    @Bean
    public BoyFactoryBean boyFactoryBean() {
        return new BoyFactoryBean();
    }

}
