# community
牛客社区项目
本项目是一个基于SpringBoot的社区平台，实现了牛客网讨论区的功能。
实现了邮箱注册、验证码登录、发帖、评论、私信、点赞、关注、统计网站访问次数等功能，
数据库使用Mybatis、Redis，使用Kafka构建系统通知，使用Elasticsearch构建全文搜索功能。
同时实现生成pdf文件、上传云服务器等功能。

1.核心功能：
- 发帖、评论、私信、转发；
- 点赞、关注、通知、搜索；
- 权限、统计、调度、监控；


2.核心技术：
- Spring Boot、SSM
- Redis、Kafka、ElasticSearch
- Spring Security、Quatz、Caffeine