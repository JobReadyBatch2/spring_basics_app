package com.hostmdy.basics_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hostmdy.basics_app.domain.Author;
import com.hostmdy.basics_app.repository.AuthorRepository;

@Service
public class AuthorService {
	
	private AuthorRepository authorRepository;

	public AuthorService(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}
	
	public List<Author> getAllAuthors(){
		return (List<Author>) authorRepository.findAll();
	}

}
