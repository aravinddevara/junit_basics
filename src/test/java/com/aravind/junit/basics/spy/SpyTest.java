package com.aravind.junit.basics.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.aravind.junit.basics.test_doubles.spy.Book;
import com.aravind.junit.basics.test_doubles.spy.BookService;

public class SpyTest {
	@Test
	public void spyTest() {
		SpyBookRepository bookRepository =new SpyBookRepository();
		BookService bookservice=new BookService(bookRepository);
		
		Book book1=new Book("1","junit",200,LocalDate.now());
		Book book2=new Book("2","mockite",300,LocalDate.now());
		
		bookservice.addBook(book1);
		bookservice.addBook(book2);
		
		assertEquals(1, bookRepository.timeCalled);
		assertTrue(bookRepository.lastCalledWith(book2));
	}
	
	@Test
	public void spyTestMockito() {
		SpyBookRepository bookRepository =Mockito.spy(SpyBookRepository.class);
		BookService bookservice=new BookService(bookRepository);
		
		Book book1=new Book("1","junit",200,LocalDate.now());
		Book book2=new Book("2","mockite",300,LocalDate.now());
		
		bookservice.addBook(book1);
		bookservice.addBook(book2);
		
		Mockito.verify(bookRepository,Mockito.times(1)).addBook(book2);
		Mockito.verify(bookRepository,Mockito.times(0)).addBook(book1);
	}
	
	
	

}
