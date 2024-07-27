package com.aravind.junit.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

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

}
