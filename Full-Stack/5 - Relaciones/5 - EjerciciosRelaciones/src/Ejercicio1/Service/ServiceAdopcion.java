package Ejercicio1.Service;

import java.util.*;

import Ejercicio1.Entity.*;

public class ServiceAdopcion {
	
	ArrayList<Persona> listaPersonas = new ArrayList<>();
	ArrayList<Perro> listaPerros = new ArrayList<>();
	
	Scanner leer = new Scanner(System.in);
	
	public void crearEntidades() {
		
		System.out.println("Ingrese cantidad total de personas (se crearán la misma cantidad de perros): ");
		int opc = leer.nextInt();
		leer.nextLine();
		
		for (int aux = 0 ; aux < opc ; aux++) {
			
			crearPersona();
						
		}
		
		for (int aux = 0 ; aux < opc ; aux++) {
			
			crearPerro();
			
		}
		
		mostrar();
		
	}
	
	public void crearPersona() {
		
		Persona persona = new Persona();
		
		System.out.println("Ingrese nombre y apellido de la persona separado por enter");
		persona.setNombre(leer.nextLine());
		persona.setApellido(leer.nextLine());
		
		System.out.println("Ingrese edad de la persona");
		persona.setEdad(leer.nextInt()); leer.nextLine();
		
		System.out.println("Ingrese dni (solo numeros)");
		persona.setDocumento(leer.nextLine());
		
		listaPersonas.add(persona);
		
	}
	
	public void crearPerro() {
		
		Perro perro = new Perro();
		
		System.out.println("Ingrese nombre del perro");
		perro.setNombre(leer.nextLine().toUpperCase());
		
		System.out.println("Ingrese edad del perro");
		perro.setEdad(leer.nextInt());leer.nextLine();
		
		System.out.println("Ingrese raza del perro");
		perro.setRaza(leer.nextLine().toUpperCase());
		
		int tamano = 0;
		do {
			System.out.println("Ingrese número de tamaño del perro (Pequeño = 1 / Mediano = 2 / Grande = 3)");
			tamano = leer.nextInt(); leer.nextLine();
			switch (tamano) {
				case 1: perro.setTamano("PEQUEÑO"); break;
				case 2: perro.setTamano("MEDIANO"); break;
				case 3: perro.setTamano("GRANDE"); break;
				default: System.out.println("Tamaño incorrecto. Intente nuevamente");
			}
		} while (tamano >= 4 || tamano <= 0);
		
		listaPerros.add(perro);
		
		asignarPerros(perro);
	}

	public void asignarPerros(Perro perro) {
		
		for (Persona persona : listaPersonas) {
				
			if (persona.getPerro() == null) {
				persona.setPerro(perro);
				break;
			} 
			
		}
		
	}
	
	public void mostrar() {
		
		for (Persona persona : listaPersonas){
			
			System.out.println(persona.toString());
			System.out.println("");
			
		}
		
	}
	
}
