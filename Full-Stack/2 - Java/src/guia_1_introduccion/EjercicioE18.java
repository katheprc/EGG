package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE18 {

	public static void main(String[] args) {
        
		Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese tamaño del vector:  ");
        
        int cant = leer.nextInt();
		
        int[] vector = new int [cant];
		
		int suma = 0;
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Ingrese los numeros:  ");
		
		for (int aux = 0; aux < cant; aux++) {
			vector[aux] = leer.nextInt();
			suma = suma + vector[aux];
		}
		
		System.out.println("La suma total es: " + suma);
		
		leer.close();
		
	}
}
