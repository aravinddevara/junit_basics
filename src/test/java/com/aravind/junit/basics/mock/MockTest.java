package com.aravind.junit.basics.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.aravind.junit.basics.test_doubles.mock.Book;
import com.aravind.junit.basics.test_doubles.mock.BookService;


public class MockTest {
	@Test
	public void mockTest() {
		MockBookRepository bookRepository =new MockBookRepository();
		BookService bookservice=new BookService(bookRepository);
		
		Book book1=new Book("1","junit",200,LocalDate.now());
		Book book2=new Book("2","mockite",300,LocalDate.now());
		
		bookservice.addBook(book1);
	    bookservice.addBook(book2);
		
		bookRepository.verify(book2, 1);
	}

}
