package Ejercicio3.Entity;

import java.util.*;

public class Lavarropa extends Electrodomestico{
	
	int carga;
	
	Scanner leer = new Scanner(System.in);
	
	public Lavarropa() {
	}
	
	public Lavarropa (int precio, double peso, String color, char consumo, int carga) {
		super(precio, peso, color, consumo);
		
		this.carga = carga;
	}
		
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public void crearLavadora() {
		
		System.out.println("Ingrese la carga en KG: ");
		
		this.carga = leer.nextInt(); leer.nextLine();
		
		if (carga > 30) {
			
			crearElectrodomestico(500);

		} else {
			
			crearElectrodomestico(0);

		}
		
	}
	
}
