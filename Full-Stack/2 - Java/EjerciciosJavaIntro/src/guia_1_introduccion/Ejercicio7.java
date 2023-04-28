package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese la clave en minusculas");
		
		String palabra = leer.nextLine();
		
		if (palabra.equals("eureka")) {
			System.out.println("Correcto");
		}else {
			System.out.println("Incorrecto");
		}	
		
		
		leer.close();
		
	}
	
}
