package com.labs;

public class EmployeeMain {
    
	public static void main(String[] args) {
		EmployeeService es=new EmployeeService();
		
//		System.out.println("The total salary of all the employees: "+ es.sumOfSalary());
//		
//		System.out.println("The no of employees in each deprtment \n: "+ es.countNoOfEmployeeByDept());
//		
//		System.out.println("Senior most Employee is \n: "+ es.getSeniorMostEmployee());
//		
//		System.out.println("Employees without department \n: "+ es.getEmployeeWithoutDept());
		
		System.out.println("Employees without department \n: "+ es.getEmployeeWithDuration());
		
	}
}
