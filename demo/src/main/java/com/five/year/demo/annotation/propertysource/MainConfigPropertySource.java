package com.five.year.demo.annotation.propertysource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Date 2022/9/18 13:24
 * @Created by ltc
 */

@Configuration
@PropertySource(value = {"classpath:student.properties"}, encoding = "UTF-8")
public class MainConfigPropertySource {

    @Bean
    public Student student() {
        return new Student();
    }
}
