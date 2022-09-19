package com.five.year.demo.annotation.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Date 2022/9/18 12:54
 * @Created by ltc
 */
//@ComponentScan(basePackages = {"com.five.year.demo.annotation.scan"})
//@ComponentScan(basePackages = {"com.five.year.demo.annotation.scan"},
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {MyService.class})})
@ComponentScan(basePackages = {"com.five.year.demo.annotation.scan"},
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = {MyTypeFilter.class})},
        useDefaultFilters = false)//为false表示只使用上面声明了的filter,不使用Spring自带的过滤器
@Configuration
public class MainConfig {

}
