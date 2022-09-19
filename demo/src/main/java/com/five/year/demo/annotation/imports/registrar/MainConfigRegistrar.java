package com.five.year.demo.annotation.imports.registrar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Date 2022/9/18 13:00
 * @Created by ltc
 */

@Import({MyImportBeanDefinitionRegistrar.class})
@Configuration
public class MainConfigRegistrar {
}
