package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el tamaño del vector: ");
		int tamano = leer.nextInt();
		int[] vector = new int[tamano];
		
		for (int aux = 0; aux < tamano; aux++) {
			vector[aux] = (int)(Math.random()*10);
		}
		
		System.out.println("Ingrese un valor a buscar en el vector: ");
		int valor = leer.nextInt();
			
		for (int aux = 0; aux < tamano; aux++) {
			if (valor == vector[aux]) {
				System.out.println("El numero " + valor + " fue encontrado en la posicion " + aux);
			}
			
		}
		
		leer.close();
	}

}