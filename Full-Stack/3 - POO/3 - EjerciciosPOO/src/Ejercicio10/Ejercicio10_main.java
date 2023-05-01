package Ejercicio10;

import java.util.Arrays;

public class Ejercicio10_main {
	
	public static void main(String[] args) {
	
		double[] a = new double[50];
		double[] b = new double[20];
		
		for (int aux = 0 ; aux < 50 ; aux++) {
			Arrays.fill(a, aux, aux+1, (Math.random()*100));
		}
		
		Arrays.sort(a, 0, 50);
		
		for (int aux = 0 ; aux < 20 ; aux++) {
			if (aux < 10) {
				Arrays.fill(b, aux, aux+1, a[aux]);
			} else {
				Arrays.fill(b, aux, aux+1, 0.5);
			}
		}
		
		System.out.println("Array A: ");
		for (int aux = 0 ; aux < 50 ; aux++) {
			System.out.println(a[aux]);
		}
		
		System.out.println("");
		System.out.println("Array B: ");
		for (int aux = 0 ; aux < 20 ; aux++) {
			System.out.println(b[aux]);
		}
		
	}
	
}
