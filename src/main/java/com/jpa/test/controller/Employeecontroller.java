package com.jpa.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.entity.Employee;
import com.jpa.test.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class Employeecontroller {
	
	@Autowired
	EmployeeService service;
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return service.createEmp(emp);
		
	}
	@GetMapping("/getemps")
	public List<Employee>getEmps(){
		return service.getEmployees();
	}
	@GetMapping("/getemp/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
	}
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee emp) {
	    return service.updateEmp(emp, id);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id){
	    service.deleteEmp(id);
	    return new ResponseEntity<String>("Employee Deleted Successfully", HttpStatus.OK);
	}


	

}
