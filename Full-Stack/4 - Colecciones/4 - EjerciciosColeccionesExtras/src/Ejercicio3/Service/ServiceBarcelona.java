package Ejercicio3.Service;

import java.util.*;
import Ejercicio3.Entity.*;

public class ServiceBarcelona {

	HashSet<Jugador> barcelona = new HashSet<Jugador>();	
	HashSet<Jugador> barcelona2 = new HashSet<Jugador>();

	public void rellenarSet() {
		int aux = 1;
		switch (aux) {
			case 1: Jugador jugador = new Jugador("NEYMAR JR", "11", "DELANTERO"); barcelona.add(jugador);
			case 2: Jugador jugador2 = new Jugador("PIQUE", "3", "DEFENSOR"); barcelona.add(jugador2); barcelona2.add(jugador2);
			case 3: Jugador jugador3 = new Jugador("TER STEGEN", "1", "ARQUERO"); barcelona.add(jugador3);
			case 4: Jugador jugador4 = new Jugador("IÑAKI PEÑA", "13", "ARQUERO"); barcelona.add(jugador4);
			case 5: Jugador jugador5 = new Jugador("ARAUJO", "4", "DEFENSOR"); barcelona.add(jugador5);
			case 6: Jugador jugador6 = new Jugador("CHRISTENSEN", "15", "DEFENSOR"); barcelona.add(jugador6);
			case 7: Jugador jugador7 = new Jugador("ALONSO", "17", "DEFENSOR"); barcelona.add(jugador7);
			case 8: Jugador jugador8 = new Jugador("ALBA", "18", "DEFENSOR"); barcelona.add(jugador8);
			case 9: Jugador jugador9 = new Jugador("KOUNDE", "23", "DEFENSOR"); barcelona.add(jugador9);
			case 10: Jugador jugador10 = new Jugador("GARCIA", "24", "DEFENSOR"); barcelona.add(jugador10);
			case 11: Jugador jugador11 = new Jugador("BUSQUETS", "5", "MEDIOCAMPISTA"); barcelona.add(jugador11); barcelona2.add(jugador11);
			case 12: Jugador jugador12 = new Jugador("PEDRI", "8", "MEDIOCAMPISTA"); barcelona.add(jugador12);
			case 13: Jugador jugador13 = new Jugador("KESSIE", "19", "MEDIOCAMPISTA"); barcelona.add(jugador13);
			case 14: Jugador jugador14 = new Jugador("ROBERTO", "20", "MEDIOCAMPISTA"); barcelona.add(jugador14);
			case 15: Jugador jugador15 = new Jugador("DEJONG", "21", "MEDIOCAMPISTA"); barcelona.add(jugador15);
			case 16: Jugador jugador16 = new Jugador("GAVI", "30", "MEDIOCAMPISTA"); barcelona.add(jugador16);
			case 17: Jugador jugador17 = new Jugador("DEMBELE", "7", "DELANTERO"); barcelona.add(jugador17);
			case 18: Jugador jugador18 = new Jugador("LEWANDOWSKI", "9", "DELANTERO"); barcelona.add(jugador18);
			case 19: Jugador jugador19 = new Jugador("ANSU FATI", "10", "DELANTERO"); barcelona.add(jugador19);
			case 20: Jugador jugador20 = new Jugador("TORRES", "11", "DELANTERO"); barcelona.add(jugador20);
			case 21: Jugador jugador21 = new Jugador("RAPINHA", "22", "DELANTERO"); barcelona.add(jugador21);
		}
		
		
		mostrarTodo();
		neymar();
		estan();
		
	}
	
	public void mostrarTodo() {
		
		for (Jugador jugador : barcelona) {
			System.out.println(jugador.toString());
		}
		
	}
	
	public void neymar() {
		
		for (Jugador jugador : barcelona) {
			if (jugador.getNombre() == "NEYMAR JR") {
				System.out.println("Neymar JR presente en el equipo");
				break;
			}
		}
	}
	
	public void estan() {
		int cont = 0;
		for (Jugador jugador : barcelona) {
			
			if (barcelona2.contains(jugador)) {
				cont++;
					
				barcelona2.remove(jugador);
						
			}
			
		}
		
		if (cont == 2) {
			
			System.out.println("Piqué y Busquets están en equipo");
			
		}
		
		System.out.println("El segundo conjunto tiene: " + barcelona2.size() + " jugadores");
		
		
	}
	
	
	
}
