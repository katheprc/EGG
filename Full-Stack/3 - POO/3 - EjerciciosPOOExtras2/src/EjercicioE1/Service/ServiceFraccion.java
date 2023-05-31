package EjercicioE1.Service;

import EjercicioE1.Entity.Fraccion;
import java.util.Scanner;


public class ServiceFraccion {
	
	Scanner leer = new Scanner(System.in);
	
	public void ingresar(Fraccion fraccion) {
				
		int opc;
		
		do {
			
			System.out.println("- - - M E N U - - -");
			System.out.println("");
			System.out.println("1 - Suma");
			System.out.println("2 - Resta");
			System.out.println("3 - Multiplicacion");
			System.out.println("4 - Division");
			System.out.println("");
			
			System.out.println("Ingrese opción: ");
			opc = leer.nextInt();
			
			System.out.println("Ingrese numerador y denominador de la primera fraccion (separados por enter): ");
			fraccion.setNume1(leer.nextInt());
			fraccion.setDeno1(leer.nextInt());
			
			System.out.println("Ingrese numerador y denominador de la segunda fraccion (separados por enter): ");
			fraccion.setNume2(leer.nextInt());
			fraccion.setDeno2(leer.nextInt());
			
			switch (opc) {
				case 0:
					break;
				case 1:
					suma(fraccion);
					break;
				case 2:
					resta(fraccion);
					break;
				case 3:
					multiplicacion(fraccion);
					break;
				case 4:
					division(fraccion);
					break;
				default:
					System.out.println("Opción inválida");
					
			}
			
		} while (opc != 0);
	}
	
	public void suma (Fraccion fraccion) {
		
		if (fraccion.getDeno1() == fraccion.getDeno2()) {
			
			System.out.println(fraccion.getNume1() + "/" + fraccion.getDeno1() + " + " + fraccion.getNume2() + "/" + fraccion.getDeno2() + " = " + (fraccion.getNume1() + fraccion.getNume2()) + "/"+ fraccion.getDeno1() + " = " + ((fraccion.getNume1() + fraccion.getNume2()) / fraccion.getDeno1()));
		
		} else {
		
			int deno = mcm(fraccion.getDeno1(), fraccion.getDeno2());
			int nume1 = fraccion.getNume1()*(deno / fraccion.getDeno1());
			int nume2 = fraccion.getNume2()*(deno / fraccion.getDeno2());
			double resultado = (nume1+nume2) / deno;
			
			System.out.println(fraccion.getNume1() + "/" + fraccion.getDeno1() + " + " + fraccion.getNume2() + "/" + fraccion.getDeno2() + " = " + (nume1+nume2) + "/" + deno + " = " + resultado);
		
		}
		
	}
	
	public void resta (Fraccion fraccion) {
		
		if (fraccion.getDeno1() == fraccion.getDeno2()) {
			
			System.out.println(fraccion.getNume1() + "/" + fraccion.getDeno1() + " - " + fraccion.getNume2() + "/" + fraccion.getDeno2() + " = " + (fraccion.getNume1() - fraccion.getNume2()) + "/"+ fraccion.getDeno1()+ " = " + (double)((fraccion.getNume1() - fraccion.getNume2()) / fraccion.getDeno1()));
		
		} else {
		
			int deno = mcm(fraccion.getDeno1(), fraccion.getDeno2());
			int nume1 = fraccion.getNume1()*(deno / fraccion.getDeno1());
			int nume2 = fraccion.getNume2()*(deno / fraccion.getDeno2());
			double resultado = (nume1-nume2) / deno;
			System.out.println(fraccion.getNume1() + "/" + fraccion.getDeno1() + " - " + fraccion.getNume2() + "/" + fraccion.getDeno2() + " = " + (nume1-nume2) + "/" + deno + " = " + resultado);
		
		}
		
	}
	
	public void multiplicacion (Fraccion fraccion) {
		double num = fraccion.getNume1()*fraccion.getNume2();
		double deno = fraccion.getDeno1()*fraccion.getDeno2();
		System.out.println(fraccion.getNume1() + "/" + fraccion.getDeno1() + " * " + fraccion.getNume2() + "/" + fraccion.getDeno2() + " = " + (int)num + "/" + (int)deno + " = " + (num/deno));
		
	}
	
	public void division (Fraccion fraccion) {
		double num = fraccion.getNume1()*fraccion.getDeno2();
		double deno = fraccion.getDeno1()*fraccion.getNume2();
		System.out.println(fraccion.getNume1() + "/" + fraccion.getDeno1() + " / " + fraccion.getNume2() + "/" + fraccion.getDeno2() + " = " + (int)num + "/" + (int)deno + " = " + (num/deno));
		
	}
	
	public static int mcm(int num1, int num2) {
	   
		int a = Math.max(num1, num2);
	    int b = Math.min(num1, num2);
	 
	    int resultado = (a / mcd(num1, num2)) * b;
	     
	    return resultado;
	 
	}
	
	public static int mcd(int num1, int num2) {
		 
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
 
        int resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;
 
        } while (b != 0);
 
        return resultado;
 
    }
	
	
}
