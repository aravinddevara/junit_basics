package com.aravind.junit.basics.test_doubles.dummy;

public class BookService {
	
	
	private IBookRepository bookRepository;
	private IEmailService emailService;
	
	
	public BookService(IBookRepository bookRepository,IEmailService emailService) {
		this.bookRepository=bookRepository;
		this.emailService=emailService;
	}
	
	public  void addBook(Book book) {
		bookRepository.addBook(book);
	}
	
	public  int findAllBooks(){
		return bookRepository.findAll().size();
	}

	public IEmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(IEmailService emailService) {
		this.emailService = emailService;
	}

}
