package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("EMP")
public class Employee {


	private int empId;
	
	private String empName;
	
	private double empSalary;
	
	
	
	public Employee()
	{
		
	}
	public Employee(int employeeId, String employeeName, double employeeSalary)

	{
		super();
		this.empId = employeeId;
		this.empName = employeeName;
		this.empSalary = employeeSalary;
	
	}
	public int getEmployeeId() {
		return empId;
	}
	public void setEmployeeId(int employeeId) {
		this.empId = employeeId;
	}
	public String getEmployeeName() {
		return empName;
	}
	public void setEmployeeName(String employeeName) {
		this.empName = employeeName;
	}
	public double getEmployeeSalary() {
		return empSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.empSalary = employeeSalary;
	}



	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	public void display()
	{
		System.out.println("Employee Details ");
		System.out.println("................................");
		System.out.println("Employee ID           : "+empId);
		System.out.println("Employee Name         : "+empName);
		System.out.println("Employee Salary       : "+empSalary);
		
		
	}
	
	
	
}
