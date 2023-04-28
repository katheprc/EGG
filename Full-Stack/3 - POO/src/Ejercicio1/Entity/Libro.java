package Ejercicio1.Entity;

import java.util.Scanner;

public class Libro {
	String ISBN, Titulo, Autor, Pags;
	
	Scanner leer = new Scanner (System.in);
	
	//Métodos
	public void cargarLibro() {
		System.out.println("Ingrese el título del libro: ");
		this.Titulo = leer.nextLine();
		System.out.println("Ingrese el ISBN del libro: ");
		this.ISBN = leer.nextLine();
		System.out.println("Ingrese el Autor del libro: ");
		this.Autor = leer.nextLine();
		System.out.println("Ingrese la cantidad de páginas del libro: ");
		this.Pags = leer.nextLine();
		
	}
	
	public void informe() {
		System.out.print(this.Titulo + " | " + this.ISBN + " | " + this.Pags+ " | " + this.Autor);
	}
	
	//Constructores
    public Libro(String ISBN, String Titulo, String Autor, String Pags) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Pags = Pags;
    }
    
    public Libro() {
    }
    	
}
