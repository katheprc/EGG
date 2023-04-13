package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE3 {

	public static void main(String[] args) {
		
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una letra: ");
       String letra = leer.next();
       
       if (letra.equals("A") || letra.equals("a") || letra.equals("E") || letra.equals("e") || letra.equals("I") || letra.equals("i") || letra.equals("O") || letra.equals("o") || letra.equals("U") || letra.equals("u")) {
    	   System.out.println("La letra es vocal");    	   
       } else {
    	   System.out.println("La letra es consonante");
       }
       
       
       
       
       leer.close();
       
       
	}
	
}