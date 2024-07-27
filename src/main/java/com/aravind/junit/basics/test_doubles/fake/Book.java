package com.aravind.junit.basics.test_doubles.fake;

import java.time.LocalDate;

public class Book {
	private String bookId;
	private String title;
	private int price;
	private LocalDate published;
	public Book(String bookId, String title, int price, LocalDate published) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.published = published;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getPublished() {
		return published;
	}
	public void setPublished(LocalDate published) {
		this.published = published;
	}
}
