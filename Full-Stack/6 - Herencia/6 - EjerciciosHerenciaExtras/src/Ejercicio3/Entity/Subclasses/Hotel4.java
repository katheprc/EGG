package Ejercicio3.Entity.Subclasses;

import Ejercicio3.Entity.Superclasses.Hotel;

public class Hotel4 extends Hotel{

	char gimnasio;
	String nombreResto;
	int capacidadResto;
	
	public Hotel4(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, char gimnasio, String nombreResto, int capacidadResto) {
		super(cantHabitaciones, numCamas, cantPisos, precioHabitaciones);
		this.gimnasio = gimnasio;
		this.nombreResto = nombreResto;
		this.capacidadResto = capacidadResto;
	}

	public char getGimnasio() {
		return gimnasio;
	}

	public String getNombreResto() {
		return nombreResto;
	}

	public int getCapacidadResto() {
		return capacidadResto;
	}
		
}
