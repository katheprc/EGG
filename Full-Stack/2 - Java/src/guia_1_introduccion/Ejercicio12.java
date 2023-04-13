package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("RS232. INGRESE UNA CADENA DE 5 CARAACTERES:");
		
		String cad = leer.nextLine();
		
		int corr = 0;
		int incorr = 0;
		
		while (true) {
			if (cad.length() == 5) {
				
				if ((cad.substring(0, 1).equals("X")) && cad.substring(4, 5).equals("O")) {
					corr = corr + 1;
				} else if (cad.equals("&&&&&")) {
					break;
				} else {
					incorr = incorr + 1;
				}
				
			} else {
				System.out.println("La cadena debe ser de 5 caracteres!");
				incorr = incorr + 1;
			} 
			
			System.out.println("RS232. INGRESE OTRA CADENA DE 5 CARACTERES:");
			cad = leer.nextLine();
		}
		
		System.out.println("LECTURAS CORRECTAS: " + corr);
		System.out.println("LECTURAS INCORRECTAS: " + incorr);
		
		
		
	}

	
}