package Ejercicio2.Service;

import Ejercicio2.Entity.*;
import java.util.*;

import Ejercicio1.Entity.Animal;

public class ServiceElectrodomestico {

	Scanner leer = new Scanner(System.in);
	
	ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

	public void menu() {

		int opc;

		do {

			System.out.println("- - - M - E - N - U - - -");
			System.out.println("");
			System.out.println("1 - Crear lavarropa");
			System.out.println("2 - Crear televisor");
			System.out.println("3 - Ver electrodomesticos creados");
			System.out.println("0 - Salir");
			System.out.println("");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("Ingrese su opción");
			System.out.println("");

			opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {

			case 1:
				crearLavarropa();
				break;
			case 2:
				crearTelevisor();
				break;
			case 3: 
				verElectrodomesticos();
				break;
			case 0:
				System.out.println("- - - A - D - I - O - H - - -");
				break;
			default:
				System.out.println("Opción incorrecta :( intente nuevamente");
				break;

			}

		} while (opc != 0);

	}
	
	public void crearLavarropa() {
		
		Lavarropa lavarropa = new Lavarropa();
		
		lavarropa.crearLavadora();
		
		listaElectrodomesticos.add(lavarropa);
		
	}
	
	public void crearTelevisor() {
		
		Televisor televisor = new Televisor();
		
		televisor.crearTelevisor();
		
		listaElectrodomesticos.add(televisor);
		
	}
	
	public void verElectrodomesticos() {
		
		for (Electrodomestico electrodomestico : listaElectrodomesticos) {
			
			if (electrodomestico instanceof Lavarropa) {
				
				Lavarropa lavarropa = (Lavarropa) electrodomestico;
				
				System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
				System.out.println("Tipo: Lavarropa || Carga: " + lavarropa.getCarga() + " || Precio: " + lavarropa.getPrecio() + " || Peso: " + lavarropa.getPeso() + " || Color: " + lavarropa.getColor() + " || Consumo: " + lavarropa.getConsumo());

			} else {
				
				Televisor televisor = (Televisor) electrodomestico;
				
				String sintonizador;
				
				if(televisor.isSintonizador()) {
					sintonizador = "SI";
				} else {
					sintonizador = "NO";
				}
				
				System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
				System.out.println("Tipo: Televisor || Pulgadas: " + televisor.getPulgadas() + " || Sintonizador TDT: " + sintonizador + " || Precio: " + televisor.getPrecio() + " || Peso: " + televisor.getPeso() + " || Color: " + televisor.getColor() + " || Consumo: " + televisor.getConsumo());

			}
		}
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("");
		System.out.println("");
		
		
	}

}
