package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese tamaño del vector: ");
		int tamano = leer.nextInt();
		int[] vector = new int [tamano];
		
		int undig = 0;
		int dosdig = 0;
		int tresdig = 0;
		int cuatrodig = 0;
		int cincodig = 0;
		for (int aux = 0; aux < tamano; aux++)  {
			vector[aux] = (int)(Math.random()*100000); 
			if (vector[aux] < 10) {
				undig = undig + 1;					
			} else if (vector[aux] < 100) {
				dosdig = dosdig + 1;
			} else if (vector[aux] < 1000) {
				tresdig = tresdig + 1;
			} else if(vector[aux] < 10000) {
				cuatrodig = cuatrodig + 1;			
			} else {
				cincodig = cincodig + 1;
			}
		}
		
		System.out.println("Cantidad de numeros con un digito: " + undig);
		System.out.println("Cantidad de numeros con dos digitos: " + dosdig);
		System.out.println("Cantidad de numeros con tres digitos: " + tresdig);	
		System.out.println("Cantidad de numeros con cuatro digitos: " + cuatrodig);
		System.out.println("Cantidad de numeros con cinco digitos: " + cincodig);
	}
}