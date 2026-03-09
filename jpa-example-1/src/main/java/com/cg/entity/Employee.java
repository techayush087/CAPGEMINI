package com.cg.entity;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empid;
	private String name;
	private LocalDate dob;
	
	public Employee() {
		
	}
	

	public Employee(String name, LocalDate dob) {
		super();
		this.name = name;
		this.dob = dob;
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	

}
