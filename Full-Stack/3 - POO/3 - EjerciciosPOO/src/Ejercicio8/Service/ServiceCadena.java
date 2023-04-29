package Ejercicio8.Service;

import Ejercicio8.Entity.Cadena;
import java.util.Scanner;

public class ServiceCadena {

	Scanner leer = new Scanner(System.in);
	
	Cadena cadena2 = new Cadena();

	public void crearFrase(Cadena cadena) {
		
		System.out.println("Ingrese frase: ");
		cadena.setFrase(leer.nextLine());
		cadena.setLongitud(cadena.getFrase().length());
		System.out.println("");
		
		vecesRepetido(cadena);
		
		System.out.println("");
		
		reemplazar(cadena);
		
		System.out.println("");
				
		System.out.println("Ingrese segunda frase: ");
		cadena2.setFrase(leer.nextLine());
		cadena2.setLongitud(cadena2.getFrase().length());
		System.out.println("");
		
		mostrarVocales(cadena);
		System.out.println("Cantidad de vocales: " + cadena.getVocales());
		System.out.println("");
		
		invertirFrase(cadena);
		System.out.println("Frase invertida: " + cadena.getInvertida());
		System.out.println("");
		
		System.out.println("El caracter '" + cadena.getCar() + "' fue encontrado " + cadena.getEncontrado() + " veces.");
		System.out.println("");
		
		System.out.println(compararLongitud(cadena, cadena2));
		System.out.println("");
		
		System.out.println("Cadenas unidas: ");
		System.out.println(unirFrases(cadena, cadena2));
		System.out.println("");
		
		System.out.println("Reemplazo de caracteres: ");
		System.out.println(cadena.getReemplazado());
		System.out.println("");
		
		if (contiene(cadena)) {
			System.out.println("Encontrado!");
		} else {
			System.out.println("No encontrado :(");
		}
		
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
		
		for (int aux =  cadena.getLongitud()-1; aux >= 0; aux--) {

			sub = frase.substring(aux, aux+1);
			
			invertida = invertida.concat(sub);
			
		}

		cadena.setInvertida(invertida);
		
	}

	
	public void vecesRepetido(Cadena cadena) {
		
		System.out.println("Ingrese un caracter para ver cuantas veces está repetido: ");
		
		String car = leer.nextLine();
		
		String sub, frase = cadena.getFrase();
		
		int encontrado = 0;
		
		while (car.length() > 1) {
			
			System.out.println("Entrada incorrecta. Ingrese nuevamente: ");
			
			car = leer.nextLine();
			
		}
		
		for (int aux = 0; aux < cadena.getLongitud(); aux++) {
			
			sub = frase.substring(aux, aux+1);
			
			if (car.equalsIgnoreCase(sub)) {
			
				encontrado +=1;
			
			}
		
		}
		
		cadena.setCar(car);
		cadena.setEncontrado(encontrado);
	
	}

	
	public String compararLongitud(Cadena cadena, Cadena cadena2) {
		
		if (cadena.getLongitud() == cadena2.getLongitud()) {
			return "Las cadenas tienen la misma longitud";
		} else if (cadena.getLongitud() > cadena2.getLongitud()) {
			return "La primer cadena tiene una longitud mayor";
		} else {
			return "La segunda cadena tiene una longitud mayor";
		}
		
	}

	
	public String unirFrases(Cadena cadena, Cadena cadena2) {
		
		return cadena.getFrase()+cadena2.getFrase();
		
	}

	
	public void reemplazar(Cadena cadena) {
		System.out.println("Ingrese caracter a reemplazar: ");
		String sub, reemplazado = "", frase = cadena.getFrase(), car = leer.nextLine(), car2;

		while (car.length() > 1) {
			
			System.out.println("Entrada incorrecta. Ingrese nuevamente: ");
			
			car = leer.nextLine();
			
		}
		
		System.out.println("Ingrese reemplazo");
		car2 = leer.nextLine();
		
		while (car2.length() > 1) {
			
			System.out.println("Entrada incorrecta. Ingrese nuevamente: ");
			
			car2 = leer.nextLine();
			
		}
		
		for (int aux =  0; aux < cadena.getLongitud(); aux++) {

			sub = frase.substring(aux, aux+1);
			if (sub.equalsIgnoreCase(car)) {
				reemplazado = reemplazado.concat(car2);
			} else {
				reemplazado = reemplazado.concat(sub);
			}
			
			
		}

		cadena.setReemplazado(reemplazado);
		
	}

	
	public boolean contiene(Cadena cadena) {
		System.out.println("Ingrese caracter a buscar: ");
		String sub, frase = cadena.getFrase(), car = leer.nextLine();
		boolean vof = false;

		while (car.length() > 1) {
			
			System.out.println("Entrada incorrecta. Ingrese nuevamente: ");
			
			car = leer.nextLine();
			
		}
		
		
		for (int aux =  0; aux < cadena.getLongitud(); aux++) {

			sub = frase.substring(aux, aux+1);
			if (sub.equalsIgnoreCase(car)) {
				vof = true;
				break;
			} else {
				vof = false;
			}
			
		}
		return vof;
	}

}
