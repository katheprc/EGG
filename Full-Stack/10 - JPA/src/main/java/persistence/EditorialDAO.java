package persistence;

import modelEntities.Editorial;

public final class EditorialDAO extends DAO<Editorial> {

	public void guardardao(Editorial editorial) {
		guardar(editorial);
	}
	
	
}
