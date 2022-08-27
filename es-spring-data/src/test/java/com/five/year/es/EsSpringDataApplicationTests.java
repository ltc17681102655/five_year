package com.five.year.es;

import com.five.year.es.controller.DocController;
import com.five.year.es.model.Order;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EsSpringDataApplicationTests {

    @Autowired
    private DocController docController;

    @Test
    public void demo() {
        Order order = new Order();
        order.setId(2);
        order.setOrderNo(101l);
        order.setOrderAmount(100l);
        order.setOrderDesc("hello");
        order.setUsername("it");
        order.setUserPhone("666");
        order.setOrderType(1);
        docController.saveBatch(Lists.newArrayList(order));
    }
}
