package com.capg.ems.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	
	@Id
	private int eid;
	private String ename;
	private double sal;
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}


	public Employee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
