package Ejercicio6;

import Ejercicio6.Entity.Cafetera;
import Ejercicio6.Service.ServiceCafetera;

public class Ejercicio6_main {

	public static void main(String[] args) {
		
		ServiceCafetera srvNespresso = new ServiceCafetera();
		Cafetera nespresso = new Cafetera();
		
		srvNespresso.agregarCafe(nespresso);
		
		

	}

}
