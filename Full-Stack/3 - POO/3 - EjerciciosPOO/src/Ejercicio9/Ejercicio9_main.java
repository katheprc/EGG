package Ejercicio9;

import Ejercicio9.Entity.Matematica;
import Ejercicio9.Service.ServiceMatematica;

public class Ejercicio9_main {
	
	public static void main(String[] args) {
		
		ServiceMatematica srvMatematica = new ServiceMatematica();
		Matematica matematica = new Matematica();
		
		srvMatematica.rellenarNumeros(matematica);
		
	}
	


}
