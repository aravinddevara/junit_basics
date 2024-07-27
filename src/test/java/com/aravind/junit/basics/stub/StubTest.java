package com.aravind.junit.basics.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.aravind.junit.basics.test_doubles.fake.BookRepository;
import com.aravind.junit.basics.test_doubles.stub.Book;
import com.aravind.junit.basics.test_doubles.stub.BookService;

public class StubTest {
	@Test
	public void stubTest() {
		StubBookRepository bookRepository=new StubBookRepository();
		BookService bookService=new BookService(bookRepository);
		
		List<Book> bookList = bookService.getNewBooksWithAppliedDiscount(10, 7);		
		
		assertEquals(2, bookList.size());
		assertEquals(540, bookList.get(0).getPrice());
		assertEquals(405, bookList.get(1).getPrice());
		
	}

}
