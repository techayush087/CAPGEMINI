package com.cg.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${empId}")
     private int empid;
	@Value("empName}")
     private String name;
	@Value("${empSalary}")
     private double salary;
     private SBU businessUnit;
	
    
     
   
     
	 public Employee() {
		 
		
	}
	 public int getEmpid() {
		 return empid;
	 }
	 public void setEmpid(int empid) {
		 this.empid = empid;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public double getSalary() {
		 return salary;
	 }
	 public void setSalary(double salary) {
		 this.salary = salary;
	 }
	
	
	 
	 public SBU getBusinessUnit() {
		return businessUnit;
	}
	 public void setBusinessUnit(SBU businessUnit) {
		 this.businessUnit = businessUnit;
	 }
	 public void printEmployee() {
		  System.out.println("Employee Details");
		   System.out.println("-------------------------");
		   System.out.println("Employee Id : "+getEmpid());
		   System.out.println("Employee Name : "+getName());
		   System.out.println("Employee Salary : "+getSalary());
		   System.out.println("Employee BU: "+getBusinessUnit());
		 
	 }
     
     
     
}
