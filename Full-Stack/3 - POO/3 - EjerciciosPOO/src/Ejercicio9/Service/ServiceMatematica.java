package Ejercicio9.Service;

import Ejercicio9.Entity.Matematica;

public class ServiceMatematica {
	
	public void rellenarNumeros(Matematica matematica) {
		
		matematica.setNum1(Math.random()*100);
		matematica.setNum2(Math.random()*100);
		
		System.out.println("El primer numero es: " + matematica.getNum1());
		System.out.println("El segundo numero es: " + matematica.getNum2());
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("El numero mayor es: " + devolverMayor(matematica));
		System.out.println("");
		System.out.println("El resultado de la potencia es: " + calcularPotencia(matematica));
		System.out.println("");
		System.out.println("El resultado de la raiz cuadrada del menor es: " + calcularRaiz(matematica));
		
	}

	private double devolverMayor(Matematica matematica) {
		double mayor;
		if (matematica.getNum1() > matematica.getNum2()) {
			mayor = matematica.getNum1();
		} else {
			mayor = matematica.getNum2();
		}
		
		return mayor;
	}
	
	private double calcularPotencia(Matematica matematica) {
		int base, potencia;
		if (devolverMayor(matematica) == matematica.getNum1()) {
			base = (int)matematica.getNum1();
			potencia = (int)matematica.getNum2();
		} else {
			base = (int)matematica.getNum2();
			potencia = (int)matematica.getNum1();
		}
		
		return Math.pow(base, potencia);
	}

	private double calcularRaiz(Matematica matematica) {
		double menor;
		if (matematica.getNum1() < matematica.getNum2()) {
			menor = matematica.getNum1();
		} else {
			menor = matematica.getNum2();
		}
		
		return (Math.sqrt(menor));
	}
	

}
