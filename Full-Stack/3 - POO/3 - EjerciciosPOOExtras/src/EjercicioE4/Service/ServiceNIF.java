package EjercicioE4.Service;

import EjercicioE4.Entity.NIF;
import java.util.Scanner;

public class ServiceNIF {
	
	Scanner leer = new Scanner(System.in);
	
	public void crearNIF(NIF nif) {
		
		System.out.println("Ingrese su DNI: ");
		nif.setDni(leer.nextLong());
		
		calculo(nif);
		mostrar(nif);
		
	}
	
	public void calculo(NIF nif) {
		String[] caracter = new String[23];
		
		for (int aux = 0; aux < 23; aux++) {
			switch(aux) {
				case 0: 
					caracter[aux] = "T";
					break;
				case 1: 
					caracter[aux] = "R";
					break;
				case 2: 
					caracter[aux] = "W";
					break;
				case 3: 
					caracter[aux] = "A";
					break;
				case 4: 
					caracter[aux] = "G";
					break;
				case 5: 
					caracter[aux] = "M";
					break;
				case 6: 
					caracter[aux] = "Y";
					break;
				case 7:
					caracter[aux] = "F";
					break;
				case 8: 
					caracter[aux] = "P";
					break;
				case 9: 
					caracter[aux] = "D";
					break;
				case 10: 
					caracter[aux] = "X";
					break;
				case 11: 
					caracter[aux] = "B";
					break;
				case 12: 
					caracter[aux] = "N";
					break;
				case 13: 
					caracter[aux] = "J";
					break;
				case 14: 
					caracter[aux] = "Z";
					break;
				case 15: 
					caracter[aux] = "S";
					break;
				case 16: 
					caracter[aux] = "Q";
					break;
				case 17: 
					caracter[aux] = "V";
					break;
				case 18: 
					caracter[aux] = "H";
					break;
				case 19: 
					caracter[aux] = "L";
					break;
				case 20: 
					caracter[aux] = "C";
					break;
				case 21: 
					caracter[aux] = "K";
					break;
				case 22: 
					caracter[aux] = "E";
					break;
			}
		}
		
		int resultado = (int)nif.getDni()%23;
		
		nif.setLetra(caracter[resultado]);
		
	}
	
	public void mostrar(NIF nif) {
		System.out.println(nif.getDni() + "-" + nif.getLetra());
	}
	
}
