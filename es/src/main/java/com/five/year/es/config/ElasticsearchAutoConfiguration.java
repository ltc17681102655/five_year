package com.five.year.es.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class ElasticsearchAutoConfiguration {

    @Value("${es.hostName}")
    private String clusterNodes;

    @Value("${es.cluster.name}")
    private String clusterName;

    @Bean
    public TransportClient transportClient() throws UnknownHostException {
        // 配置客户端连接ES的集群名称
        Settings settings = Settings.builder()
                .put("cluster.name", clusterName)
                .build();

        // 创建TransportClient对象
        TransportClient client = new PreBuiltTransportClient(settings);

        // 解析application.properties配置的ES连接地址, 例如 10.19.180.200:9300,10.19.180.192:9300
        // 1. 多地址用逗号分隔
        String[] nodes = clusterNodes.split(",");
        for (int i = 0; i < nodes.length; i++) {
            // 冒号分割ip和端口号
            String[] hostport = nodes[i].split(":");
            String host = hostport[0];
            String port = hostport[1];
            client.addTransportAddress(new TransportAddress(InetAddress.getByName(host), Integer.valueOf(port)));
        }
        return client;
    }

}
