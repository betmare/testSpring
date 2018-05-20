package com.base.service;

import java.util.List;

import com.base.model.Employee;

public interface EmployeeService {
	public List<Employee> getAll();
	public Employee getById(int employeeId);
}
