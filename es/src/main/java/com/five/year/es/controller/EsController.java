package com.five.year.es.controller;

import com.five.year.es.model.EsPageReq;
import com.five.year.es.model.PersonModel;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
        if (!StringUtils.isEmpty(req.getAge())) {
            boolQueryBuilder.must(QueryBuilders.termQuery("age", req.getAge()));
        }
        if (!StringUtils.isEmpty(req.getName())) {
            boolQueryBuilder.must(QueryBuilders.matchQuery("nage", req.getName()));
        }

        SearchRequestBuilder searchRequestBuilder = transportClient.prepareSearch("person")
                .setTypes("person")
                .setQuery(boolQueryBuilder);
        return searchRequestBuilder.get();
    }

}
