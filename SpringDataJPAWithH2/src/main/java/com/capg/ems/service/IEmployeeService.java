package com.capg.ems.service;

import org.springframework.stereotype.Service;

import com.capg.ems.bean.Employee;


public interface IEmployeeService {
	
	
	public Employee addEmployee(Employee emp);
	
	public Employee updateEmployee(Employee emp);
	
	public void deleteEmployee(int eid);
		
	

}
