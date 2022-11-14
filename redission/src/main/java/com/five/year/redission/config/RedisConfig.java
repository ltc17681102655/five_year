package com.five.year.redission.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Date 2022/11/6 14:18
 * @Created by ltc
 */

@Configuration
public class RedisConfig {

    /**
     * 配置RedissonClient
     *
     * @return RedissonClient 提供大量的工具方法
     */
    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        //此处调用的方法为单节点的redis
        config.useSingleServer().setAddress("redis://localhost:6379");
        return Redisson.create(config);
    }
}
