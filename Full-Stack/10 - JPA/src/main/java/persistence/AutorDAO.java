package persistence;

import modelEntities.Autor;

public final class AutorDAO extends DAO<Autor> {

	public void guardardao(Autor autor) {
		guardar(autor);
	}
	
	
}
