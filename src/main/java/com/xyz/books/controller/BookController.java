package com.xyz.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xyz.books.exception.IsbnNotFoundException;
import com.xyz.books.model.Book;
import com.xyz.books.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/book/{isbn13}")
	public Book findBook(@PathVariable String isbn13) {
		Book book = bookService.findBook(isbn13);
		if(book == null) 
			throw new IsbnNotFoundException();
		return book;
	}

}
