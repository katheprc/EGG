package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE10 {

	public static void main(String[] args) {
		
        Scanner leer = new Scanner(System.in); 
        int num1 = (int) (Math.random()*10+1);
        int num2 = (int) (Math.random()*10+1);
        
        System.out.println("Cuanto es " + num1 + " x " + num2 + "?");
        int resultado = leer.nextInt();
        
        while (resultado != num1*num2) {
        	System.out.println("Fallaste, intenta de nuevo: ");
        	resultado = leer.nextInt();
        }
        
        if (resultado == num1*num2) {
        	System.out.print("CORRECTO!");
        }
        
        leer.close();
	}
}