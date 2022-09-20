package com.xyz.books.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long publisherId;
	@NotEmpty
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "publisher")
	private Set<Book> book;

	public Long getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}
	
	@Override
	public boolean equals(Object obj) {
		Publisher publisher = null;
		if(obj instanceof Book) {
			publisher = (Publisher)(obj);
			return this.publisherId == publisher.publisherId;
		} 
		return false;
	}
	
	@Override
	public int hashCode() {
		return publisherId.intValue();
	}
}
