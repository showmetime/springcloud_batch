package com.demo.springcloud.batch.config.batch;

import com.demo.springcloud.batch.entity.Employees;
import com.demo.springcloud.batch.entity.EmployeesProcess;
import com.demo.springcloud.batch.mapper.EmployeesMapper;
import com.demo.springcloud.batch.mapper.EmployeesProcessMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ASUS
 * @description: springbach组成：
 * 1、jobRespository 注册job的容器
 * 2、jobLauncher 用来启动的job的接口
 * 3、job的实际执行的任务 包含一个或多个step
 * 4、step 步骤包括itemReader itemProcessor 和 itemWrite
 * 5、itemReader 读取数据的几扣
 * 6、itemProcessor 处理数据的接口
 * 7、itemWrite 输出数据的接口
 * @Date: 12:53 2020/7/5
 */
@Configuration
@EnableBatchProcessing // 开启批量处理的支持
public class BatchConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Bean
    public Job employeeJob(){
        return jobBuilderFactory.get("employeeJob2")
                .incrementer(new RunIdIncrementer())
                .flow(employeeStep())
                .end()
                .build();
    }

    @Bean
    public Step employeeStep() {
        return stepBuilderFactory.get("employeeStep2")
                .<Employees, EmployeesProcess>chunk(200)
                .reader(commonMybatisReader())
                .processor(commonMybatisProcess())
                .writer(commonMybatisWriter())
                .build();
    }

    @Bean
    @StepScope
    public CommonMybatisReader<Employees> commonMybatisReader(){
        return new CommonMybatisReader(sqlSessionFactory, EmployeesMapper.class.getSimpleName());
    }

    @Bean
    @StepScope
    public CommonMybatisProcess commonMybatisProcess(){
        return new CommonMybatisProcess();
    }

    @Bean
    @StepScope
    public CommonMybatisWriter commonMybatisWriter(){
        return new CommonMybatisWriter(sqlSessionFactory, EmployeesProcessMapper.class.getName());
    }
}
