1:下载maven

2:maven配置阿里云镜像

<mirrors>   
    <mirror>
        <id>alimaven</id>
        <name>aliyun maven</name>
        <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
        <mirrorOf>central</mirrorOf>
    </mirror>
    <mirror>
        <id>alimaven</id>
        <mirrorOf>central</mirrorOf>
        <name>aliyun maven</name>
        <url>http://maven.aliyun.com/nexus/content/repositories/central/</url>
    </mirror>
</mirrors>

3:下载elasticsearch
https://www.elastic.co/downloads/past-releases/elasticsearch-6-8-13
解压后:到elasticsearch-6.8.13\bin目录下启动elasticsearch.bat

4:浏览器访问 http://localhost:9200
返回:如下表示成功

```json
{
  "name": "_BAGE6i",
  "cluster_name": "elasticsearch",
  "cluster_uuid": "5OEA3CdPRSG9FAM22aqUjw",
  "version": {
    "number": "6.8.13",
    "build_flavor": "default",
    "build_type": "zip",
    "build_hash": "be13c69",
    "build_date": "2020-10-16T09:09:46.555371Z",
    "build_snapshot": false,
    "lucene_version": "7.7.3",
    "minimum_wire_compatibility_version": "5.6.0",
    "minimum_index_compatibility_version": "5.0.0"
  },
  "tagline": "You Know, for Search"
}
```

5:google浏览器插件推荐 ElasticSearch Head