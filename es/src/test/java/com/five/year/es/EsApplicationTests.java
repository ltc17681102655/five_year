package com.five.year.es;

import com.alibaba.fastjson.JSON;
import com.five.year.es.controller.EsController;
import com.five.year.es.model.EsPageReq;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EsApplicationTests {

    @Autowired
    private EsController esController;

    @Test
    void testAge() {
        EsPageReq pageReq = new EsPageReq();
        pageReq.setAge("30");
        Object query = esController.query(pageReq);
        System.out.println(JSON.toJSONString(query));
    }

    @Test
    void testName() {
        EsPageReq pageReq = new EsPageReq();
        //默认 standard分词后还是 five_year
        //five year 会拆分成 five 和 year两个词
        pageReq.setName("five_year");
        Object query = esController.query(pageReq);
        System.out.println(JSON.toJSONString(query));
    }
}
