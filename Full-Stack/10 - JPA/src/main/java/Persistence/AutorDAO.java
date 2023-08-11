package Persistence;

import Entity.Autor;
import Entity.Libro;

public final class AutorDAO extends DAO<Autor> {

	public void guardardao(Autor autor) {
		guardar(autor);
	}
	
	
}
