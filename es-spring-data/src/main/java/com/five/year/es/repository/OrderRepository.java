package com.five.year.es.repository;

import com.five.year.es.model.Order;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface OrderRepository extends ElasticsearchRepository<Order, Integer> {
}
