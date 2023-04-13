package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        
        System.out.print("Ingrese cantidad de numeros a ingresar: ");
        int num = leer.nextInt();
        int num2 = 0;
        int cont = 1;
        int max;
        int min;
        int prom = 0;
        
/*
    	System.out.print("Ingrese un numero: ");
    	num2 = leer.nextInt();
    	max = num2;
    	min = num2;
        prom = num2;
        
        while(cont < num) {
        	System.out.print("Ingrese un numero: ");
        	num2 = leer.nextInt();
        	prom = prom + num2;
        	if (max < num2) {
        		max = num2;
        	}
        	if (min > num2) {
        		min = num2;
        	}
        	cont++;
        }
        
        System.out.println("Minimo: " + min);
        System.out.println("Maximo: " + max);
        System.out.println("Promedio: " + (prom/num));
 */
        
    	System.out.print("Ingrese un numero: ");
    	num2 = leer.nextInt();
    	max = num2;
    	min = num2;
        prom = num2;
        
        do {
        	
        	System.out.print("Ingrese un numero: ");
        	num2 = leer.nextInt();
        	prom = prom + num2;
        	if (max < num2) {
        		max = num2;
        	}
        	if (min > num2) {
        		min = num2;
        	}
        	cont++;
        	
        } while (cont < num);
        
        System.out.println("Minimo: " + min);
        System.out.println("Maximo: " + max);
        System.out.println("Promedio: " + (prom/num));
        
        
        
        leer.close();
        
    }
}






