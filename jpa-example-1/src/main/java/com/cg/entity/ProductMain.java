package com.cg.entity;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class ProductMain {
	public static void main(String[] args) {
		
	
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("my-pu");
	  EntityManager em=emf.createEntityManager();
	  
//	  TypedQuery<Product> q=em.createQuery("Select p from Product p",Product.class);
//	  List<Product> li=q.getResultList();
//	  TypedQuery<Object[]> q=em.createQuery("Select p.name,p.price,p.mfd from Product p",Object[].class);
//	  List<Object[]> li=q.getResultList();
//	  
//	  li.forEach(e->System.out.println(e[0] + "  "+e[1]+"  "+e[2]));
//	  
//	

//	  TypedQuery<Product> q=em.createQuery("Select p from Product p where p.price<:a",Product.class);
//	  q.setParameter("a", 1000);
//      List<Product> li=q.getResultList();
//       
//      li.forEach(e->System.out.println(e));
	  
	  em.getTransaction().begin();	  
//	  Query q=em.createQuery("update Product p set p.price=40000 where p.pid=102");
//	  int row=q.executeUpdate();
//	  em.getTransaction().commit();	
	  
	  Query q=em.createNativeQuery("update Product_table p set p.price=40000 where p.pid=102");
	  int row=q.executeUpdate();
	  em.getTransaction().commit();	
	  System.out.println("Updated ->"+ row);
	  }

}

