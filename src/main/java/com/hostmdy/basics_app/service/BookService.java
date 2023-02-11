package com.hostmdy.basics_app.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.hostmdy.basics_app.domain.Book;
import com.hostmdy.basics_app.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	public List<Book> getAllBooks(){
		return (List<Book>) bookRepository.findAll();
	}

}
