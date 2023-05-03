package Ejercicio14.Service;

import java.util.Scanner;
import Ejercicio14.Entity.Movil;

public class ServiceMovil {
	
	Scanner leer = new Scanner(System.in);
	
	public void cargarCelular (Movil movil) {
		
		System.out.println("Ingrese marca del telefono: ");
		movil.setMarca(leer.nextLine());
		System.out.println("Ingrese modelo del telefono: ");
		movil.setModelo(leer.nextLine());
		System.out.println("Ingrese memoria ram del telefono: ");
		movil.setMemRam(leer.nextLine());
		System.out.println("Ingrese almacenamiento del telefono: ");
		movil.setAlmacenamiento(leer.nextLine());
		System.out.println("Ingrese precio del telefono: ");
		movil.setPrecio(leer.nextInt());
		leer.nextLine();
		ingresarCodigo(movil);
		
	}
	


	public void ingresarCodigo (Movil movil) {
		
		String codigo;
		
		do {
			System.out.println("Ingrese codigo del telefono (7 numeros)");
			codigo = leer.nextLine();
		} while (codigo.length() != 7);
		
		for (int aux = 0; aux < 7; aux++) {
			movil.setCodigo(codigo.substring(aux, aux+1), aux);
		}
		
		mostrarCelular(movil, codigo);
		
	}
	
	public void mostrarCelular (Movil movil, String codigo) {
		
		System.out.println("Marca: " + movil.getMarca());
		System.out.println("Modelo: " + movil.getModelo());
		System.out.println("Memoria ram: " + movil.getMemRam() + "gb");
		System.out.println("Almacenamiento:  " + movil.getAlmacenamiento() + "gb");
		System.out.println("Precio: $" + movil.getPrecio());
		System.out.println("Codigo: " + codigo);
		
	}
	
}