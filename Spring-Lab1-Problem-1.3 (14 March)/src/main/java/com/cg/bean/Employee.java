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
	 @Override
	 public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", BU=" + BU + ", age=" + age
				+ "]";
	 }
	 
	
     
     
}
