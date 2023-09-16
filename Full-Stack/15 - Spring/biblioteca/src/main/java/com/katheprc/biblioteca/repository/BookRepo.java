package com.katheprc.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.katheprc.biblioteca.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>{
	
	@Query("SELECT l FROM Book l WHERE l.title = :title")
	public Book findByTitle(@Param("title") String title);
	
	@Query("SELECT l FROM Book l WHERE l.author.name = :name")
	public List<Book> findByAuthor(@Param("name") String name);
}
