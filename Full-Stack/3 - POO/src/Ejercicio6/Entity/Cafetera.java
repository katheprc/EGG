package Ejercicio6.Entity;

public class Cafetera {
	double capacidadMaxima = 100;
	double cantidadActual;
	int proporcionAguaXGr = 18;
	double cant;

	public Cafetera() {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	}

	public Cafetera(double capacidadMaxima, double cant, double cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
		this.cant = cant;
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

	public double getCant() {
		return cant;
	}

	public void setCant(double cant) {
		this.cant = cant;
	}

	public int getProporcionAguaXGr() {
		return proporcionAguaXGr;
	}
	
	
}
