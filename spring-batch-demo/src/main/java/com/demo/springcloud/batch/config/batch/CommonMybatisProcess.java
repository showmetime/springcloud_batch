package com.demo.springcloud.batch.config.batch;

import com.demo.springcloud.batch.entity.Employees;
import com.demo.springcloud.batch.entity.EmployeesProcess;
import org.springframework.batch.core.jsr.ItemProcessListenerAdapter;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.BeanUtils;

import javax.batch.api.chunk.listener.ItemProcessListener;

/**
 * @Author: ASUS
 * @description: TODO
 * @Date: 14:34 2020/7/5
 */
public class CommonMybatisProcess implements ItemProcessor<Employees, EmployeesProcess> {

    @Override
    public EmployeesProcess process(Employees employees) throws Exception {
        EmployeesProcess employeesProcess = new EmployeesProcess();
        BeanUtils.copyProperties(employees,employeesProcess);
        employeesProcess.setSex(1);
        employeesProcess.setPhone("1777077387");
        return employeesProcess;
    }
}
