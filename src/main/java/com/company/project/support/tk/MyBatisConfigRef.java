package com.company.project.support.tk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Config;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.ArrayList;
import java.util.List;

/**
 * 配置tk.mybatis
 * 一处是在本类中的MapperHelper
 * 一处是在
 */
@Configuration
@MapperScan(value = "tk.mybatis.mapper.annotation", mapperHelperRef = "mapperHelper",basePackages = "com.company.project.mapper")
public class MyBatisConfigRef {
    //其他

    @Bean
    public MapperHelper mapperHelper() {
        Config config = new Config();
        List<Class> mappers = new ArrayList<Class>();
        mappers.add(Mapper.class);
        // 使用java配置的方式
        // 载入默认的通用mapper
        config.setMappers(mappers);
        config.setNotEmpty(true);
        config.setUseSimpleType(true);
        config.setSafeDelete(true);
        config.setSafeUpdate(true);
        MapperHelper mapperHelper = new MapperHelper();
        mapperHelper.setConfig(config);
        return mapperHelper;
    }
}