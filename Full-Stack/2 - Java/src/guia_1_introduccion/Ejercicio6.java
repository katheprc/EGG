package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero");
		
		int num = leer.nextInt();
		
		if (num == 0) {
			System.out.println("El numero no es par ni impar");
		} else if (num % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		
		
	}
	
}