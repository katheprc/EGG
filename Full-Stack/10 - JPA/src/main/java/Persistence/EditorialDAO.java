package Persistence;

import Entity.Editorial;
import Entity.Libro;

public final class EditorialDAO extends DAO<Editorial> {

	public void guardardao(Editorial editorial) {
		guardar(editorial);
	}
	
	
}
