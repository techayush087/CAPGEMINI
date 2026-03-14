package com.cg.bean;

import java.util.List;

public class SBU {
	private String sbuId;
	private String sbuHead;
	private String sbuName;
	private List<Employee> empList;

	public SBU() {

	}

	public String getSbuId() {
		return sbuId;
	}

	public void setSbuId(String sbuId) {
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

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public void printSBU() {
		System.out.println("SBU Details");
		System.out.println("-------------------------");
		System.out.println("sbuCode : " + getSbuId());
		System.out.println("sbuHead : " + getSbuName());
		System.out.println("sbuName : " + getSbuHead());
		System.out.println("Employee Deatils:----------");
		System.out.println(getEmpList());
	}

}
