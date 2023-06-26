package Ejercicio3.Entity;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

	int pulgadas;
	boolean sintonizador = false;
	
	Scanner leer = new Scanner(System.in);
	
	public Televisor() {
	}
	
	public Televisor (int precio, double peso, String color, char consumo, int pulgadas, boolean sintonizador) {
		
		super(precio, peso, color, consumo);
		
		this.pulgadas = pulgadas;
		
		this.sintonizador = sintonizador;
		
	}
		
	public int getPulgadas() {
		return pulgadas;
	}

	public void setCarga(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	public boolean isSintonizador() {
		return sintonizador;
	}

	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}

	public void crearTelevisor() {
		
		System.out.println("Ingrese la resolucion en pulgadas: ");
		
		this.pulgadas = leer.nextInt(); leer.nextLine();
		
		System.out.println("Tiene sintonizado TDT?  S/N");
		char vof = leer.next().toUpperCase().charAt(0); leer.nextLine();
		
		if (vof == 'S') {
			this.sintonizador = true;
		}
		
		if (sintonizador) {
			
			crearElectrodomestico(500);

		} else {
			
			crearElectrodomestico(0);

		}
		
		if (pulgadas > 40) {
			setPrecio(getPrecio() + ((getPrecio()*30)/100));
		}
		
	}
	
}
