/* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. */

package Ejercicio1;

import Ejercicio1.Entity.Libro;

public class Ejercicio1_main {

	public static void main(String[] args) {
		Libro libro1 = new Libro();
		
		System.out.println("Cargar libro: ");
		libro1.cargarLibro();
		
		System.out.println("Mostrar libro: ");
		libro1.informe();

	}

}
