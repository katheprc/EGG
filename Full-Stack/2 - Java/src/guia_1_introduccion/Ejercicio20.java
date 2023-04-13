package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[][] matriz = new int [3][3];
		int num;
		int suma1 = 0;
		int suma2 = 0;
		int suma3 = 0;
		int sumadiag = 0;
		System.out.println("Ingrese numeros del 1 al 9 para rellenar el cuadrado mágico: ");
		
		for (int aux = 0; aux < 3; aux++)  {
			for (int aux2 = 0; aux2 < 3; aux2++) {
				System.out.print("Columna " + (aux2 + 1) + ", fila " + (aux + 1) + ": ");
				num = leer.nextInt(); 
				
				while ((num < 1 || num > 9)) {
				System.out.print("Ingrese un numero válido. ");
				System.out.print("Columna " + (aux2 + 1) + ", fila " + (aux + 1) + ": ");
				num = leer.nextInt();
				}
				
				if (num > 0 && num < 10) {
					matriz[aux][aux2] = num;
				}
				
				if (aux == 0) {
					suma1 = suma1 + num;
				} else if (aux == 1){
					suma2 = suma2 + num;
				} else if (aux == 2) {
					suma3 = suma3 + num;
				}
				
				if (aux == aux2) {
					sumadiag = sumadiag + num;
				}
			}
		}

		System.out.println(" ");
		System.out.println(" ");
		
		
		for (int aux = 0; aux < 3; aux++)  {
			for (int aux2 = 0; aux2 < 3; aux2++) {
				System.out.print(matriz[aux][aux2] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println(" ");	
		
		if (suma1 == suma2 && suma2 == suma3 && suma3 == sumadiag) {
			System.out.println("ES UN CUADRADO MAGICO!!");
		} else {
			System.out.println("NO ES UN CUADRADO MAGICO :(");
		}
		
		System.out.println(" ");
		
	}
}