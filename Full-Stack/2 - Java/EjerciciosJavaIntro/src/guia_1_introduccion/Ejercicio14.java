package guia_1_introduccion;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("CONVERSOR DE MONEDAS");
		System.out.println("1 - Libra");
		System.out.println("2 - Dolar");
		System.out.println("3 - Yen");
		System.out.println("");
		System.out.println("Ingrese el nombre de la moneda a convertir en minusculas: ");
		String moneda = leer.nextLine();
		
		while (true) {
			if (moneda.equals("libra") || moneda.equals("dolar") || moneda.equals("dolar")) {
				System.out.println("");
				System.out.println("Ingrese la cantidad de euros a convertir: ");
				int cant = leer.nextInt();
				conversor(cant, moneda);
				break;
			} else {
				System.out.println("Ingrese un nombre de moneda valido");
				moneda = leer.nextLine();
			}
		}

		leer.close();
	}
	
	public static void conversor(int cant, String moneda) {
		if (moneda.equals("libra")) {
			System.out.println(cant + "€ = " + (cant * 0.86) + " libra");
		} else if (moneda.equals("dolar")) {
			System.out.println(cant + "€ = " + (cant * 1.28611) + " dolares");
		} else {
			System.out.println(cant + "€ = " + (cant * 129.852) + " yen");
		}
	}
}