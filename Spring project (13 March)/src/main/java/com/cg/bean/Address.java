package com.cg.bean;

public class Address {
   private String city;
   private String Country;
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
