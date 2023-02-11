package com.hostmdy.basics_app.controller;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hostmdy.basics_app.domain.Book;
import com.hostmdy.basics_app.service.BookService;

@Controller
public class BookController {
	
	private final BookService bookService;
	
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@RequestMapping("/books")
	public String showbookList(Model model) {
		List<Book> books = bookService.getAllBooks();
		
		model.addAttribute("books",books);
		
//		return "book-list";
		return "book/book-list";
		
	}
}
