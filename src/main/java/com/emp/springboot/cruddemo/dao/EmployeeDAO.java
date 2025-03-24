package com.emp.springboot.cruddemo.dao;

import com.emp.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
