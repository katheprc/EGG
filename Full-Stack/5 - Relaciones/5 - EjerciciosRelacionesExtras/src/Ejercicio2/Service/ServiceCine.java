package Ejercicio2.Service;

import Ejercicio2.Entity.*;
import java.util.*;

public class ServiceCine {

	Scanner leer = new Scanner(System.in);
	
	Cine cine = new Cine();
		
	public void menu() {
		
		int opc;
		
		do {
			
			System.out.println("- - - - - M - E - N - U - - - - -");
			System.out.println("");
			System.out.println("1 - Ver todas las peliculas");
			System.out.println("2 - Ver todas las salas");
			System.out.println("3 - Ingresar espectador y asignar asiento");
			System.out.println("0 - Salir");
			System.out.println("");
			System.out.println("- - - - - - - - - - - - - - - - -");
			
			System.out.println("");
			System.out.println("");
			
			System.out.println("Ingrese su opción: ");
			opc = leer.nextInt(); leer.nextLine();
			
			switch(opc) {
			
				case 1: cine.verListaPelis(); break;
				case 2: cine.verSalas(); break;
				case 3: cine.ingresarPersona(); break;
				default: System.out.println("Opción incorrecta. Intente nuevamente");
			
			}
			
		} while (opc != 0);

	}
	

	
}
