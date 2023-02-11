package com.hostmdy.basics_app.repository;

import org.springframework.data.repository.CrudRepository;

import com.hostmdy.basics_app.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long>{

}
