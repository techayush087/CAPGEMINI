package com.library;


import jakarta.persistence.*;
import java.util.*;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int bookId;
	private String title;
	private double price;
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author author;
	
	public Book() {
		
	}

	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
	
	
}
