package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el largo del lado del cuadrado: ");
		
		int lado = leer.nextInt();
		
		for (int aux = 1; aux <= lado; aux++) {
			for (int aux2 = 1; aux2 <= lado; aux2++) {
				if (aux > 1 && aux < lado && aux2 > 1 && aux2 < lado) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println(" ");
			
		}
		
	}
}


