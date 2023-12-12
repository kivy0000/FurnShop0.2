package com.hspedu.furn.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 */
@Configuration
@Slf4j
public class DruidDataSourceConfig {

    //配置/注入DruidDataSource
    //提醒: 为什么我们配置/注入指定的数据源, 就替换了默认的数据源
    //再springboot 切换数据源时，讲过底层机制-小伙伴自己回顾
    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        log.info("数据源={}", druidDataSource.getClass());
        return druidDataSource;
    }
}
