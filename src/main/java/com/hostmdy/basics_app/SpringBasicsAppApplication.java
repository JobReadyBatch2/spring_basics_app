package com.hostmdy.basics_app;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hostmdy.basics_app.domain.Author;
import com.hostmdy.basics_app.domain.Book;
import com.hostmdy.basics_app.domain.Publisher;
import com.hostmdy.basics_app.repository.AuthorRepository;
import com.hostmdy.basics_app.repository.BookRepository;
import com.hostmdy.basics_app.repository.PublisherRepository;

@SpringBootApplication
public class SpringBasicsAppApplication implements CommandLineRunner{
	
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;

	public SpringBasicsAppApplication(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicsAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Author author1 = new Author("Eric","Evan","eric@gmail.com");
		Book book1 = new Book("DomainDrivenDesign","IT");
		
		//ManytoMany Connect
		author1.getBooks().add(book1);
		book1.getAuthors().add(author1);
		
		authorRepository.save(author1);
		
		
		Author author2 = new Author("Lin","TheikNyunt","theik@gmail.com");
		Book book2 = new Book("SeeYouAtTheTop","Motivation");
		
		//ManytoMany Connect
		author2.getBooks().add(book2);
		book2.getAuthors().add(author2);
		
		authorRepository.save(author2);
		
		
		Author author3 = new Author("PhyoPhyo","Wei","wei@gmail.com");
		Book book3 = new Book("SatLapHtuSit2022","Motivation");
		
		//ManytoMany Connect
		author3.getBooks().add(book3);
		book3.getAuthors().add(author3);
		
		authorRepository.save(author3);
		
		
		
		//publisher - book
		Publisher publisher1 = new Publisher("FutureIT","No 7,NewYork","+1 234 567 890");
		Publisher publisher2 = new Publisher("KyiPwarYay","No 6,Yangon","+95 9952627273");
		
		publisher1.getBooks().add(book1);
		book1.setPublisher(publisher1);
		
		Set<Book> kBooks = new HashSet<>();
		kBooks.add(book2);
		kBooks.add(book3);
		
		publisher2.setBooks(kBooks);
		book2.setPublisher(publisher2);
		book3.setPublisher(publisher2);
		
		publisherRepository.save(publisher1);
		publisherRepository.save(publisher2);
		
		bookRepository.save(book1);
		bookRepository.save(book2);
		bookRepository.save(book3);
		
	}

}
