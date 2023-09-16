package com.katheprc.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.katheprc.biblioteca.entity.Publisher;

@Repository
public interface PublisherRepo extends JpaRepository<Publisher, String>{

	
	
}
