package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un valor limite positivo: ");
		
		int num = leer.nextInt();
		int num2 = 0;
		int suma = 0;
		while (num > suma) {
			System.out.println("Ingrese un valor: ");
			num2 = leer.nextInt();
			suma = suma + num2;
					
		}
		
		System.out.println("El valor total de la suma de los valores ingresados es: " + suma + ". siendo el limite " + num);

		
		leer.close();
	}

}
