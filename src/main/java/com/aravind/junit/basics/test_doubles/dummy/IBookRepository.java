package com.aravind.junit.basics.test_doubles.dummy;

import java.util.Collection;

public interface IBookRepository {
	void addBook(Book book);
	Collection<Book> findAll();

}
