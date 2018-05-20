package com.base.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.springframework.web.context.annotation.SessionScope;

import com.base.model.Employee;
import com.base.service.EmployeeService;

@ManagedBean(name="employeeBean")
@SessionScope
public class EmployeeBean {
	@ManagedProperty(value="#{employeeService}")
	private EmployeeService employeeService;
	private Employee employee = new Employee();
	
	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getEmployee(){
		// Calling Business Service
		employee=employeeService.getById(2);
		// Add message
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("The Employee "+this.employee.getName()));
		return "The Employee "+this.employee.getName();
	}
}
