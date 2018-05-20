package com.base.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.model.Employee;
import com.base.service.EmployeeService;

@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Employee getById(int employeeId) {		
		return sessionFactory.getCurrentSession().get(Employee.class, employeeId);
	}

}
