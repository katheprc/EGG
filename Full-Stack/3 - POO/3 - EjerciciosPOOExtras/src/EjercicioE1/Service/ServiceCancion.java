package EjercicioE1.Service;

import EjercicioE1.Entity.Cancion;
import java.util.Scanner;


public class ServiceCancion {
	
	Scanner leer = new Scanner(System.in);
	
	public void crearCancion(Cancion cancion) {
		
		System.out.println("Ingresar titulo de la cancion: ");
		cancion.setTitulo(leer.nextLine());
		
		System.out.println("Ingrese autor de " + cancion.getTitulo());
		cancion.setAutor(leer.nextLine());
		
		mostrarCancion(cancion);
		
	}
	
	public void mostrarCancion (Cancion cancion) {
		
		System.out.println(" ");
		System.out.println("Cancion " + cancion.getTitulo());
		System.out.println("Autor: " + cancion.getAutor());
		
	}
	
}
