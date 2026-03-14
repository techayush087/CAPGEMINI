package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;
import com.cg.bean.EmployeeService;
import com.cg.bean.SBU;

public class EmployeeMain {
   public static void main(String[] args) {
	
	   ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
	   EmployeeService es=(EmployeeService)ctx.getBean("es");
	   
	   System.out.println(es.getEmployee(101)); 
	   
}
}
