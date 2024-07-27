package com.aravind.junit.basics.dummy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.aravind.junit.basics.test_doubles.dummy.Book;
import com.aravind.junit.basics.test_doubles.dummy.IBookRepository;


public class FakeBookRepository implements IBookRepository {
	
	Map<String,Book> bookStore=new HashMap<String,Book>();

	@Override
	public void addBook(Book book) {
		bookStore.put(book.getBookId(), book);

	}

	@Override
	public Collection<Book> findAll() {
		// TODO Auto-generated method stub
		return bookStore.values();
	}

}
