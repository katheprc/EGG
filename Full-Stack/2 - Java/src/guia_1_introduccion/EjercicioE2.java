package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE2 {

	public static void main(String[] args) {
		
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el valor de A: ");
       int a = leer.nextInt();
       System.out.println("Ingrese el valor de B: ");
       int b = leer.nextInt();
       System.out.println("Ingrese el valor de C: ");
       int c = leer.nextInt();
       System.out.println("Ingrese el valor de D: ");
       int d = leer.nextInt();
       int aux;
       System.out.println("Valor de A: " + a + ". Valor de b: " + b + ". Valor de C: " + c + ". Valor de D: " + d);
       aux = b;
       b = c;
       c = a;
       a = d;
       d = aux;
       System.out.println(" ");
       System.out.println("Calculando.");
       System.out.println(" ");
       System.out.println("Calculando..");
       System.out.println(" ");
       System.out.println("Calculando...");
       System.out.println(" ");
       System.out.println("Valor de A: " + a + ". Valor de b: " + b + ". Valor de C: " + c + ". Valor de D: " + d);
       
	}
}
