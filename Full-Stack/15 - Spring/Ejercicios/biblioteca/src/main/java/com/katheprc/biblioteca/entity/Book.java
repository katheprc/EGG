package com.katheprc.biblioteca.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Book {

	@Id
	private Long isbn;
	
	private String title;
	
	private Integer total;
	
	@Temporal(TemporalType.DATE)
	private Date discharge;
	
	@ManyToOne
	Author author;
	
	@ManyToOne
	Publisher publisher;

	public Book() {
	}

	public Book(Long isbn, String title, Integer total, Date discharge, Author author, Publisher publisher) {
		this.isbn = isbn;
		this.title = title;
		this.total = total;
		this.discharge = discharge;
		this.author = author;
		this.publisher = publisher;
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Date getDischarge() {
		return discharge;
	}

	public void setDischarge(Date discharge) {
		this.discharge = discharge;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
}
