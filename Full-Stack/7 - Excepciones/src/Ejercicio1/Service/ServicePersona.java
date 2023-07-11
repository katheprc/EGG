package Ejercicio1.Service;

import java.util.Scanner;
import Ejercicio1.Entity.Persona;

public class ServicePersona {

	Scanner leer = new Scanner(System.in);

	public Persona crearPersona(Persona persona) {
		boolean verif;
		System.out.println("Ingrese su nombre de pila: ");
		persona.setNombre(leer.next());
		System.out.println("Ingrese su edad: ");
		persona.setEdad(leer.nextInt());
		esMayorDeEdad(persona);
		do {
			System.out.println("Ingrese su sexo: masculino, femenino, otro (M/F/O)");
			persona.setSexo(leer.next());
			if (persona.getSexo().equalsIgnoreCase("M") || persona.getSexo().equalsIgnoreCase("F") || persona.getSexo().equalsIgnoreCase("O")) {
				break;
			} else {
				System.out.println("Entrada incorrecta, vuelva a intentarlo");
				verif = true;
			}
		} while (verif);
		
		System.out.println("Ingrese su peso en kilogramos: ");
		persona.setPeso(leer.nextDouble());
		
		System.out.println("Ingrese su altura en metros");
		persona.setAltura(leer.nextDouble());
		
		persona.setResultadoImc(calcularIMC(persona));
		
		return persona;

	}
	
	public int calcularIMC(Persona persona) {
		persona.setImc(persona.getPeso() / (persona.getAltura()*persona.getAltura()));
		if ((persona.getImc() < 20)) {
			return -1;
		} else if ((persona.getImc() >= 20) && persona.getImc() <= 25) {
			return 0;
		} else {
			return 1;
		}
		
	}
	
	public void esMayorDeEdad(Persona persona) {
		
		if (persona.getEdad() >= 18) {
			persona.setEsMayor(true);
		}
		
	}

}
