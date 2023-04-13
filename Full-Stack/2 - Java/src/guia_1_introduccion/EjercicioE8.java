package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE8 {

	public static void main(String[] args) {
		
        Scanner leer = new Scanner(System.in);  
        
        System.out.println("Ingrese numeros: ");
        
        int num;
        int aux = 0;
        int auxpar = 0;
        
        do {
        	num = leer.nextInt();
        	
        	if (num % 5 == 0) {
        		break;
        	}
        	
        	if (num % 2 == 0) {
        		auxpar++;
        	}
        	
        	aux++;

        } while(num > 0);
		
		System.out.println("Cantidad ingresada: " + aux);
		System.out.println("Cantidad de numeros pares: " + auxpar);
		System.out.println("Cantidad de numeros impares: " + (aux - auxpar));
	}

}
