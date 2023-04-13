package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese temperatura en grados centigrados para ver su equivalente en fahrenheit: ");
		
		double centi = leer.nextDouble();
		double fahr = 32 + (9 * centi / 5);
		
		System.out.println(centi + "°C equivale a " + fahr + "°F");
		
		
		
		leer.close();
	}
	
}