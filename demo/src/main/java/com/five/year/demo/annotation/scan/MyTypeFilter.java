package com.five.year.demo.annotation.scan;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Date 2022/9/18 12:57
 * @Created by ltc
 */

public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类的资源信息
        Resource resource = metadataReader.getResource();
        if ("com.five.year.demo.annotation.scan.User".equals(annotationMetadata.getClassName())) {
            return true;
        }
        return false;
    }
}
