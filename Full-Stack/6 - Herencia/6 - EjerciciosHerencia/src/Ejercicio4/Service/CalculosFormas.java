package Ejercicio4.Service;

import Ejercicio4.Entity.*;
import java.util.*;

public interface CalculosFormas {
	
	Scanner leer = new Scanner(System.in);
	
	ArrayList<Circulo> listaCirculos = new ArrayList<>();
	ArrayList<Rectangulo> listaRectangulos = new ArrayList<>();
	
	public static void menu() {
		
		int opc;
		
		do {
			
			System.out.println("- - - M - E - N - U - - -");
			System.out.println("");
			System.out.println("1 - Crear circulo");
			System.out.println("2 - Crear rectangulo");
			System.out.println("3 - Calcular y mostrar");
			System.out.println("0 - Salir");
			System.out.println("");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("Ingrese una opción");
			opc = leer.nextInt(); leer.nextLine();
			
			switch(opc) {
				case 1: crearCirculo(); break;
				case 2: crearRectangulo(); break;
				case 3: calcularMostrar(); break;
				
			}
			
		} while (opc != 0);
		
	}
	
	public static void crearCirculo() {
		
		Circulo circulo = new Circulo();
		
		System.out.println("Ingrese radio del círculo");
		circulo.setRadio(leer.nextDouble()); leer.nextLine();
		
		circulo.setDiametro(circulo.getRadio()*2);
		
		listaCirculos.add(circulo);
		
	}
	
	public static void crearRectangulo() {
		
		Rectangulo rectangulo = new Rectangulo();
		
		System.out.println("Ingrese base del Rectangulo");
		rectangulo.setBase(leer.nextDouble()); leer.nextLine();
		
		System.out.println("Ingrese altura del Rectangulo");
		rectangulo.setAltura(leer.nextDouble()); leer.nextLine();
		
		listaRectangulos.add(rectangulo);
		
	}
		
	public static void calcularMostrar() {
		
		for (Circulo circulo : listaCirculos) {
			
			System.out.println("Circulo " + (listaCirculos.indexOf(circulo)+1 + " || Radio = " + circulo.getRadio() + ". || Diametro = " + circulo.getDiametro() + ". Perímetro = " + (Math.PI*circulo.getDiametro() + ". Area = " + (Math.PI*circulo.getRadio()*circulo.getRadio()))));
			
		}
		
		System.out.println("- - - - - - - - - - - - - ");
		
		for (Rectangulo rectangulo : listaRectangulos) {
			
			System.out.println("Rectangulo " + (listaRectangulos.indexOf(rectangulo)+1) + ". || Base =  " + rectangulo.getBase() + ". || Altura = " + rectangulo.getAltura() + ". Perímetro = " + ((rectangulo.getAltura()+rectangulo.getBase())*2) + ". Area = " + (rectangulo.getAltura()*rectangulo.getBase()));
			
		}
		
	}
	
}
