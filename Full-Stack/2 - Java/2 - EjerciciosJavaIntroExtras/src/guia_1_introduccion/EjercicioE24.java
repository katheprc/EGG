package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE24 {

	public static void main(String[] args) {
        
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de numeros a calcular: ");
		int n = leer.nextInt();
		int[] vector = new int [n];
		
		vector = fibo(vector, n);
		
		for (int aux = 0; aux < n; aux++) {	
		System.out.print(vector[aux] + " ");
		}
		
		
		leer.close();
	}
	
	public static int[]fibo (int[]vector, int n) {
		vector[0] = 1;
		vector[1] = 1;
		for (int aux = 2; aux < n; aux++ ) {
			vector[aux] = vector[aux-1] + vector[aux-2];
		}
		
		return vector;
	}
}