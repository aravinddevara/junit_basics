package com.aravind.junit.basics.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.aravind.junit.basics.test_doubles.dummy.Book;
import com.aravind.junit.basics.test_doubles.dummy.BookService;


public class DummyTest {
	
	@Test
	public void testDummy() {
		FakeBookRepository bookRepository=new FakeBookRepository();
		DummyEmailService emailService=new DummyEmailService();
		BookService bookService=new BookService(bookRepository,emailService);
		bookService.addBook(new Book("1","junit",200,LocalDate.now()));
		bookService.addBook(new Book("2","mockite",300,LocalDate.now()));
		assertEquals(2, bookService.findAllBooks());
	}

	@Test
	public void testDummyMocito() {
		FakeBookRepository bookRepository=mock(FakeBookRepository.class);
		DummyEmailService emailService=mock(DummyEmailService.class) ;
		BookService bookService=new BookService(bookRepository,emailService);
		
		Collection<Book> list=new ArrayList<>();
		
		list.add(new Book("1","junit",200,LocalDate.now()));
		list.add(new Book("2","mockite",300,LocalDate.now()));
		
		Mockito.when(bookRepository.findAll()).thenReturn(list);
		
		assertEquals(2, bookService.findAllBooks());
	}
}
