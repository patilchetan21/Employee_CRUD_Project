package com.emp.springboot.cruddemo.service;

import com.emp.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
