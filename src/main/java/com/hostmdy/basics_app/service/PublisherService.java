package com.hostmdy.basics_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hostmdy.basics_app.domain.Publisher;
import com.hostmdy.basics_app.repository.PublisherRepository;

@Service
public class PublisherService {
	
	private PublisherRepository publisherRepository;

	public PublisherService(PublisherRepository publisherRepository) {
		super();
		this.publisherRepository = publisherRepository;
	}
	
	public List<Publisher> getAllPublishers(){
		return (List<Publisher>) publisherRepository.findAll();
	}

}
