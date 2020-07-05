package com.demo.springcloud.batch.config.batch;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.batch.MyBatisBatchItemWriter;

/**
 * @Author: ASUS
 * @description: TODO
 * @Date: 14:31 2020/7/5
 */
public class CommonMybatisWriter<T> extends MyBatisBatchItemWriter {
    public CommonMybatisWriter(SqlSessionFactory factory, String name){
        setSqlSessionFactory(factory);
        // 草泥马 到这里 这个前半部门去掉了
        setStatementId(name + ".insertList");
    }
}
