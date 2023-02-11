package com.hostmdy.basics_app.domain;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String genre;
	
	@ManyToMany
	@JoinTable(name = "Book_Author",joinColumns = @JoinColumn(name = "bookId")
	,inverseJoinColumns = @JoinColumn(name = "authorId") )
	private Set<Author> authors = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name = "publisherId"/*,updatable = false*/)
	private Publisher publisher;
	
	public Book() {}
	
	public Book(String title, String genre) {
		super();
		this.title = title;
		this.genre = genre;
	}
	public Book(Long id, String title, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
	}
	
	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", genre=" + genre + "]";
	}
	
}
