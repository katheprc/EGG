package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE17 {

	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
		int num = 1;
		
		do {
	        System.out.print("Ingrese un numero natural para saber si es primo o no:  ");
	        num = leer.nextInt();
	        if (num == 1) {
	        	System.out.println(" ");
	        	System.out.println(num + " no es primo");
	        	System.out.println(" ");
	        } else if (num == 0) {
	        	System.out.println(" ");
	        	System.out.println("---N O S   V E M O S---");
	        	break;
			} else if (primoono(num) == false) {
				System.out.println(" ");
	        	System.out.println(num + " es primo");
	        	System.out.println(" ");
	        } else {
	        	System.out.println(" ");
	        	System.out.println(num + " no es primo");
	        	System.out.println(" ");
	        }
	       
		} while (true);
		
		leer.close();
	}
	
	public static boolean primoono(int num) {
		boolean retorno = false;
		int aux2 = 0;
		for (int aux = 1; aux <= num; aux++) {
			if (num % aux == 0) {
				aux2++;
			}
			if (aux2 > 2) {
				retorno = true;
			}
		}
		
		return retorno;
	}

}