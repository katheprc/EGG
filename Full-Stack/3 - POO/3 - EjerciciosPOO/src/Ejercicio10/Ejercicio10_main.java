/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/

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
