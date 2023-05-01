package Ejercicio11;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio11_main {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese año: ");
		int ano = leer.nextInt();
		
		System.out.println("Ingrese mes: ");
		int mes = leer.nextInt();
		
		System.out.println("Ingrese dia: ");
		int dia = leer.nextInt();
		
		Date fecha = new Date(ano, mes, dia);
		Date fechaActual = new Date();
		
		System.out.println("Fecha indicada: " + fecha.getDate() + " " +fecha.getMonth() + " " + fecha.getYear());
		System.out.println("Fecha actual: " + fechaActual.getDate() + " " + fechaActual.getMonth() + " " + fechaActual.getYear());
		
		System.out.println("Diferencia de años: " + (fechaActual.getYear()-fecha.getYear()));
		
		
		
		
		
		leer.close();
	}
	
}
