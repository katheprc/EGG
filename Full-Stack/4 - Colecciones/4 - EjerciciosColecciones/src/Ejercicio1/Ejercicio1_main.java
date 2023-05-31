/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/

package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1_main {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		
		ArrayList<String> razas = new ArrayList<String>();
		
		String opc = "s";

		do {

			System.out.println("Ingrese una raza de perro: ");
			razas.add(leer.nextLine());

			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("¿Continuar? (S/N)");
			opc = leer.nextLine();

			if (opc.equalsIgnoreCase("n")) {

				break;

			} else if (opc.equalsIgnoreCase("s")) {
				
				continue;
				
			} else {
				
				do {
					
					System.out.println("Ingrese una opcion correcta (S/N)");
					opc = leer.nextLine();
					
					if (opc.equalsIgnoreCase("n") || opc.equalsIgnoreCase("s")) {

						break;
					}
						
				} while (true);	
			}

		} while (opc.equalsIgnoreCase("s"));
		
		
		System.out.println("");System.out.println("");System.out.println("");
		
		System.out.println("Lista de razas: ");
		razas.forEach(System.out::println);  
				
		leer.close();
	}
		
}
