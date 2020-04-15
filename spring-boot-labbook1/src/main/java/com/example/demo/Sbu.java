package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component("SBU")
public class Sbu {

	private int sbuId;
	private String sbuName;
	private String sbuHead;
	
	Employee emp1=new Employee(101, "Nived",500);
	Employee emp2=new Employee(102, "MR.X",1000);

	/*
	 * List<Employee> empList = new ArrayList<Employee>(); empList.add(emp1);
	 */ 
	 List<Employee> empList1 = Arrays.asList(emp1,emp2);
	 
	 
	
	public Sbu() {
		super();
	}
	public Sbu(int sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
	public void display()
	{
		System.out.println("SBU Details ");
		System.out.println("................................................");
		System.out.println("SBU ID           : "+sbuId);
		System.out.println("SBU Name         : "+sbuName);
		System.out.println("SBU Head         : "+sbuHead);
		System.out.println("Employee Details ");
		System.out.println(".................................................");
		System.out.println("Employeee        :"+empList1);
	}
	
}
