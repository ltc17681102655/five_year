package com.cxytiandi.sharding.table.algorithm;

import java.util.Collection;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

/**
 * 自定义分片算法
 *
 * @author yinjihuan
 */
public class ModShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Long> shardingValue) {
        for (String tableName : availableTargetNames) {
            if (tableName.endsWith(shardingValue.getValue() % 4 + "")) {
                return tableName;
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        //1
        System.out.println(1 % 4);
        //2
        System.out.println(2 % 4);
        //3
        System.out.println(3 % 4);
        //0
        System.out.println(4 % 4);
        //1
        System.out.println(5 % 4);
    }

}
