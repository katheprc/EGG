package com.katheprc.biblioteca.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.katheprc.biblioteca.entity.Author;
import com.katheprc.biblioteca.entity.Book;
import com.katheprc.biblioteca.entity.Publisher;
import com.katheprc.biblioteca.repository.AuthorRepo;
import com.katheprc.biblioteca.repository.BookRepo;
import com.katheprc.biblioteca.repository.PublisherRepo;

@Service
public class LibraryService {

	@Autowired
	private BookRepo bookRepo;
	
	@Autowired
	private AuthorRepo authorRepo;
	
	@Autowired
	private PublisherRepo pubRepo;
	
	@Transactional
	public void createBook(Long isbn, String title, Integer total, String idAuthor, String idPublisher) {
		
		Author author = authorRepo.findById(idAuthor).get();

		Publisher publisher = pubRepo.findById(idPublisher).get();
		
		Book book = new Book();
		
		book.setIsbn(isbn);
		book.setTitle(title);
		book.setTotal(total);
		
		book.setDischarge(new Date());
		
		book.setAuthor(author);
		
		book.setPublisher(publisher);
		
		bookRepo.save(book);
	}
	
	public List<Book> listBooks(){
		
		List<Book> books = new ArrayList<>();
		
		books = bookRepo.findAll();
		
		return books;
	}
	
	
	
	
	
	
	
	// A U T H O R -- M E T H O D S
	public void createAuthor(String name) {
		
		Author author = new Author();
		
		author.setName(name);
		
		authorRepo.save(author);
		
	}
	
	public void createPublisher(String name) {
		
		Publisher publisher = new Publisher();
		
		publisher.setName(name);
		
		pubRepo.save(publisher);
		
	}
	
}
