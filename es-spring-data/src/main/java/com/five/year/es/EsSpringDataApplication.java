package com.five.year.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class EsSpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsSpringDataApplication.class, args);
    }

}
