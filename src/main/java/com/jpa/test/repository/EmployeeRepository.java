package com.jpa.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	

}
