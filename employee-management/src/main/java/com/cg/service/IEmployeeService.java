package com.cg.service;

import java.util.List;
import com.cg.bean.Employee;

public interface IEmployeeService {

    String createEmployee(Employee emp);

    Employee findById(String empid);

    List<Employee> getAllEmployee();

    String updateEmployeeName(String eid, String name);

    String removeEmployee(String empid);
}