package com.katheprc.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.katheprc.biblioteca.entity.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, String>{

	
	
}
