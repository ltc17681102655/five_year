package com.five.year.demo.annotation.conditionalmanual;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @Date 2022/9/19 19:06
 * @Created by ltc
 */

public class OnFooConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 取出自定义注解ConditionalOnFoo中的所有变量
        final Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnFoo.class.getName());
        if (attributes == null) {
            return false;
        }
        // 返回value的值
        return (boolean) attributes.get("value");
    }
}
