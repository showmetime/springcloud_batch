package com.demo.springcloud.batch.mapper;

import com.demo.springcloud.batch.entity.EmployeesProcess;

import java.util.List;

/**
 * @Author: ASUS
 * @description: TODO
 * @Date: 15:09 2020/7/5
 */
public interface EmployeesProcessMapper {
    void insertList(List<EmployeesProcess> employeesProcessList);
}
