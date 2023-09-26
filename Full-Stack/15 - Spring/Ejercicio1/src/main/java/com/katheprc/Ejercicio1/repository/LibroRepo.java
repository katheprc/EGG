package com.katheprc.Ejercicio1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.katheprc.Ejercicio1.entity.Libro;

@Repository
public interface LibroRepo extends JpaRepository<Libro, String> {

	@Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
	public Libro findByTitulo(@Param("titulo") String titulo);
	
	@Query("SELECT l FROM Libro l WHERE l.autor.nombre = :nombre")
	public List<Libro> findByAutor(@Param("nombre") String nombre);
	
	@Query("SELECT l FROM Libro l WHERE l.editorial.nombre = :nombre")
	public List<Libro> findByEditorial(@Param("nombre") String nombre);
	
}
