package com.cg.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {
	
   @Value("${city}")
   private String city;
   @Value("${country}")
   private String Country;
   @Value("${zip}")
   private int zip;
   
   
  
   public Address() {
}
   public Address(String city, String country, int zip) {
	super();
	this.city = city;
	Country = country;
	this.zip = zip;
}
   public String getCity() {
	return city;
   }
   public void setCity(String city) {
	this.city = city;
   }
   public String getCountry() {
	return Country;
   }
   public void setCountry(String country) {
	Country = country;
   }
   public int getZip() {
	return zip;
   }
   public void setZip(int zip) {
	this.zip = zip;
   }
   
   
}
