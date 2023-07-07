package Ejercicio3.Entity.Superclasses;

public abstract class Hotel {
	
	private int cantHabitaciones, numCamas, cantPisos;
	private double precioHabitaciones;
	
	public Hotel(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones) {
		super();
		this.cantHabitaciones = cantHabitaciones;
		this.numCamas = numCamas;
		this.cantPisos = cantPisos;
		this.precioHabitaciones = precioHabitaciones;
	}

	public int getCantHabitaciones() {
		return cantHabitaciones;
	}

	public int getNumCamas() {
		return numCamas;
	}

	public int getCantPisos() {
		return cantPisos;
	}

	public double getPrecioHabitaciones() {
		return precioHabitaciones;
	}
	
}
