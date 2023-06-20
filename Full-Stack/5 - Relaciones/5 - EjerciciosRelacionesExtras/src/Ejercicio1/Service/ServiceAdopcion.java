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

		for (int aux = 0; aux < opc; aux++) {

			crearPersona();

		}

		for (int aux = 0; aux < opc; aux++) {

			crearPerro();

		}
		String opc2;

		do {
			boolean encontrado = false;

			System.out.println("Indique el DNI de la persona que desea adoptar un perro");
			String dni = leer.nextLine();
			for (Persona persona : listaPersonas) {
				if (persona.getDocumento().equals(dni)) {
					asignarPerros(persona);
					encontrado = true;
				}
			}

			if (encontrado == false) {
				System.out.println("No se encontró a la persona con el dni especificado");
			}

			do {
				System.out.println("¿Continuar? S/N");
				opc2 = leer.nextLine().toUpperCase();
				if (opc2.equals("S") || opc2.equals("N")) {
					break;
				} else {
					System.out.println("Opción incorrecta. Intente nuevamente");
				}
			} while (true);

		} while (opc2.equals("S"));

		mostrar();

	}

	public void crearPersona() {

		Persona persona = new Persona();

		System.out.println("Ingrese nombre y apellido de la persona separado por enter");
		persona.setNombre(leer.nextLine().toUpperCase());
		persona.setApellido(leer.nextLine().toUpperCase());

		System.out.println("Ingrese edad de la persona");
		persona.setEdad(leer.nextInt());
		leer.nextLine();

		System.out.println("Ingrese dni (solo numeros)");
		persona.setDocumento(leer.nextLine());

		listaPersonas.add(persona);

	}

	public void crearPerro() {

		Perro perro = new Perro();

		System.out.println("Ingrese nombre del perro");
		perro.setNombre(leer.nextLine().toUpperCase());

		System.out.println("Ingrese edad del perro");
		perro.setEdad(leer.nextInt());
		leer.nextLine();

		System.out.println("Ingrese raza del perro");
		perro.setRaza(leer.nextLine().toUpperCase());

		int tamano = 0;
		do {
			System.out.println("Ingrese número de tamaño del perro (Pequeño = 1 / Mediano = 2 / Grande = 3)");
			tamano = leer.nextInt();
			leer.nextLine();
			switch (tamano) {
			case 1:
				perro.setTamano("PEQUEÑO");
				break;
			case 2:
				perro.setTamano("MEDIANO");
				break;
			case 3:
				perro.setTamano("GRANDE");
				break;
			default:
				System.out.println("Tamaño incorrecto. Intente nuevamente");
			}
		} while (tamano >= 4 || tamano <= 0);

		listaPerros.add(perro);
	}

	public void asignarPerros(Persona persona) {

		boolean encontrado = false;

		if (persona.getPerro() == null) {
			do {
				System.out.println("Los perros disponibles son: ");

				for (Perro perro : listaPerros) {
					System.out.println(perro.toString());
				}

				System.out.println("Indique el nombre de un perro para adoptar");
				String nombre = leer.nextLine();
				for (Perro perro : listaPerros) {
					if (perro.getNombre().equals(nombre)) {
						persona.setPerro(perro);
						encontrado = true;
						listaPerros.remove(perro);
						System.out.println("Perrito adoptado <3<3<3");
						break;
					}
				}

				if (encontrado == false) {
					System.out.println("Perro no existente o ya adoptado");
				} else {
					break;
				}

			} while (true);

		} else {
			System.out.println("Usted ya ha adoptado un perro.");
		}

	}

	public void mostrar() {

		for (Persona persona : listaPersonas) {

			System.out.println(persona.toString());
			System.out.println("");

		}

		if (listaPerros != null) {
			System.out.println("Perritos no adoptados :(");
			for (Perro perro : listaPerros) {
				System.out.println(perro.toString());
				System.out.println("");
			}
		}

	}

}
