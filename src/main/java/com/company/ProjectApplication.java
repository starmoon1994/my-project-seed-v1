package com.company;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@MapperScan("com.company.project.mapper")
@ImportResource(locations = {"classpath:spring-bean.xml", "classpath:spring-druid.xml"})
@SpringBootApplication
@EnableScheduling
@EnableAsync
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }
}


/*
 *
 * @ImportResource的使用
 * 启动时加载xml形式的配置文件 兼容老SSM的相关配置
 * classpath路径：locations={"classpath:application-bean1.xml","classpath:application-bean2.xml"}
 * file路径： locations = {"file:d:/test/application-bean1.xml"};
 */

