/* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada. */

package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2_main {

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
		
		System.out.println("");System.out.println("");System.out.println("");
		System.out.println("Ingrese una raza: ");
	
		String buscar = leer.nextLine();
		int encontrado = 0;
		
		Iterator<String> ite = razas.iterator();
		
		while (ite.hasNext()) {
			if (ite.next().equals(buscar)) {
				ite.remove();
				encontrado = 1;
			} 
		}
		
		if (encontrado == 1) {
			System.out.println("Raza encontrada y eliminada");
			Collections.sort(razas);
		} else {
			System.out.println("Raza NO encontrada :(");
			Collections.sort(razas);
		}
				
		System.out.println("");System.out.println("");System.out.println("");
		System.out.println("Lista de razas ordenada: ");
		razas.forEach(System.out::println);
		
		leer.close();
		
	}
		
}
