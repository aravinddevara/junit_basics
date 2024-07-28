package com.aravind.junit.basics.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.aravind.junit.basics.test_doubles.fake.Book;
import com.aravind.junit.basics.test_doubles.fake.BookService;
import com.aravind.junit.basics.test_doubles.fake.IBookRepository;

public class FakeTest {
	
	@Test
	public void testFake() {
		IBookRepository bookRepository=new FakeBookRepository();
		BookService bookService=new BookService(bookRepository);
		bookService.addBook(new Book("1","junit",200,LocalDate.now()));
		bookService.addBook(new Book("2","mockite",300,LocalDate.now()));
		assertEquals(2, bookService.findAllBooks());
		
	}
	
	@Test
	public void testFakeWithMockito() {
		IBookRepository bookRepository=Mockito.mock(IBookRepository.class);

		BookService bookService=new BookService(bookRepository);
		Book book1=new Book("1","junit",200,LocalDate.now());
		Book book2=new Book("2","mockite",300,LocalDate.now());
		Collection<Book> list=new ArrayList<Book>();
		list.add(book1);
		list.add(book2);
		
		 
		Mockito.when(bookRepository.findAll()).thenReturn(list);
		assertEquals(2, bookService.findAllBooks());
		
	}

}
