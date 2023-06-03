package Ejercicio3.Entity;

public class Jugador {
	
	String nombre, posicion, numero;

	public Jugador() {
	}

	public Jugador(String nombre, String numero, String posicion) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", numero=" + numero
				+ "]";
	}
	
}
