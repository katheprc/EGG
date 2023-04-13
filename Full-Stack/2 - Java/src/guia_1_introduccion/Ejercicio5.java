package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero");
		
		int num = leer.nextInt();
		System.out.println("Doble: " + (num*2));
		System.out.println("Triple: " + (num*3));
		System.out.println("Raiz cuadrada: " + (Math.sqrt(num)));
	}
	
}