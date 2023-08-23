package services;

import java.util.*;

import modelEntities.*;
import persistence.*;

public class ServiceLibro {

	Scanner leer = new Scanner(System.in);
	
	ServiceAutor srvAutor = new ServiceAutor();
	ServiceEditorial srvEditorial = new ServiceEditorial();
	
	HashMap<Long, Libro> listaLibros = new HashMap<>(); 
	
	LibroDAO libroDao = new LibroDAO();
	
	EditorialDAO ediDao = new EditorialDAO();
	
	AutorDAO autoDao = new AutorDAO();
	
	public void crearLibro() {
		
		
		System.out.println("Ingrese ISBN del libro: ");
		long isbn = leer.nextLong(); leer.nextLine();
		
		System.out.println("Ingrese el título del libro: ");
		String titulo = leer.nextLine();
		
		System.out.println("Ingrese el año del libro");
		int ano = leer.nextInt(); leer.nextLine();
		
		System.out.println("Ingrese la cantidad de ejemplares del libro");
		int ejemplares = leer.nextInt(); leer.nextLine();
		
		int ejemplaresPrestados = 0;
		
		int ejemplaresRestantes = ejemplares;
		
		boolean alta = true;
		
		System.out.println("Ingrese nombre del autor");
		String nombreAutor = leer.nextLine();
		Autor autor = new Autor(nombreAutor, true);
		autoDao.guardardao(autor);
		
		System.out.println("Ingrese nombre de editorial");
		String nombreEditorial = leer.nextLine();
		Editorial editorial = new Editorial(nombreEditorial, true);
		ediDao.guardardao(editorial);
		
		Libro libro = new Libro(isbn, titulo, ano, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor, editorial);
		
		listaLibros.put(isbn, libro);
		libroDao.guardardao(libro);
		
	}
	
	public void editarLibro() {
		
		
	}
	
	public void eliminarLibro() {
		
	}
	
}
