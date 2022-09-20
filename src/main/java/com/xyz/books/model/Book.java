package com.xyz.books.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.ISBN;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;
	@NotEmpty
	private String title;
	@NotEmpty
	@ISBN
	private String isbn13;
	@NotEmpty
	private Double price;
	@NotEmpty
	private String year;
	
	private String imageUrl;
	private String edition;
	
	@NotEmpty
	@ManyToOne
	@JoinColumn(name  = "publisher_id")
	private Publisher publisher;	
	
	@NotEmpty
	@JsonManagedReference
	@ManyToMany
	@JoinTable(name = "book_author", 
	joinColumns = @JoinColumn(name = "book_id"),
	inverseJoinColumns = @JoinColumn(name = "author_id"))
	private Set<Author> author;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	public Set<Author> getAuthor() {
		return author;
	}

	public void setAuthor(Set<Author> author) {
		this.author = author;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book book = null;
		if(obj instanceof Book) {
			book = (Book)(obj);
			return this.bookId == book.bookId;
		} 
		return false;
	}
	
	@Override
	public int hashCode() {
		return bookId.intValue();
	}
	
}
