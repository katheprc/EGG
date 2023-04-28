package Ejercicio4.Entity;

public class Rectangulo {

	private double Base, Altura;

	// Constructor sin parametros
	public Rectangulo() {
		super();
	}

	// Constructor con parametros
	public Rectangulo(double base, double altura) {
		this.Base = base;
		this.Altura = altura;
	}

	// Getters y Setters
	public double getBase() {
		return Base;
	}

	public void setBase(double base) {
		Base = base;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

}
