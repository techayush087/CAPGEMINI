package com.library;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class libraryService {

	private static EntityManager em;
	static {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
		em=emf.createEntityManager();
		
	}
	
	public void create(Author author,List<Book> books) {
		em.getTransaction().begin();
		author.setBooks(books);
		em.persist(author);
		for(Book b : books)
	    {
	        b.setAuthor(author);        
	    }

	    em.getTransaction().commit();

	    System.out.println("Author with books saved");
		
	}
	
	public List<Author> getAllAuthors(){
		
		Query q = em.createQuery("from Author");
		List<Author> list = q.getResultList();

		for(Author a : list){
		    System.out.println("Author: " + a.getAuthorName());
		    for(Book b : a.getBooks()){
		        System.out.println("Book: " + b.getTitle());
		    }
		}
		return list;
	}
	
	
	public void update(int bid,double newPrice) {
		em.getTransaction().begin();
		Book b=em.find(Book.class,bid);
		if(b!=null) {
			b.setPrice(newPrice);
			System.out.println("Price Updated....");
		}
		System.out.println("Book not found...");
		
		em.getTransaction().commit();
	}
	
	public void deleteBook(int bid){

	    em.getTransaction().begin();

	    Book b = em.find(Book.class, bid);
	    System.out.println("======"+b.getTitle());

	    if(b != null){
	        em.remove(b);
	        System.out.println("Book Deleted");
	    }

	    em.getTransaction().commit();
	}
	
	public  void deleteAuthor(int aid){
	    
	    
	    
		em.getTransaction().begin();
	    
	    Author a = em.find(Author.class, aid);
	    
	    if(a != null){
	        em.remove(a);
	        System.out.println("Author and all related books are deleted.");
	    }
	    
	    em.getTransaction().commit();
	}
	
	
}
