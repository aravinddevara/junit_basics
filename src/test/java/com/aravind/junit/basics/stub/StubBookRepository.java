package com.aravind.junit.basics.stub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.aravind.junit.basics.test_doubles.stub.Book;
import com.aravind.junit.basics.test_doubles.stub.IBookRepository;

public class StubBookRepository implements IBookRepository {

	@Override
	public List<Book> getNewBooks(int days) {
		List<Book> bookList=new ArrayList<Book>();
		bookList.add(new Book("1","junit",600,LocalDate.now()));
		bookList.add(new Book("2","Stub",450,LocalDate.now()));
		
		return bookList;
	}

}
