package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE13 {

	public static void main(String[] args) {
		
        Scanner leer = new Scanner(System.in); 
       
        System.out.println("Ingrese la altura de la escalera:  ");
        int num = leer.nextInt();
        
        for (int aux = 1; aux <= num; aux++) {
        	for (int aux2 = 1; aux2 <= aux; aux2++) {
        		System.out.print(aux2);
        	}
        	System.out.println("");
        }
        
        leer.close();
	}
}
