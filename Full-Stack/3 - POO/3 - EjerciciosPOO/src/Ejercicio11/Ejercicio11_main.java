/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/

package Ejercicio11;

import java.util.Date;

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
		System.out.println("Fecha actual: " + fechaActual.getDate() + " " + fechaActual.getMonth() + " " + (fechaActual.getYear() + 1900));
		
		System.out.println("Diferencia de años: " + (fechaActual.getYear() + 1900 - fecha.getYear()));
		
		leer.close();
	}
	
}
