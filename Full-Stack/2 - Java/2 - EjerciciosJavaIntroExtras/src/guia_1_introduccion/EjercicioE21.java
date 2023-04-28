package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE21 {
    public static void main(String[] args) {
    	Scanner leer = new Scanner(System.in);
    
       	double[][] matriz = new double[1][5];
       	double prom;
       	for (int aux = 0; aux < 1; aux++) {
       		prom = 0;
       		for(int aux2 = 0; aux2 < 4; aux2++ ) {
       			
       			System.out.println("Ingrese nota " + (aux2+1) + " del alumno " + (aux+1));
       			matriz[aux][aux2] = leer.nextInt();
       			if (aux2 == 0) {
       				prom = prom + (10*matriz[aux][aux2]/100); 
       			} else if (aux2 == 1) {
       				prom = prom + (15*matriz[aux][aux2]/100); 
       			} else if (aux2 == 2) {
       				prom = prom + (25*matriz[aux][aux2]/100); 
       			} else if (aux2 == 3) {
       				prom = prom + (50*matriz[aux][aux2]/100); 
       			}
       		}
       		matriz[aux][4] = prom;
       	}
       	
       	for (int aux = 0; aux < 1; aux++) {
       		System.out.println("Alumno: " + (aux+1));
       		for(int aux2 = 0; aux2 < 5; aux2++ ) {
       			
       			if (aux2 == 4) {
       				System.out.println("El promedio del alumno " + (aux+1) + " es: " + matriz[aux][4]);
       				if (matriz[aux][4] >= 7) {
       					System.out.println("APROBADO!!");
       					break;
       				} else {
       					System.out.println("DESAPROBADO");
       					break;
       				}
       			}
       			System.out.print(matriz[aux][aux2] + "  ");
       		}
       		
       		System.out.println(" ");
       		System.out.println(" ");
       		
    	}
       	
       	leer.close();
    }
       
        
}