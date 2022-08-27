package com.five.year.es.controller;

import com.five.year.es.model.EsPageReq;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Date 2022/8/27 11:07
 * @Created by ltc
 */
@RestController
public class EsController {

    private final TransportClient transportClient;

    public EsController(TransportClient transportClient) {
        this.transportClient = transportClient;
    }

    @PostMapping("query")
    public Object query(@RequestBody EsPageReq req) {
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        List<QueryBuilder> filter = boolQueryBuilder.filter();
        if (!StringUtils.isEmpty(req.getAge())) {
            filter.add(QueryBuilders.termQuery("age", req.getAge()));
        }
        if (!StringUtils.isEmpty(req.getName())) {
            filter.add(QueryBuilders.matchQuery("name", req.getName()));
        }

        SearchRequestBuilder searchRequestBuilder = transportClient.prepareSearch("person")
                .setTypes("person")
                .setQuery(boolQueryBuilder);
        return searchRequestBuilder.get();
    }

}
