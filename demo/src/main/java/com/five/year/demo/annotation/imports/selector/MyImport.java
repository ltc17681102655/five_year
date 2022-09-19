package com.five.year.demo.annotation.imports.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Date 2022/9/18 13:04
 * @Created by ltc
 */

public class MyImport implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.five.year.demo.annotation.imports.selector.Child"};
    }
}
