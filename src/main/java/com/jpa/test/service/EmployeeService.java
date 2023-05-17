package com.jpa.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.test.entity.Employee;

@Service
public interface EmployeeService {
	
	//create, getemp, getempbyid, delete, update 
	public Employee createEmp(Employee emp);
	public List<Employee>getEmployees();
	public Employee getEmployee(int id);
	public Employee updateEmp(Employee emp,int id);
	public void deleteEmp(int id);
	
}