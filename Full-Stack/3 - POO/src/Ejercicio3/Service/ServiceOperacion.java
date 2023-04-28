package Ejercicio3.Service;

import Ejercicio3.Entity.Operacion;
import java.util.Scanner;

public class ServiceOperacion {
	
	Scanner leer = new Scanner(System.in);
	
	//Metodos
	public Operacion crearOperacion () {
		
		Operacion obj = new Operacion();
		
		System.out.println("Ingrese numero 1: ");
		obj.setNumero1(leer.nextDouble());
		System.out.println("Ingrese numero 2: ");
		obj.setNumero2(leer.nextDouble());
		return obj;
	
	}
	
	public double sumar (Operacion obj) {
		return (obj.getNumero1() + obj.getNumero2());
	}
	
	public double restar (Operacion obj) {
		return (obj.getNumero1() - obj.getNumero2());
	}
	
	public double multiplicar (Operacion obj) {
		if (obj.getNumero1() != 0 && obj.getNumero2() != 0) {
			return (obj.getNumero1() * obj.getNumero2());
		} else {
			System.out.println("No puede multiplicar por 0");
			return 0;
		}
	}
	
	public double dividir (Operacion obj) {
		if (obj.getNumero1() != 0 && obj.getNumero2() != 0) {
			return (obj.getNumero1() / obj.getNumero2());
		} else {
			System.out.println("No puede dividir por 0");
			return 0;
		}
	}
	
	
}
