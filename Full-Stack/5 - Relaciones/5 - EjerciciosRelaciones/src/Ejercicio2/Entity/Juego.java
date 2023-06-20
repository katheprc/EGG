package Ejercicio2.Entity;

import java.util.*;

public class Juego {
	
	HashMap<Integer, Jugador> listaJugadores = new HashMap<>();
	RevolverDeAgua revolver;
	
	public void llenarJuego(Jugador jugador) {
		
		this.listaJugadores.put(jugador.getId(), jugador);
		
	}
	
	public void ronda(RevolverDeAgua revolver) {
		
		Jugador jugador;
		
		this.revolver = revolver;
		
		for (int aux = 1 ; aux <= listaJugadores.size() ; aux++) {
			
			jugador = listaJugadores.get(aux);
			System.out.println("Posición del tambor: " + revolver.getPosActual());
			System.out.println("");
			if (revolver.mojar()) {
				
				jugador.setMojado(true);
				System.out.println(jugador.getNombre() + " ha perdido!");
				System.out.println("");
				System.out.println(revolver.toString());
				break;
				
			} else {
				
				System.out.println(jugador.getNombre() + " se salvó!");
				revolver.siguienteChorro();
				System.out.println("");
				System.out.println("");
				
				if (aux == listaJugadores.size()) {
					aux = 0;
				}
			}
			
			
			
		}
		
	}
	
}
