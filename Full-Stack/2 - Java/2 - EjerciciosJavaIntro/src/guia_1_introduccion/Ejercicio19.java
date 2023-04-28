package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[][] matriz = new int [3][3];
		int[][] matriz2 = new int [3][3];
		for (int aux = 0; aux < 3; aux++)  {
			for (int aux2 = 0; aux2 < 3; aux2++) {
				matriz[aux][aux2] = leer.nextInt();
				System.out.print(matriz[aux][aux2] + " ");
			}
			System.out.println(" ");
		}

		System.out.println(" ");
		for (int aux = 0; aux < 3; aux++)  {
			for (int aux2 = 0; aux2 < 3; aux2++) {
				matriz2[aux][aux2] = matriz[aux2][aux];
				if (matriz[aux][aux2] != (matriz2[aux][aux2])*(-1)) {
					break;
				}
				System.out.print(matriz2[aux][aux2] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");

		
		
		leer.close();
		
		}
		
	}


	