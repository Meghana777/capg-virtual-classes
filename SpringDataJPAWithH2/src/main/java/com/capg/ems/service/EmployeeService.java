package com.capg.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ems.bean.Employee;
import com.capg.ems.dao.EmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public void deleteEmployee(int eid) {
		
		 repo.deleteById(eid);
		// TODO Auto-generated method stub

	}

}
