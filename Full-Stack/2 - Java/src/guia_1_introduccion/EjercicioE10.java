package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE10 {

	public static void main(String[] args) {
		
            Scanner leer = new Scanner(System.in); 
        int divisor;
        int dividendo;

        do {
            System.out.print("Ingrese divisor mayor que 1: ");
            divisor = leer.nextInt();
            System.out.print("Ingrese dividendo mayor que 1: ");
            dividendo = leer.nextInt();
        } while (divisor < 1 || dividendo < 1);

        int contcoc = 0;
        int residuo = divisor;
        
        while (residuo >= dividendo) {
            residuo -= dividendo;
            contcoc++;
        }
        
        System.out.println("Cociente: " + contcoc);
        System.out.println("Residuo: " + residuo);

        
	}
}