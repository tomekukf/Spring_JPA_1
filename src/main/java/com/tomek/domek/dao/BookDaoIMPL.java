package com.tomek.domek.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.tomek.domek.model.Book;

//Alternatywnie moze byc @Componnent znaczy to samo tylko reposityory przy hibernate 

@Repository
public class BookDaoIMPL implements BookDao {
	// Moze byc rowniez @Autowired

	@PersistenceUnit
	private EntityManagerFactory emFactory;

	public BookDaoIMPL() {
	}

	@Override
	public void saveBook(Book book) {
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		eTrans.begin();
		eManager.persist(book);
		eTrans.commit();
		eManager.close();
	}

	@Override
	public Book getBook(Long id) {
		EntityManager eManager = emFactory.createEntityManager();
		Book book = eManager.find(Book.class, id);
		eManager.close();
		return book;
	}

}
