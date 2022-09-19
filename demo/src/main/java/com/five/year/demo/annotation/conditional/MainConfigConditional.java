package com.five.year.demo.annotation.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Date 2022/9/18 13:19
 * @Created by ltc
 */

@Configuration
public class MainConfigConditional {

    @Bean
    public Father father() {
        return new Father();
    }

    @Bean
    @Conditional(MyCondition.class)
    public Son son(Father father) {
        return new Son(father);
    }
}
