package com.five.year.redission.util;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * @Date 2022/11/6 14:21
 * @Created by ltc
 */

public class DistributionLockUtil {

    public static void main(String[] args) {
        Config config = new Config();
        //此处调用的方法为单节点的redis
        config.useSingleServer().setAddress("redis://localhost:6379");
        RedissonClient redissonClient = Redisson.create(config);

        //获取到根据参数获取指定key的锁对象
        RLock lock = redissonClient.getLock("lock");
        //trylock方法三个参数 l1锁最大等待时长 l2 释放锁的时间 参数三时间单位
        //空参 l1 为 -1不等待 释放锁时间为30秒
        try {
            boolean islock = lock.tryLock();
            if (islock) {
                //得到锁
            }
        } finally {
            lock.unlock();
        }
    }
}
