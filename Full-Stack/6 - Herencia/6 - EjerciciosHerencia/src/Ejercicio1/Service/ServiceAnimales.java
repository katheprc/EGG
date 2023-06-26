package Ejercicio1.Service;

import java.util.*;
import Ejercicio1.Entity.*;

public class ServiceAnimales {

	Scanner leer = new Scanner(System.in);

	ArrayList<Animal> listaAnimales = new ArrayList<>();

	public void menu() {

		int opc;

		do {

			System.out.println("- - - M - E - N - U - - -");
			System.out.println("");
			System.out.println("1 - Crear animales");
			System.out.println("2 - Ver animales");
			System.out.println("3 - Eliminar animal");
			System.out.println("4 - Alimentar a todos");
			System.out.println("0 - Salir");
			System.out.println("");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("Ingrese su opción");
			System.out.println("");

			opc = leer.nextInt(); leer.nextLine();

			switch (opc) {
			
				case 1:  crearAnimales(); break;
				case 2:  verAnimales(); break;
				case 3:  eliminarAnimal(); break;
				case 4:  alimentarse(); break;
				case 0:  break;
				default: System.out.println("Opción incorrecta :( intente nuevamente"); break;
					
			}

		} while (opc != 0);

	}

	public void crearAnimales() {

		int opc;
		
		do {
			
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("1 - Perro");
			System.out.println("2 - Gato");
			System.out.println("3 - Caballo");
			System.out.println("0 - Salir");
			System.out.println("");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("Ingrese su opción");
			System.out.println("");

			opc = leer.nextInt(); leer.nextLine();

			switch (opc) {
			
				case 1:  Perro perro = new Perro(); perro = (Perro) ingresarDatos(perro); listaAnimales.add(perro); break;
				case 2:	 Gato gato = new Gato(); gato = (Gato) ingresarDatos(gato); listaAnimales.add(gato); break;
				case 3:  Caballo caballo = new Caballo(); caballo = (Caballo) ingresarDatos(caballo); listaAnimales.add(caballo); break;
				case 0:  break;
				default: System.out.println("Opción incorrecta");
				
			}
			
		} while (opc != 0);

	}

	public Animal ingresarDatos(Animal animal) {

		System.out.println("Ingrese nombre");
		animal.setNombre(leer.nextLine());

		System.out.println("Ingrese raza");
		animal.setRaza(leer.nextLine());

		System.out.println("Ingrese edad en meses");
		animal.setEdad(leer.nextInt());
		leer.nextLine();

		System.out.println("Ingrese qué alimento consume");
		animal.setAlimento(leer.nextLine());

		return animal;

	}
	
	public void verAnimales() {
		
		for (Animal animal : listaAnimales) {
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println("Tipo: " + animal.getClass().getSimpleName() + " || Nombre: " + animal.getNombre() + " || Edad: " + animal.getEdad() + " meses || Raza: " + animal.getRaza() + " || Alimento: " + animal.getAlimento());
		}
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("");
		System.out.println("");
	}
	
	public void eliminarAnimal() {
		
		System.out.println("Ingrese el tipo de animal que desea eliminar");
		String tipo = leer.nextLine();
		
		System.out.println("Ingrese el nombre del animal que desea eliminar");
		String nombre = leer.nextLine();
		
		boolean encontrado = false;
		
		for (Animal animal : listaAnimales) {
			
			if (animal.getNombre().equalsIgnoreCase(nombre) && animal.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
				
				listaAnimales.remove(animal);
				System.out.println("Animal eliminado :(");
				encontrado = true;
				break;
				
			}
			
		}
		
		if (encontrado == false) {
			System.out.println("Animal no encontrado :(");
		}
		
	}
	
	public void alimentarse() {
		System.out.println("Animales alimentados con éxito!");
	}
	
}
