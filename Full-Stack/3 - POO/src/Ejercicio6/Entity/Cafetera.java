package Ejercicio6.Entity;

public class Cafetera {
	double capacidadMaxima, cantidadActual;

	public Cafetera() {
	}

	public Cafetera(double capacidadMaxima, double cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
	}

	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public double getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(double cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	
}
