package Ejercicio3.Entity.Subclasses;

import Ejercicio3.Entity.Superclasses.Hotel;

public class Hotel5 extends Hotel{

	char gimnasio;
	String nombreResto;
	int capacidadResto, cantSalones, cantSuites, cantLimus;
	
	public Hotel5(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, char gimnasio, String nombreResto, int capacidadResto, int cantSalones, int cantSuites, int cantLimus) {
		super(cantHabitaciones, numCamas, cantPisos, precioHabitaciones);
		this.gimnasio = gimnasio;
		this.nombreResto = nombreResto;
		this.capacidadResto = capacidadResto;
		this.cantSalones = cantSalones;
		this.cantSuites = cantSuites;
		this.cantLimus = cantLimus;
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

	public int getCantSalones() {
		return cantSalones;
	}

	public int getCantSuites() {
		return cantSuites;
	}

	public int getCantLimus() {
		return cantLimus;
	}
		
}
