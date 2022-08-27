package com.five.year.es.controller;

import com.alibaba.fastjson.JSON;
import com.five.year.es.model.Order;
import com.five.year.es.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/doc/")
@RestController
public class DocController {

    @Autowired
    OrderService orderService;

    /**
     * 批量创建
     */
    @PostMapping("saveBatch")
    public String saveBatch(@RequestBody List<Order> orders) {
        if (CollectionUtils.isEmpty(orders)) {
            return "文档不能为空";
        }
        orderService.saveAll(orders);
        return "保存成功";
    }

    /**
     * 根据id删除
     */
    @GetMapping("deleteById")
    public String deleteById(@RequestParam Integer id) {
        orderService.deleteById(id);
        return "删除成功";
    }

    /**
     * 根据id更新
     */
    @PostMapping("updateById")
    public String updateById(@RequestBody Order order) {
        orderService.updateById(order);
        return "更新成功";
    }

    /**
     * 批量更新bulkUpdate
     */
    @GetMapping("bulkUpdate")
    public String bulkUpdate(@RequestBody List<Order> orders) {
        orderService.bulkUpdate(orders);
        return "更新成功";
    }

    /**
     * 根据id搜索
     */
    @GetMapping("findById")
    public String findById(@RequestParam Integer id) {
        return JSON.toJSONString(orderService.findById(id));
    }

    /**
     * 分页搜索所有
     */
    @GetMapping("findAll")
    public String findAll(@RequestParam Integer pageIndex, @RequestParam Integer pageSize) {
        return JSON.toJSONString(orderService.findAll(pageIndex, pageSize));
    }

    /**
     * 条件分页搜索
     */
    @GetMapping("findList")
    public String findList(@RequestBody Order order, @RequestParam Integer pageIndex, @RequestParam Integer pageSize) {
        return JSON.toJSONString(orderService.findList(order, pageIndex, pageSize));
    }

    /**
     * 条件高亮分页搜索
     */
    @GetMapping("findHighlight")
    public String findHighlight(@RequestBody(required = false) Order order, @RequestParam Integer pageIndex, @RequestParam Integer pageSize) {
        return JSON.toJSONString(orderService.findHighlight(order, pageIndex, pageSize));
    }

    /**
     * Scroll搜索
     */
    @GetMapping("findScroll")
    public String findScroll(@RequestBody(required = false) Order order, @RequestParam Integer pageIndex, @RequestParam Integer pageSize, @RequestParam String indexName,
                             @RequestParam String scrollId) {
        return JSON.toJSONString(orderService.findScroll(order, pageIndex, pageSize, indexName, scrollId));
    }

    /**
     * wildcard自动补全
     */
    @GetMapping("suggest")
    public String suggest(@RequestParam String keyword) {
        return JSON.toJSONString(orderService.suggest(keyword));
    }
}
