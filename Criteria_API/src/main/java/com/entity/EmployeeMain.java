package com.entity;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class EmployeeMain {
      public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
		EntityManager em=emf.createEntityManager();
		
		CriteriaBuilder cb =em.getCriteriaBuilder();
		CriteriaQuery<Object[]> cq=cb.createQuery(Object[].class);
		Root<Employee> r=cq.from(Employee.class);
		
		cq.multiselect(r.get("Dept"),cb.count(r));
		cq.groupBy(r.get("Dept"));
		
		List<Object[]> li=em.createQuery(cq).getResultList();
		
		li.forEach(e->System.out.println(e[0] + " "+e[1]));
		
		
		
	}
}
