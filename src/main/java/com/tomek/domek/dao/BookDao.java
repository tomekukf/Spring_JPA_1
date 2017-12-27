package com.tomek.domek.dao;

import com.tomek.domek.model.Book;

public interface BookDao {

	
	public void saveBook (Book book);
	public Book getBook(Long id);
}
