package com.five.year.es;

import com.alibaba.fastjson.JSON;
import com.five.year.es.dto.PageResponse;
import com.five.year.es.model.Order;
import com.five.year.es.service.OrderService;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class EsSpringDataApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    public void saveAll() {
        List<Order> list = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            Order order = new Order();
            order.setId(i);
            order.setOrderNo(101l);
            order.setOrderAmount(100l);
            order.setOrderDesc("hello " + i);
            order.setUsername("it " + i);
            order.setUserPhone("666 " + i);
            order.setOrderType(1);

            list.add(order);
        }
        orderService.saveAll(list);
    }

    @Test
    public void deleteById() {
        orderService.deleteById(1);
    }

    @Test
    public void findById() {
        Order order = orderService.findById(2);
        System.out.println(JSON.toJSONString(order));
    }

    @Test
    public void updateById() {
        Order order = new Order();
        order.setId(2);
        order.setUserPhone("999");
        orderService.updateById(order);
    }

    @Test
    public void suggest() {
        List<String> hello = orderService.suggest("hello");
        System.out.println(hello);
    }

    @Test
    public void demo() {
        Order o = new Order();
        o.setOrderNo(101l);
        PageResponse<Order> order = orderService.findScroll(o, 0, 10, "order", "");
        System.out.println(JSON.toJSONString(order));
        PageResponse<Order> order2 = orderService.findScroll(o, 0, 10, "order", order.getScrollId());
        System.out.println(JSON.toJSONString(order2));
    }
}
