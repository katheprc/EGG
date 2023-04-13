package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca una frase o palabra de 8 caracteres de largo");
		
		String pof = leer.nextLine();
		
		if (pof.length() == 8) {
			
			System.out.println("CORRECTO");
		
		} else {
			System.out.println("IMCORRECTO");
		}
		
	}
	
}
