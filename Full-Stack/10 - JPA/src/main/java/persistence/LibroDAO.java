package persistence;

import modelEntities.Libro;

public final class LibroDAO extends DAO<Libro> {
		
	public void guardardao(Libro libro) {
		guardar(libro);
	}
	
	
}
