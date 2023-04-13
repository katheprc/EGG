package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE9 {

	public static void main(String[] args) {
		
        Scanner leer = new Scanner(System.in); 
       int divisor;
       int dividendo;
       
       
        do {
        	System.out.print("Ingrese divisor mayor que 1: ");
        	divisor = leer.nextInt();
        	System.out.print("Ingrese dividendo mayor que 1: ");
        	dividendo = leer.nextInt();
    	} while (divisor < 1 && dividendo < 1);

        int contcoc = 0;
        int residuo = 0;
        
        do {
        	
        	residuo = divisor - dividendo;
        	contcoc++;
        	divisor = residuo;
        } while (divisor >= dividendo);
        
        System.out.println("Cociente: " + contcoc);
        System.out.println("Residuo: " + residuo);
        	

        
	}
}
