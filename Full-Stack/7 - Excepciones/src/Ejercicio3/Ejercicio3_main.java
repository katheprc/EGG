/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.*/


package Ejercicio3;

import java.util.*;
import Ejercicio3.Service.*;

public class Ejercicio3_main {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		try {
			
			System.out.println("Ingrese dos numeros separados por enter: ");
			String num1 = leer.nextLine(), num2 = leer.nextLine();
			
			int num3 = Integer.parseInt(num1), num4 = Integer.parseInt(num2);
			
			System.out.println("La division es de " + num1 + " y "+ num2 + " es: " + DivisionNumero.division(num3, num4));
			
		}catch(Exception e) {
			System.out.println("Mensaje: " + e.getMessage());
		}
		
		leer.close();		
				
	}
	
}
