package com.aravind.junit.basics.test_doubles.stub;

import java.util.Collection;
import java.util.List;

public interface IBookRepository {
	List<Book> getNewBooks(int days);

}
