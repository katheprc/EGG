package Ejercicio2.Entity;

import java.util.*;

public class Electrodomestico {

	private Scanner leer = new Scanner(System.in);

	private int precio = 1000;
	private double peso;
	private String color;
	private char consumo;

	public Electrodomestico() {

	}

	public Electrodomestico(int precio, double peso, String color, char consumo) {
		
		this.precio = precio;
		this.peso = peso;
		this.color = color;
		this.consumo = consumo;
		
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void crearElectrodomestico(int precio) {

		System.out.println("Ingrese peso: ");
		this.peso = leer.nextDouble(); leer.nextLine();

		System.out.println("Ingrese color: ");
		this.color = leer.nextLine();

		System.out.println("Ingrese letra de consumo (A/B/C/D/E/F)");
		this.consumo = leer.next().toUpperCase().charAt(0);

		this.precio += precio;
		
		comprobarConsumoEnergetico(consumo);
		comprobarColor(color);
		calcularPrecioFinal();
			
	}

	public void comprobarConsumoEnergetico(char letra) {

		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {

			this.consumo = letra;

		} else {

			this.consumo = 'F';

		}

	}

	public void comprobarColor(String color) {

		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {

			this.color = color.toUpperCase();

		} else {

			this.color = "BLANCO";

		}

	}
	
	public void calcularPrecioFinal(){
			
		switch(this.consumo) {
		
			case 'A': this.precio += 1000; break;
			case 'B': this.precio += 800; break;
			case 'C': this.precio += 600; break;
			case 'D': this.precio += 500; break;
			case 'E': this.precio += 300; break;
			case 'F': this.precio += 100; break;
				
		}
		
		if (this.peso >= 1 && this.peso <= 19) {
			
			this.precio += 100;
		
		} else if (this.peso >= 20 && this.peso <= 49) {
			
			this.precio += 500;
			
		} else if (this.peso >= 50 && this.peso <= 79) {
			
			this.precio += 800;
			
		} else {
			
			this.precio += 1000;
			
		}
				
	}

	public double getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}
	
	
	
}
