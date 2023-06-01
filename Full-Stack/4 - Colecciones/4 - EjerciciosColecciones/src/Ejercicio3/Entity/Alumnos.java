package Ejercicio3.Entity;

import java.util.ArrayList;

public class Alumnos {
	
	private String nombre;
	private ArrayList<Integer> notas;
	
	public Alumnos() {
	}
	
	public Alumnos(String nombre, ArrayList<Integer> notas) {
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Integer> getNotas() {
		return notas;
	}
	
	public void setNotas(ArrayList<Integer> notas) {
		this.notas = notas;
	}
	
	public void clearNotas() {
		this.notas.clear();
	}

	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", notas=" + notas + "]";
	}
	
	
		
}
