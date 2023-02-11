package com.hostmdy.basics_app.controller;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hostmdy.basics_app.domain.Book;
import com.hostmdy.basics_app.domain.Publisher;
import com.hostmdy.basics_app.service.BookService;
import com.hostmdy.basics_app.service.PublisherService;

@Controller
public class PublisherController {
	
	private final PublisherService publisherService;
	
	public PublisherController(PublisherService publisherService) {
		super();
		this.publisherService = publisherService;
	}

	@RequestMapping("/publishers")
	public String showbookList(Model model) {
		List<Publisher> publishers = publisherService.getAllPublishers();
		
		model.addAttribute("publishers",publishers);
		
//		return "book-list";
		return "publisher-list";
		
	}
}
