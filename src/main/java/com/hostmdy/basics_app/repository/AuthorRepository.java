package com.hostmdy.basics_app.repository;

import org.springframework.data.repository.CrudRepository;

import com.hostmdy.basics_app.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long>{
	
}
