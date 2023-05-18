package EjercicioE5.Service;

import EjercicioE5.Entity.Juego;
import java.util.Scanner;

public class ServiceJuego {
		
	Scanner leer = new Scanner(System.in);
	
	public void rellenarMeses(Juego mes) {
		
		mes.setMes("enero", 0);
		mes.setMes("febrero", 1);;
		mes.setMes("marzo", 2);
		mes.setMes("abril", 3);
		mes.setMes("mayo", 4);
		mes.setMes("junio", 5);
		mes.setMes("julio", 6);
		mes.setMes("agosto", 7);
		mes.setMes("septiembre", 8);
		mes.setMes("octubre", 9);
		mes.setMes("noviembre", 10);
		mes.setMes("diciembre", 11);
		
	}
	
	public void rellenarRandom (Juego mes) {
		
		mes.setMesSecreto((int)(Math.random()+1)*11);
	
	}
	
	public void juego (Juego mes) {
		
		boolean denuevoo;
		
		String adivine;
		String denuevo;
		
		do { 
			
			denuevoo = false;
			System.out.println("Adivine el mes secreto:");
			adivine = leer.nextLine();
			
			if (adivine.equals(mes.getMesSecreto())) {
				System.out.println("FELICIDADES! Acertaste!");
			} else {
				System.out.println("No acertaste, intenta nuevamente: ");
				juego(mes);
			}
			
			System.out.println("");
			System.out.println("Jugar de nuevo? S/N");
			denuevo = leer.nextLine();
			
			if(denuevo.equalsIgnoreCase("s")) {
				rellenarRandom(mes);
				denuevoo = true;
			} else if (denuevo.equalsIgnoreCase("n")) {
				System.out.println("Hasta luego!");
			}
			
		} while(denuevoo);
		
	}
	
}
