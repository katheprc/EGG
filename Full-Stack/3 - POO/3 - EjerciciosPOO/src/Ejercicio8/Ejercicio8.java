package Ejercicio8;

import Ejercicio8.Entity.Cadena;
import Ejercicio8.Service.ServiceCadena;

public class Ejercicio8 {
		
	public static void main(String[] args) {
		
		ServiceCadena srvCadena = new ServiceCadena();
		Cadena cadena = new Cadena();
		
		srvCadena.crearFrase(cadena);
		
	}
	
}
