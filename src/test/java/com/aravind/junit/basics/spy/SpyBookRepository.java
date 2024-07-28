package com.aravind.junit.basics.spy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.aravind.junit.basics.test_doubles.spy.Book;
import com.aravind.junit.basics.test_doubles.spy.IBookRepository;

public class SpyBookRepository implements IBookRepository {
	

	int timeCalled=0;
	Book lastSaved=null;

	@Override
	public void addBook(Book book) {
		lastSaved=book;
		timeCalled++;
	}
	
	public int timeCalled() {
		return timeCalled;
	}
	
	
	public boolean lastCalledWith(Book book) {
		return lastSaved.equals(book);
	}
	


}
