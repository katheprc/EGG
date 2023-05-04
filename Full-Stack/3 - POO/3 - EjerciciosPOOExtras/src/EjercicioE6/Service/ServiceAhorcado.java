package EjercicioE6.Service;

import EjercicioE6.Entity.*;
import java.util.Scanner;

public class ServiceAhorcado {

	Scanner leer = new Scanner(System.in);

	public void Juego(Ahorcado ahorcado) {

		int longi = crearJuego(ahorcado);
		String[] palabra = new String[longi];
		longitud(ahorcado);
		buscar(ahorcado, palabra, longi);

	}

	public int crearJuego(Ahorcado ahorcado) {

		System.out.println("Ingrese palabra secreta. Si es mas de una palabra, separarlas por espacio");
		String palabra = leer.nextLine();

		for (int aux = 0; aux < 50; aux++) {

			System.out.println("");

		}

		int longitud = palabra.length();

		for (int aux = 1; aux <= longitud; aux++) {

			ahorcado.setAhorcado(palabra.substring(aux - 1, aux), aux - 1);

			if (aux == longitud) {

				for (int aux2 = longitud; aux2 < 50; aux2++) {

					ahorcado.setAhorcado("aaa", aux2);

				}
			}

		}

		System.out.println("Ingrese cantidad de jugadas maximas: ");
		ahorcado.setCantMax(leer.nextInt());
		leer.nextLine();
		ahorcado.setCantJugadas(ahorcado.getCantMax());

		return palabra.length();

	}

	public void longitud(Ahorcado ahorcado) {

		int cont = 0, contPalabras = 1;

		String sub;

		for (int aux = 0; aux < 50; aux++) {
			sub = ahorcado.getAhorcado(aux);
			if (sub != "aaa") {

				if (sub.equals(" ")) {
					System.out.print("  ");
					contPalabras++;
				} else {
					System.out.print("_ ");
					cont++;
				}

			}

		}

		System.out.print("(" + cont + "), " + contPalabras + " palabras.");
		System.out.println("");

	}

	public void buscar(Ahorcado ahorcado, String[] palabra, int longi) {

		System.out.println("");
		System.out.println("");
		System.out.println("");
		boolean encontrado = false;
		int encontrado2 = 0;
		String letra, sub, buscadas = " ";
		
		do {
			boolean ganaste = true;
			
			System.out.println("Ingrese letra a buscar: ");
			letra = leer.nextLine();
			
			encontrado = false;
			encontrado2 = 0;

			if (letra.length() != 1) {

				do {
					System.out.println("");
					System.out.println("");
					System.out.println("Ingrese solo una letra");
					letra = leer.nextLine();

				} while (letra.length() != 1);

			} else {
				buscadas = buscadas.concat(letra + " - ");
			}		

			for (int aux = 0; aux < 50; aux++) {
				sub = ahorcado.getAhorcado(aux);

				if (sub.contains(" ")) {
					palabra[aux] = sub;
				}

				if (sub.equalsIgnoreCase(letra)) {
					if (longi >= aux) {
						palabra[aux] = letra;
					}
					encontrado = true;
					encontrado2++;
				} 
			}
			
			if (encontrado) {
				System.out.println("");
				System.out.println("");
				System.out.println(letra + " encontrada " + encontrado2 + " veces");
			} else {
				System.out.println("");
				System.out.println("");
				System.out.println(letra + " no encontrada :(");
				intentos(ahorcado);
			}
			
			System.out.println("Letras buscadas:" + buscadas);
			System.out.println("");
			System.out.println("");

			for (int aux = 0; aux < longi; aux++) {
				sub = ahorcado.getAhorcado(aux);

				if (palabra[aux] != null) {
					System.out.print(palabra[aux] + " ");
				} else {
					System.out.print("_ ");
				}
			}
			System.out.println("");
			System.out.println("");
			
			for (int aux = 0; aux < longi; aux++) {
				sub = ahorcado.getAhorcado(aux);
				if (palabra[aux] == null) {
					ganaste = false;
				
				}
			}
			
			if (ganaste) {
				
				System.out.println("FELICITACIONES! GANASTE EL JUEGO");
				break;
			}
			
			if (ahorcado.getCantJugadas() == 0) {
				System.out.println("PERDISTE :(. Te quedaste sin intentos");
			}
			
			System.out.println("---------------------------------------------");
			
		} while (ahorcado.getCantJugadas() != 0);
	}

	public void intentos(Ahorcado ahorcado) {

		ahorcado.setCantJugadas(ahorcado.getCantJugadas() - 1);
		System.out.print("Le quedan " + ahorcado.getCantJugadas() + " intentos.");
		System.out.println("");
		System.out.println("");
	}
	
}
