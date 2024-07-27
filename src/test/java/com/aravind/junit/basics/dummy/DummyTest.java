package com.aravind.junit.basics.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

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

}
