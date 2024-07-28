package com.aravind.junit.basics.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
	
	
	@Test
	public void stubTestMockito() {
		StubBookRepository bookRepository=Mockito.mock(StubBookRepository.class);
		BookService bookService=new BookService(bookRepository);
		List<Book> newBookList=new ArrayList<Book>();
		newBookList.add(new Book("1","junit",600,LocalDate.now()));
		newBookList.add(new Book("2","Stub",450,LocalDate.now()));
		Mockito.when(bookRepository.getNewBooks(7)).thenReturn(newBookList);
		List<Book> discountedBookList = bookService.getNewBooksWithAppliedDiscount(10, 7);		
		
		assertEquals(2, discountedBookList.size());
		assertEquals(540, discountedBookList.get(0).getPrice());
		assertEquals(405, discountedBookList.get(1).getPrice());
		
	}

}
