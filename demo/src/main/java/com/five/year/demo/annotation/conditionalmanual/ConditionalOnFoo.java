package com.five.year.demo.annotation.conditionalmanual;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Date 2022/9/19 19:10
 * @Created by ltc
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnFooConditional.class)
public @interface ConditionalOnFoo {

    boolean value();
}
