package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE19 {

	public static void main(String[] args) {
        
		Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese tamaño de los vectores:  ");
        
        int cant = leer.nextInt();
		
        int[] vector = new int [cant];
        int[] vector2 = new int [cant];
		
		System.out.println(" ");
		System.out.println(" ");
		
		for (int aux = 0; aux < cant; aux++) {
			if (vector[aux] == vector2[aux]) {
				System.out.println("Los vectores no son iguales");
				break;
			}
		}
		
		leer.close();
		
	}
}
