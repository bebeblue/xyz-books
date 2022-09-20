package com.xyz.books.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long authorId;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	private String middleNameOrInitial;

	@JsonBackReference
	@ManyToMany(mappedBy = "author")
	private Set<Book> book;

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleNameOrInitial() {
		return middleNameOrInitial;
	}

	public void setMiddleNameOrInitial(String middleNameOrInitial) {
		this.middleNameOrInitial = middleNameOrInitial;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}
	
	@Override
	public int hashCode() {
		return authorId.intValue();
	}
	
	@Override
	public boolean equals(Object obj) {
		Author author = null;
		if(obj instanceof Book) {
			author = (Author)(obj);
			return this.authorId == author.authorId;
		} 
		return false;
	}
	
}
