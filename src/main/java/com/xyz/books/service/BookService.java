package com.xyz.books.service;

import org.apache.commons.validator.routines.ISBNValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xyz.books.exception.IsbnInvalidException;
import com.xyz.books.model.Book;
import com.xyz.books.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book findBook(String isbn) {		
		if(ISBNValidator.getInstance().isValid(isbn)) {
			return bookRepository.findByIsbn13(isbn);
		}
		throw new IsbnInvalidException();
	}
	
	
}
