package com.capg.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ems.bean.Employee;
import com.capg.ems.service.IEmployeeService;

@RestController
@RequestMapping("/ems")
public class EmployeeController {
	
	@Autowired
	IEmployeeService service;

	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee emp) {
		
		service.addEmployee(emp);
		return "Employee Added Successfully!";
		
	}
	
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee emp) {
		
		service.updateEmployee(emp);
		
		return "Employee Updated Successfully!";
		
	}
	
	
	@GetMapping("/select")
	public String selectEmployee() {
		 
		return "Employee Selected!";
		
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteEmployee(@PathVariable("eid") int eid) {
		
		service.deleteEmployee(eid);
		
		return "Employee Deleted Successfully!"; 
	}
	
	
}
