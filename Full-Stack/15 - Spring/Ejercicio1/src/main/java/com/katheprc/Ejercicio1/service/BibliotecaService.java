package com.katheprc.Ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.katheprc.Ejercicio1.entity.Autor;
import com.katheprc.Ejercicio1.entity.Editorial;
import com.katheprc.Ejercicio1.entity.Libro;
import com.katheprc.Ejercicio1.repository.AutorRepo;
import com.katheprc.Ejercicio1.repository.EditorialRepo;
import com.katheprc.Ejercicio1.repository.LibroRepo;

@Service
public class BibliotecaService {

	@Autowired
	private LibroRepo libroRepo;
	
	@Autowired
	private AutorRepo autorRepo;
	
	@Autowired
	private EditorialRepo editorialRepo;
	
	//M E T O D O S -- L I B R O
	@Transactional
	public void crearLibro(Long isbn, String titulo, Integer ano, Integer ejemplares, String idAutor, String idEditorial) throws Exception {
		
		validate( isbn,  titulo,  ano,  ejemplares,  idAutor,  idEditorial);
		
		Autor autor = autorRepo.findById(idAutor).get();
		
		Editorial editorial = editorialRepo.findById(idEditorial).get();
		
		Libro libro = new Libro();
		
		libro.setIsbn(isbn);
		libro.setTitulo(titulo);
		libro.setEjemplares(ejemplares);
		libro.setAlta(true);
		libro.setEjemplaresRestantes(ejemplares);
		libro.setEjemplaresPrestados(0);
		libro.setAutor(autor);
		libro.setEditorial(editorial);
		
		libroRepo.save(libro);
		
	}
	
	@Transactional
	public void modificarLibro() {
		
		
		
	}
	
	
	
	
	// O T H E R -- M E T H O D S
	
	private void validate(Long isbn, String titulo, Integer ano, Integer ejemplares, String idAutor, String idEditorial) throws Exception{
		if(isbn == null || ano == null|| titulo.isEmpty() || titulo == null || idAutor.isEmpty() || idAutor == null || idEditorial.isEmpty() || idEditorial == null || ejemplares == null  ) {
			throw new Exception("The field can't be null");
		}
	}
	

	
}
