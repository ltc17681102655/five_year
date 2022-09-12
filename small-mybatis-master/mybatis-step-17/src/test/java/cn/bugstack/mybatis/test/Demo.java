package cn.bugstack.mybatis.test;

import cn.bugstack.mybatis.test.po.Activity;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date 2022/9/12 16:07
 * @Created by ltc
 */

public class Demo {

    private static Map<Object, Object> map = new HashMap<>();

    public static void main(String[] args) {
        Activity activity = new Activity();
        activity.setActivityName("activi");
        map.put("a", activity);
        Activity a = (Activity) map.get("a");
        a.setActivityName("cc");
        Activity as = (Activity) map.get("a");
        System.out.println(JSON.toJSONString(as));
    }
}
