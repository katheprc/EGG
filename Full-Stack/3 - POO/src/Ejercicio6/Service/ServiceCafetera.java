package Ejercicio6.Service;

import Ejercicio6.Entity.Cafetera;
import java.util.Scanner;

public class ServiceCafetera {
	Scanner leer = new Scanner(System.in);
	public Cafetera llenarCafetera(Cafetera nespresso) {
		if (nespresso.getCantidadActual() <= nespresso.getCapacidadMaxima()) {
			nespresso.setCantidadActual(nespresso.getCapacidadMaxima());
			System.out.println("Listo! Cafetera llena en su capacidad maxima");
			System.out.println("");
			System.out.println("");
			servirTaza(nespresso);
		} else if (nespresso.getCantidadActual() > nespresso.getCapacidadMaxima()) {
			System.out.println("Removiendo excedente (" + (nespresso.getCantidadActual() - nespresso.getCapacidadMaxima() + "gr)....."));
			System.out.println("Removiendo excedente (" + (nespresso.getCantidadActual() - nespresso.getCapacidadMaxima() + "gr)....."));
			System.out.println("Removiendo excedente (" + (nespresso.getCantidadActual() - nespresso.getCapacidadMaxima() + "gr)....."));
			System.out.println("Removiendo excedente (" + (nespresso.getCantidadActual() - nespresso.getCapacidadMaxima() + "gr)....."));
			System.out.println("Removiendo excedente (" + (nespresso.getCantidadActual() - nespresso.getCapacidadMaxima() + "gr)....."));
			System.out.println("");
			System.out.println("Listo! Cafetera llena en su capacidad maxima (100gr)");
			System.out.println("");
			System.out.println("");
			nespresso.setCantidadActual(nespresso.getCapacidadMaxima());
			servirTaza(nespresso);
		}
		
		return nespresso;
	}
	
	public Cafetera servirTaza(Cafetera nespresso) {
		
			System.out.println("Ingrese tipo de bebida a servir: (Nombre en minúsculas)");
			System.out.println("Expresso - 80ml");
			System.out.println("Largo - 220ml");
			System.out.println("Latte - 300ml");
			System.out.println("Capuccino 300ml");
			System.out.println("Mug - 500ml");
			System.out.println("Vaso - 400ml");
			String tamano = leer.next();
			String opc;
			System.out.println("Preparando su " + tamano + ".....");
			switch (tamano) {
				case "expresso":
					nespresso.setCant((80/nespresso.getProporcionAguaXGr()));
					nespresso.setCantidadActual(nespresso.getCantidadActual() - nespresso.getCant());
					break;
				case "largo":
					nespresso.setCant((220/nespresso.getProporcionAguaXGr()));
					nespresso.setCantidadActual(nespresso.getCantidadActual() - nespresso.getCant());
					break;
				case "latte":
					nespresso.setCant((300/nespresso.getProporcionAguaXGr()));
					nespresso.setCantidadActual(nespresso.getCantidadActual() - nespresso.getCant());
					break;
				case "capuccino":
					nespresso.setCant((300/nespresso.getProporcionAguaXGr()));
					nespresso.setCantidadActual(nespresso.getCantidadActual() - nespresso.getCant());
					break;
				case "mug":
					nespresso.setCant((500/nespresso.getProporcionAguaXGr()));
					nespresso.setCantidadActual(nespresso.getCantidadActual() - nespresso.getCant());
					break;
				case "vaso":
					nespresso.setCant((400/nespresso.getProporcionAguaXGr()));
					nespresso.setCantidadActual(nespresso.getCantidadActual() - nespresso.getCant());
					break;
				default:
					System.out.println("Nombre no valido, ingrese nuevamente.");
					System.out.println(" ");
					servirTaza(nespresso);
			}
			if (nespresso.getCantidadActual() < 0) {
				System.out.println("Su " + tamano + " no fue llenado al maximo. Faltó " + (nespresso.getCantidadActual() * -1) + "gr de café");
				vaciarCafetera(nespresso);
				System.out.println("Desea agregar más café para una nueva taza? S/N");
				opc = leer.next();
				if (opc.equalsIgnoreCase("s")) {
					agregarCafe(nespresso);
				} else {
					System.out.println("Que tenga buen dia!");
					vaciarCafetera(nespresso);
				}
			} else {
				System.out.println("¿Desea servir otra taza? S/N");
				opc = leer.next();
				if (opc.equalsIgnoreCase("s")) {
					servirTaza(nespresso);
				} else {
					System.out.println("Que tenga buen dia!");
					vaciarCafetera(nespresso);
				}
			}
			
			return nespresso;
		
	}
	
	public Cafetera vaciarCafetera (Cafetera nespresso) {
		System.out.println("Vaciando.....");
		System.out.println("Vaciando.....");
		System.out.println("Vaciando.....");
		System.out.println("Vaciando.....");
		System.out.println("Vaciando.....");
		nespresso.setCantidadActual(0);
		return nespresso;
	}
	
	public Cafetera agregarCafe (Cafetera nespresso) {
		System.out.println("Ingrese cantidad de cafe a agregar (Capacidad máxima 100gr):");
		nespresso.setCantidadActual(nespresso.getCantidadActual()+leer.nextDouble());
		if (nespresso.getCantidadActual() == nespresso.getCapacidadMaxima() || nespresso.getCantidadActual() > nespresso.getCapacidadMaxima()) {
			return llenarCafetera(nespresso);
		} else {
			return nespresso;
		}
		
	}
	
	
}
