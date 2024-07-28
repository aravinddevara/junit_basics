package com.aravind.junit.basics.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.aravind.junit.basics.test_doubles.mock.IBookRepository;
import com.aravind.junit.basics.test_doubles.mock.Book;


public class MockBookRepository implements IBookRepository {
	

	int timesCalled=0;
	Book lastSaved=null;

	@Override
	public void addBook(Book book) {
		lastSaved=book;
		timesCalled++;
	}
	
	public int timeCalled() {
		return timesCalled;
	}
	
	
	public boolean lastCalledWith(Book book) {
		return lastSaved.equals(book);
	}
	
	
	public void verify(Book book,int times) {
		assertEquals(times, timesCalled);
		assertTrue(lastSaved.equals(book));
	}
	


}
