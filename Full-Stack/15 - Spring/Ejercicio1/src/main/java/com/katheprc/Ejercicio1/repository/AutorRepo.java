package com.katheprc.Ejercicio1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.katheprc.Ejercicio1.entity.Autor;

@Repository
public interface AutorRepo extends JpaRepository<Autor, String> {
	
}