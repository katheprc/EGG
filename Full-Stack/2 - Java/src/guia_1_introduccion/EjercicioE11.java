package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE11 {

	public static void main(String[] args) {
		
        Scanner leer = new Scanner(System.in); 
       
        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();
        int cont = 0;
        
        while (num >= 1) {
        	num = (int) num/10;
        	cont++;
        }
        System.out.println("El numero ingresado tiene " + cont + " digitos.");
        
        
        leer.close();
	}
}