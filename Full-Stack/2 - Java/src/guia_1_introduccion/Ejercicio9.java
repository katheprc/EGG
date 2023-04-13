package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca una frase o palabra que comience con una A");
		
		String pof = leer.nextLine();
		
		if ((pof.substring(0, 1)).equals("A")) {
			System.out.println("CORRECTO");
		} else if ((pof.substring(0, 1)).equals("a")) {
			System.out.println("CORRECTO pero tenia que ser en mayuscula compiiii");
		} else {
			System.out.println("INCORRECTO");
		}
		
		
		
		
		leer.close();
		
		
	}
	
}
