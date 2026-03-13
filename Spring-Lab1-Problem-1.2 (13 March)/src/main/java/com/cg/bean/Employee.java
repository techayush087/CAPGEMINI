package com.cg.bean;

public class Employee {
     private int empid;
     private String name;
     private double salary;
     private SBU businessUnit;
     private int age;
     
   
     
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
