package Ejercicio2.Service;

import Ejercicio2.Entity.*;
import java.util.*;

public class ServiceJuego {

	Scanner leer = new Scanner(System.in);
	Juego juego = new Juego();
	RevolverDeAgua revolver = new RevolverDeAgua();
	
	public void rellenarJugadores () {
		
		System.out.println("Ingrese la cantidad de jugadores: (MÁXIMO 6, MINIMO 2)");
		int cant = leer.nextInt();
		
		if (cant == 1) {
			cant = 2;
		}
		
		if (cant < 1 || cant > 6) {
			cant = 6;
		}
		
		crearRevolver();
		
		for (int aux = 1 ; aux <= cant ; aux++) {
			
			crearJugador(aux);
			
		}
		
		juego.ronda(revolver);
		
	}
	
	public void crearJugador(int aux) {
		
		Jugador jugador = new Jugador();
		jugador.setJugadorEId(aux);
		juego.llenarJuego(jugador);
		
	}
	
	public void crearRevolver() {
		
		revolver.llenarRevolver();
		
	}
	
}
