package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE15 {

	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
		int opc = 0;
		double num1 = 0;
		double num2 = 0;
		
		do {
	       
	        System.out.println("---C A L C U L A D O R A---");
	        System.out.println("");
	        System.out.println("1 - SUMAR");
	        System.out.println("2 - RESTAR");
	        System.out.println("3 - MULTIPLICAR");
	        System.out.println("4 - DIVIDIR");
	        System.out.println("5 - SALIR");
	        System.out.println("");
	        System.out.print("Seleccione el numero de la opcion: ");
	        opc = leer.nextInt();
	        
	        if (opc < 5) {
		        System.out.println("");
		        System.out.println("");
		        System.out.println("");
		        System.out.print("Ingrese el primer numero:  ");
		        num1 = leer.nextInt();
		        System.out.println("");
		        System.out.print("Ingrese el segundo numero:  ");
		        num2 = leer.nextInt();
		        System.out.println("");
		        System.out.println("");
	        }
	        
	        switch (opc) {
	        	case 1:  
	        		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	    	        System.out.println("");
	    	        System.out.println("");
	    	        System.out.println("");
	    	        break;
	        	case 2:  
	        		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	    	        System.out.println("");
	    	        System.out.println("");
	    	        System.out.println("");
	    	        break;
	        	case 3:  
	        		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
	    	        System.out.println("");
	    	        System.out.println("");
	    	        System.out.println("");
	    	        break;
	        	case 4:  
	        		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	    	        System.out.println("");
	    	        System.out.println("");
	    	        System.out.println("");
	    	        break;
	        	
	        	default: 
	        		if (opc != 5) {
	        	        System.out.println("");
	        	        System.out.println("");
	        	        System.out.println("");
	        			System.out.println("Ingrese un valor valido");
	    		        System.out.println("");
	    		        System.out.println("");
	    		        System.out.println("");
	        		}
	        		
	        }
	        
		} while(opc != 5);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("---N O S   V E M O S---");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        leer.close();
	}
	
}
