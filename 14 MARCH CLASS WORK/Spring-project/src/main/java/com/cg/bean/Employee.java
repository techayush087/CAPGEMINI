package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${empid}")
    private int empid;
	@Value("${name}")
    private String name;
    @Autowired
    private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
    
    
	public void printEmployee() {
		System.out.println("Emp id:" + empid);
		System.out.println("Emp name:" + name);
		System.out.println("=======Address======");
		System.out.println(address.getCity());
		System.out.println(address.getCountry());
		System.out.println(address.getZip());
	}
}
