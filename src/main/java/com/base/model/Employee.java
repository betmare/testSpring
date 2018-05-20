package com.base.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.internal.NotNull;

@Entity
public class Employee {
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	@NotNull
	private String name;
	@Column
	@NotNull
	private String telephone;
	@Column
	@NotNull
	private String address;
	@Column(name="employment_date")
	@NotNull
	private Date employmentDate;
	@Column(name="employee_type_id")
	private int employeeType;
	public Employee(){}
	public Employee(int id, String name, String telephone, String address, Date employmentDate, int employeeType) {
		super();
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.address = address;
		this.employmentDate = employmentDate;
		this.employeeType = employeeType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getEmploymentDate() {
		return employmentDate;
	}
	public void setEmploymentDate(Date employmentDate) {
		this.employmentDate = employmentDate;
	}
	public int getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}
	public int getId() {
		return id;
	}	
	
}
