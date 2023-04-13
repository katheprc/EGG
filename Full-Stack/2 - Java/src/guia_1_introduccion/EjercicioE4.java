package guia_1_introduccion;

import java.util.Scanner;

public class EjercicioE4 {

	public static void main(String[] args) {
		
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese un numero entre 1 y 10: ");
       int num = leer.nextInt();
       
       switch (num) {
       		case 1:
       			System.out.println("Entero: 1");
       			System.out.println("Romano: I");
       			break;
       		case 2:
          		System.out.println("Entero: 2");
          		System.out.println("Romano: II");
          		break;
       		case 3:
          		System.out.println("Entero: 3");
          		System.out.println("Romano: III");
          		break;
       		case 4:
          		System.out.println("Entero: 4");
          		System.out.println("Romano: IV");
          		break;
       		case 5:
          		System.out.println("Entero: 5");
          		System.out.println("Romano: V");
          		break;
       		case 6:
          		System.out.println("Entero: 6");
          		System.out.println("Romano: VI");
          		break;
       		case 7:
          		System.out.println("Entero: 7");
          		System.out.println("Romano: VII");
          		break;
       		case 8:
          		System.out.println("Entero: 8");
          		System.out.println("Romano: VIII");
          		break;
       		case 9:
          		System.out.println("Entero: 9");
          		System.out.println("Romano: IX");
          		break;
       		case 10:
          		System.out.println("Entero: 10");
          		System.out.println("Romano: X");
          		break;
       }

       
       
       leer.close();
       
       
	}
	
}

