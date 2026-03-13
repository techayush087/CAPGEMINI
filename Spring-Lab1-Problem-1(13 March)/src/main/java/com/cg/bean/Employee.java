package com.cg.bean;

public class Employee {
     private int empid;
     private String name;
     private double salary;
     private String BU;
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
	 public String getBU() {
		 return BU;
	 }
	 public void setBU(String bU) {
		 BU = bU;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 
	 
	 public void printEmployee() {
		  System.out.println("Employee Details");
		   System.out.println("-------------------------");
		   System.out.println("Employee Id : "+getEmpid());
		   System.out.println("Employee Name : "+getName());
		   System.out.println("Employee Salary : "+getSalary());
		   System.out.println("Employee BU: "+getBU());
		   System.out.println("Employee Age : "+getAge());
	 }
     
     
     
}
