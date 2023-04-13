package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE1 {

	public static void main(String[] args) {
		
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese tiempo en minutos: ");
       int min = leer.nextInt();
       
       System.out.println("Para "+ min + " minutos, su equivalente en horas y dias es: ");
       System.out.println("Horas: " + (min / 60));
       System.out.println("Dias: " + (min / 60 / 24));
             
       
       
       
       leer.close();
       
       
       
	}
}
