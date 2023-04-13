package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");

		String nombre = leer.next();
		System.out.println("Su nombre es: " + nombre);

	}

}