package com.aravind.junit.basics.test_doubles.stub;

import java.util.List;

public class BookService {
	
	
	private IBookRepository bookRepository;
	
	public BookService(IBookRepository bookRepository) {
		this.bookRepository=bookRepository;
		
	}
	
	public List<Book> getNewBooksWithAppliedDiscount(int discount,int days){
		List<Book> bookList=bookRepository.getNewBooks(days);
		
		for(Book book:bookList) {
			int price=book.getPrice();
			int newPrice=price-(discount*price/100);
			book.setPrice(newPrice);
		}
		return bookList;		
	}
	
	

}
