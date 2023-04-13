package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE6 {
     public static void main(String[] args) {
    	 
       Scanner leer = new Scanner(System.in); 
       System.out.println("Ingrese la cantidad de personas: ");
       int cant = leer.nextInt();
       double promedio = 0;
       for (int aux = 1; aux <= cant; aux++) {
    	   System.out.println("Ingrese la altura de la persona " + aux);
    	   promedio = promedio + leer.nextDouble();
       }
       
       System.out.println("El promedio entre todas las estaturas es: " + (promedio / cant));
         
     }
}
