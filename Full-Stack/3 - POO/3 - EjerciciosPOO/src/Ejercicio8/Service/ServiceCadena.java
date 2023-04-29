package Ejercicio8.Service;

import Ejercicio8.Entity.Cadena;
import java.util.Scanner;

public class ServiceCadena {

	Scanner leer = new Scanner(System.in);

	public void crearFrase(Cadena cadena) {

		System.out.println("Ingrese frase: ");
		cadena.setFrase(leer.nextLine());
		cadena.setLongitud(cadena.getFrase().length());
		System.out.println("");
		
		mostrarVocales(cadena);
		System.out.println("Cantidad de vocales: " + cadena.getVocales());
		System.out.println("");
		
		invertirFrase(cadena);
		System.out.println("Frase invertida: " + cadena.getInvertida());
		System.out.println("");
		
		vecesRepetido(cadena);
		System.out.println("");
		System.out.println("");
		
		compararLongitud(cadena);
		unirFrases(cadena);
		reemplazar(cadena);
		contiene(cadena);
	}

	
	public void mostrarVocales(Cadena cadena) {
		String sub, frase = cadena.getFrase();
		
		int vocales = 0;
		
		for (int aux = 0; aux < cadena.getLongitud(); aux++) {

			sub = frase.substring(aux, aux+1);

			if (sub.equalsIgnoreCase("a") || sub.equalsIgnoreCase("e") || sub.equalsIgnoreCase("i") || sub.equalsIgnoreCase("o") || sub.equalsIgnoreCase("u")) {
				
				vocales += 1;
			
			}

		}

		cadena.setVocales(vocales);

	}

	
	public void invertirFrase(Cadena cadena) {
		String sub, invertida = "", frase = cadena.getFrase();
		
		int vocales = 0;
		
		for (int aux =  cadena.getLongitud()-1; aux >= 0; aux--) {

			sub = frase.substring(aux, aux+1);
			
			invertida = invertida.concat(sub);
			
		}

		cadena.setInvertida(invertida);
	}

	
	public void vecesRepetido(Cadena cadena) {

	}

	public void compararLongitud(Cadena cadena) {

	}

	public void unirFrases(Cadena cadena) {

	}

	public void reemplazar(Cadena cadena) {

	}

	public void contiene(Cadena cadena) {

	}

}
