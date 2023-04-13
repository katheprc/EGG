package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
		int num1 = leer.nextInt();
		System.out.println("Ingrese otro numero entero: ");
		int num2 = leer.nextInt();
		
		int total = num1 + num2;
		System.out.println("La suma de los numeros es: " + total);

	}

}
