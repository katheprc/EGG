package com.katheprc.biblioteca.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.katheprc.biblioteca.entity.Author;
import com.katheprc.biblioteca.entity.Book;
import com.katheprc.biblioteca.entity.Publisher;
import com.katheprc.biblioteca.exceptions.MyException;
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
	
	
	// B O O K -- M E T H O D S
	@Transactional
	public void createBook(Long isbn, String title, Integer total, String idAuthor, String idPublisher) throws MyException {
		
		validate(isbn, title, idAuthor, idPublisher, total);
		
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
	
	@Transactional
	public void modifyBook(Long isbn, String title, String idAuthor, String idPublisher, Integer total) throws MyException{
		
		validate(isbn, title, idAuthor, idPublisher, total);
		
		Optional<Book> responseBook = bookRepo.findById(isbn);
		Optional<Author> responseAuthor = authorRepo.findById(idAuthor);
		Optional<Publisher> responsePub = pubRepo.findById(idPublisher);
		
		Author author = new Author();
		Publisher publisher = new Publisher();
		
		if(responseAuthor.isPresent()) {
			
			author = responseAuthor.get();
			
		}
		
		if(responsePub.isPresent()) {
			
			publisher = responsePub.get();
			
		}
		
		if(responseBook.isPresent()) {
			
			Book book = responseBook.get();
			
			book.setTitle(title);
			
			book.setTotal(total);
			
			book.setAuthor(author);
			
			book.setPublisher(publisher);
			
			bookRepo.save(book);
			
		}
	}
	
	
	// A U T H O R -- M E T H O D S
	@Transactional
	public void createAuthor(String name) throws MyException {
		
		Author author = new Author();
		
		author.setName(name);
		
		authorRepo.save(author);
		
	}
	
	@Transactional
	public void modifyAuthor(String name, String id) {
		
		Optional<Author> responseAuthor = authorRepo.findById(id);
		
		if(responseAuthor.isPresent()) {
			
			Author author = new Author();			
			
			author.setName(name);
						
			authorRepo.save(author);
			
		}
		
	}
	
	
	// P U B L I S H E R -- M E T H O D S
	@Transactional
	public void createPublisher(String name) {
		
		Publisher publisher = new Publisher();
		
		publisher.setName(name);
		
		pubRepo.save(publisher);
		
	}
	
	@Transactional
	public void modifyPublisher(String name, String id) {
		
		Optional<Publisher> responsePub = pubRepo.findById(id);
		
		if(responsePub.isPresent()) {
			
			Publisher publisher = new Publisher();
			
			publisher.setName(name);
						
			pubRepo.save(publisher);
			
		}
		
	}
	
	// O T H E R -- M E T H O D S
	public List<Book> listBooks(){
		
		List<Book> books = new ArrayList<>();
		
		books = bookRepo.findAll();
		
		return books;
		
	}
	
	public List<Author> listAuthor(){
		
		List<Author> authors = new ArrayList<>();
		
		authors = authorRepo.findAll();
		
		return authors;
		
	}
	
	public List<Publisher> listPublisher(){
		
		List<Publisher> publishers = new ArrayList<>();
		
		publishers = pubRepo.findAll();
		
		return publishers;
		
	}

	private void validate(Long isbn, String title, String idAuthor, String idPublisher, Integer total) throws MyException{
		if(isbn == null || title.isEmpty() || title == null || idAuthor.isEmpty() || idAuthor == null || idPublisher.isEmpty() || idPublisher == null || total == null  ) {
			throw new MyException("The field can't be null");
		}
	}
	
}
