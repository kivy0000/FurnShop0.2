package com.hspedu.furn.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 */
@Configuration
public class MybatisPlusConfig {

    /**
     *
     * 1、注入MybatisPlusInterceptor 对象/bean
     * 2. 在MybatisPlusInterceptor bean 加入分页插件 PaginationInnerInterceptor
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //这里分页需要指定数据库类型,因为不同的DB,分页SQL语句不同
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}
