package Ejercicio2.Service;

import Ejercicio2.Entity.*;
import java.util.*;

public interface ServiceEdificios {

	ArrayList<Edificio> lista = new ArrayList<Edificio>();
	
	Scanner leer = new Scanner(System.in);
	
	public static void menu() {
		
		int opc;
		
		do {
			
			System.out.println("- - - - - M - E - N - U - - - - -");
			System.out.println("\n1 - Crear edificio de oficinas");
			System.out.println("2 - Crear polideportivo");
			System.out.println("3 - Ver Todo");
			System.out.println("0 - Salir \n");
			System.out.println("- - - - - - - - - - - - - - - - -");
			
			System.out.println("\nIngrese una opción. ");
			opc = leer.nextInt(); leer.nextLine();
			
			switch (opc) {
				case 1: 
					crearOficina();
					break;
				case 2:
					crearPoli();
					break;
				case 3:
					verTodo();
					break;
				default:
						System.out.println("\nIngrese opción nuevamente\n");
			
			}
			
			
		} while (opc != 0);
		
	}
	
	public static void crearOficina() {
				
		System.out.println("Ingrese alto del edificio: ");
		double alto = leer.nextDouble(); leer.nextLine();
	
		System.out.println("Ingrese ancho del edificio: ");
		double ancho = leer.nextDouble(); leer.nextLine();
		
		System.out.println("Ingrese largo del edificio: ");
		double largo = leer.nextDouble(); leer.nextLine();
				
		System.out.println("Ingrese cantidad de pisos");
		int numPisos = leer.nextInt(); leer.nextLine();
		
		System.out.println("Ingrese cantidad de oficinas");
		int cantOficinas = leer.nextInt(); leer.nextLine();
		
		System.out.println("Ingrese cantidad de personas por oficina: ");
		int cantPersonas = leer.nextInt(); leer.nextLine();
		
		Edificio oficina = new EdificioDeOficinas(alto, ancho, largo, cantOficinas, cantPersonas, numPisos);
				
		lista.add(oficina);
		
	}
		
	public static void crearPoli() {
		
		System.out.println("Ingrese alto del edificio: ");
		double alto = leer.nextDouble(); leer.nextLine();
	
		System.out.println("Ingrese ancho del edificio: ");
		double ancho = leer.nextDouble(); leer.nextLine();
		
		System.out.println("Ingrese largo del edificio: ");
		double largo = leer.nextDouble(); leer.nextLine();
				
		System.out.println("Ingrese nombre del edificio");
		String nombre = leer.nextLine();
		String sn;
		do {
			System.out.println("¿Es techado? S/N");
			sn = leer.nextLine().substring(0);
		} while (!sn.equalsIgnoreCase("S") && !sn.equalsIgnoreCase("N") );
		
		Edificio poli;
		
		if (sn.equalsIgnoreCase("S")) {
			poli = new Polideportivo(alto, ancho, largo, nombre, true);
		} else {
			poli = new Polideportivo(alto, ancho, largo, nombre, false);
		}
						
		lista.add(poli);
		
	}
	
	public static void verTodo() {
		
		for (Edificio edificio : lista) {
			
			if (edificio instanceof Polideportivo) {
				((Polideportivo) edificio).toStringg();
			} else {
				((EdificioDeOficinas)edificio).toStringg();
			}
			
		}
		
	}
	
}
