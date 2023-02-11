package com.hostmdy.basics_app.controller;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hostmdy.basics_app.domain.Author;
import com.hostmdy.basics_app.domain.Book;
import com.hostmdy.basics_app.service.AuthorService;
import com.hostmdy.basics_app.service.BookService;

@Controller
public class AuthorController {
	
	private final AuthorService authorService;
	
	public AuthorController(AuthorService authorService) {
		super();
		this.authorService = authorService;
	}

	@GetMapping("/authors")
	public String showAuthorList(Model model) {
		List<Author> authors = authorService.getAllAuthors();
		
		model.addAttribute("authors",authors);
		
//		return "book-list";
		return "author-list";
		
	}
}
