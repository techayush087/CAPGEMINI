package com.cg.bean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


public class EmployeeService {
 
  private Map<Integer,Employee> mapEmp;

  public Map<Integer, Employee> getMapEmp() {
	return mapEmp;
  }

  public void setMapEmp(Map<Integer, Employee> mapEmp) {
	this.mapEmp = mapEmp;
  }
  
  public Employee getEmployee(int empid) {
	  
		  return mapEmp.get(empid);
	 
  }
  
  
  
}
