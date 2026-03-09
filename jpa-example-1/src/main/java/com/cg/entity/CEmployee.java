package com.cg.entity;

import jakarta.persistence.*;

@Entity
public class CEmployee extends Employee {
	
	private double pay_Per_Hour;

	public double getPay_Per_Hour() {
		return pay_Per_Hour;
	}

	public void setPay_Per_Hour(double pay_Per_Hour) {
		this.pay_Per_Hour = pay_Per_Hour;
	}

	
	
	

}
