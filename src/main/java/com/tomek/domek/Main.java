package com.tomek.domek;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tomek.domek.dao.BookDao;
import com.tomek.domek.model.Book;

@Configuration
@ComponentScan
public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		BookDao bookDao =  context.getBean(BookDao.class);
		Book book = new Book("12345", "tomek domek", "noname");

		bookDao.saveBook(book);
		Book book2 = bookDao.getBook(1L);
		System.out.println(book2);
context.close();
	}
}
