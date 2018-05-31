
# 更新记录
1. 20180530 增加对Druid监控数据的日志导出
2. 20180531 对定时任务DruidLogTask增加异步处理，使定时任务并行运行
说明：
这个项目是一个种子项目，主要用来快速构建一个可用的应用框架，使用的框架技术主要是：
springboot MyBatis(MySQL) LogBack Druid

- 其中Druid的配置较完善，不仅有SQL的监控，还有对spring层面的监控
- 其中logback的配置文件，对不同级别的日志进行了分别处理，ERROR级别的日志单独输出
- 其中MyBatis的扩展，自定义了一些typeHandler,可以更方便的进行数据映射，以满足复杂结构数据的存储




Tips:
0.使用前
- 需改application.properties中的端口号server.port=9999
- 需改application-dev.properties数据库的参数和密码
- 若不想使用Druid 自行修改spring.datasource.type的连接池类型（springboot2.02版本默认使用HikariCP）

1. 有关Drudi连接池的配置分为3处
- 一处在application-dev.properties 配置了相关参数
- 另一处support包里druid  声明了监控的filter和servlet 还有application-druid.xml 配置了对spring的监控
- 还有一处是使用logback对druid的日志进行输出 在logback-config.xml的名为druidSqlRollingFile的appender中
- Druid的配置使用比较传统的XML形式，便于管理，也便于配置使用aop的spring监控


2. 关于配置文件的加载
- 原SSM框架spring-XX.xml的配置通过启动类的注解@ImportResource来引入
- 不同类型的application-XX.properties通过公共application.properties中的参数spring.profiles.active=dev来配置

3. 打包发布
- 使用Jar形式打包发布
- 打包的maven命令是 clean package 
- 自定义打包出来的包名：pom文件中有个finalName 自行修改即可