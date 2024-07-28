package com.aravind.junit.basics.test_doubles.mock;

public class BookService {
	
	
	private IBookRepository bookRepository;
	
	
	public BookService(IBookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}
	
	public  void addBook(Book book) {
		if(book.getPrice()>250) {
			bookRepository.addBook(book);
		}
	}

}
