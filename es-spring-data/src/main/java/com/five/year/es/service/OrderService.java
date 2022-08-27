package com.five.year.es.service;


import com.five.year.es.dto.PageResponse;
import com.five.year.es.model.Order;

import java.util.List;


public interface OrderService {
    void saveAll(List<Order> orders);

    Order findById(Integer id);

    void deleteById(Integer id);

    void updateById(Order order);

    PageResponse<Order> findList(Order order, Integer pageIndex, Integer pageSize);

    PageResponse<Order> findAll(Integer pageIndex, Integer pageSize);

    PageResponse<Order> findHighlight(Order order, Integer pageIndex, Integer pageSize);

    PageResponse<Order> findScroll(Order order, Integer pageIndex, Integer pageSize, String indexName, String scrollId);

    void bulkUpdate(List<Order> orders);

    List<String> suggest(String keyword);
}
