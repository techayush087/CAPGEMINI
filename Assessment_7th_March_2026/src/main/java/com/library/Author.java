package com.library;
import jakarta.persistence.*;


import java.util.*;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorId;
	private String authorName;
	private String email;
	@OneToMany(mappedBy = "author",cascade=CascadeType.ALL)
	private List<Book> books;
    
	public Author() {
		
	}

	public Author(String authorName, String email) {
		super();
		this.authorName = authorName;
		this.email = email;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}
