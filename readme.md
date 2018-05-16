说明：
1. 有关Drudi连接池的配置分为3处
- 一处在application-dev.properties 配置了相关参数
- 另一处support包里druid  声明了监控的filter和servlet 还有application-druid.xml 配置了对spring的监控
- 还有一处是使用logback对druid的日志进行输出 在logback-config.xml的名为druidSqlRollingFile的appender中


2. 关于配置文件的加载
- 原SSM框架spring-XX.xml的配置通过启动类的注解@ImportResource来引入
- 不同类型的application-XX.properties通过公共application.properties中的参数spring.profiles.active=dev来配置

3. 打包发布
使用Jar形式打包发布
打包的maven命令是 clean package 
自定义打包出来的包名：pom文件中有个finalName 自行修改即可