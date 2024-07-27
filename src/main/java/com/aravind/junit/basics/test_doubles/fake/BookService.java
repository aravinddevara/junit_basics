package com.aravind.junit.basics.test_doubles.fake;

public class BookService {
	
	
	private IBookRepository bookRepository;
	
	
	public BookService(IBookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}
	
	public  void addBook(Book book) {
		bookRepository.addBook(book);
	}
	
	public  int findAllBooks(){
		return bookRepository.findAll().size();
	}

}
