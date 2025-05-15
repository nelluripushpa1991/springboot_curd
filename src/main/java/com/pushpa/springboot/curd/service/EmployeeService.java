package com.pushpa.springboot.curd.service;

import com.pushpa.springboot.curd.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    public   Employee addEmployee(Employee employee);
    public  Employee updateEmployee(Employee employee);
    public  Employee getEmployee(int id);
    public  String deleteEmployee(int id);
}
