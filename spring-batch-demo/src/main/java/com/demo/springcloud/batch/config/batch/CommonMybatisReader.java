package com.demo.springcloud.batch.config.batch;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.batch.MyBatisPagingItemReader;

/**
 * @Author: ASUS
 * @description: 这是mybatis的reader工具
 * @Date: 13:53 2020/7/5
 */
public class CommonMybatisReader<T> extends MyBatisPagingItemReader {
    public CommonMybatisReader(SqlSessionFactory factory,String entity){
        setSqlSessionFactory(factory);

        // id 前部分是实体类的包的路径 name是对应的实体类 后部分是mybatis对应的查询id
        setQueryId("com.demo.springcloud.batch.mapper." + entity + ".selectList");

    }
}
