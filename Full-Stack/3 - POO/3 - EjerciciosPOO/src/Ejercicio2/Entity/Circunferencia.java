package Ejercicio2.Entity;

public class Circunferencia {
	
	private double radio;

	//metodo constructor vacio
	public Circunferencia() {
	}

	//metodo constructor con parametros
	public Circunferencia(double radio) {
		this.radio = radio;
	}

	//metodo getter
	public double getRadio() {
		return radio;
	}

	//metodo setter
	public void setRadio(double radio) {
	    this.radio = radio;
	}  

}