package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE16 {

	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
		
        System.out.print("Ingrese cantidad de personas");
        int cant = leer.nextInt();
        String[] nombres = new String[cant];
        int[] edades = new int [cant];
        
        
        for (int aux = 0; aux < cant; aux++) {
        	System.out.println("PERSONA " + (aux+1));
	        System.out.println("Ingrese nombre: ");
	        nombres[aux] = leer.next();
			System.out.println("Ingrese edad: ");
			edades[aux]= leer.nextInt();
		}
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
		System.out.println("NOMBRE  |  EDAD");
        for (int aux = 0; aux < cant; aux++) {
        	if (edades[aux] < 18) {
        		System.out.println(nombres[aux] + "    |    " + edades[aux] + "   MENOR DE EDAD");
			} else {
				System.out.println(nombres[aux] + "    |    " + edades[aux]);
			}
        }
        
        leer.close();
        
	}
}
