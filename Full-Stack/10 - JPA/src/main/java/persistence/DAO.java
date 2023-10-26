package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO<T> {

	protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("PU");
	protected EntityManager em = EMF.createEntityManager();

	protected void conectar() {
		if (!em.isOpen()) {
			em = EMF.createEntityManager();
		}
	}

	protected void desconectar() {
		if (em.isOpen()) {
			em.close();
		}
	}

	protected void guardar(T objeto) { // PERSIST
		conectar();
		em.getTransaction().begin();
		em.persist(objeto);
		em.getTransaction().commit();
		desconectar();
	}

	protected void editar(T objeto) { // MERGE
		conectar();
		em.getTransaction().begin();
		em.merge(objeto);
		em.getTransaction().commit();
		desconectar();
	}

	protected void eliminar(T objeto) { // REMOVE
		conectar();
		em.getTransaction().begin();
		em.remove(em.merge(objeto));
		em.getTransaction().commit();
		desconectar();
	}

}
