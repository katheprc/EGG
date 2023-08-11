package Persistence;

import Entity.Libro;

public final class LibroDAO extends DAO<Libro> {
		
	public void guardardao(Libro libro) {
		guardar(libro);
	}
	
	
}
