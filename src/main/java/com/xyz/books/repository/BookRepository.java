package com.xyz.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.xyz.books.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	Book findByIsbn13(String isbn13);

}
