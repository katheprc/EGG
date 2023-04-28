package Ejercicio6.Service;

import Ejercicio6.Entity.Cafetera;

public class ServiceCafetera {

	public Cafetera llenarCafetera(Cafetera nespresso) {
		if (nespresso.getCantidadActual() < nespresso.getCapacidadMaxima()) {
			nespresso.setCantidadActual(nespresso.getCapacidadMaxima());
			System.out.println("Listo! Cafetera llena en su capacidad maxima");
			System.out.println("");
			System.out.println("");
		} else if (nespresso.getCantidadActual() > nespresso.getCapacidadMaxima()) {
			System.out.println("Removiendo excedente.....");
			System.out.println("Removiendo excedente.....");
			System.out.println("Removiendo excedente.....");
			System.out.println("Removiendo excedente.....");
			System.out.println("Removiendo excedente.....");
			System.out.println("");
			System.out.println("Listo! Cafetera llena en su capacidad maxima");
			System.out.println("");
			System.out.println("");
			nespresso.setCantidadActual(nespresso.getCapacidadMaxima());
		}
		return nespresso;
	}
	
	public Cafetera servirTaza(Cafetera nespresso) {
		
		
		
		return nespresso;
		
	}
	
}
