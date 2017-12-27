package com.tomek.domek.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Book implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3685726429031366159L;
	@Id
	@GeneratedValue
	private Long id;
	
	private String isbn;
	private String title;
	private String authoor;
	
	
	
	public Book() {
	}



	public Book(String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.authoor = author;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return authoor;
	}



	public void setAuthor(String author) {
		authoor = author;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", Author=" + authoor + "]";
	}
	
	
	
	

}
