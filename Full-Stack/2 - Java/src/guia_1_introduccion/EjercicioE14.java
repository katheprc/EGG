package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE14 {

	public static void main(String[] args) {
		
        Scanner leer = new Scanner(System.in); 
       
        System.out.println("Ingrese la cantidad de familias  ");
        int cant = leer.nextInt();
        int[] fam = new int[cant];
        int prom = 0;
        for (int aux = 0; aux < cant; aux++) {
        	System.out.println("Ingrese cantidad de hijos de la familia n° " + (aux+1));
        	fam[aux] = leer.nextInt();
        	prom = prom + fam[aux];
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Familia | Cantidad de hijos");
        
        for (int aux = 0; aux < cant; aux++) {
        	System.out.println((aux+1) + "       |   " + fam[aux]);
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("El promedio total es: " + (prom/cant));
        
        
        
        leer.close();
	}
}
