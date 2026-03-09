package com.cg.entity;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeMain {
  public static void main(String[] args) {
	
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("my-pu");
	  EntityManager em=emf.createEntityManager();
	  em.getTransaction().begin();
	  
	  PEmployee obj=new PEmployee();
	  obj.setName("Ayush");
	  obj.setSalary(20000);
	  obj.setDob(LocalDate.of(2003, 10,10));
	  em.persist(obj);
	  
	  
	  em.getTransaction().commit();
	  System.out.println("Created...");
}
}
