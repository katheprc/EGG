package Ejercicio3.Service;

import java.util.*;
import Ejercicio3.Entity.*;

public class ServiceAlumnos {
	
	Scanner leer = new Scanner(System.in);
	
	public Alumnos crearAlumnos() {
							
		Alumnos alumno = new Alumnos();
		ArrayList<Integer> notas = new ArrayList<Integer>();

		System.out.println("Ingrese nombre del alumno: ");
		alumno.setNombre(leer.nextLine());
		
		System.out.println("Ingrese las tres notas del alumno " + alumno.getNombre());
			
		for (int aux = 0; aux < 3 ; aux++) {
			
			notas.add(leer.nextInt());
			
			
		}
		alumno.setNotas(notas);
			
		leer.nextLine();
				
		return alumno;
		
	}
	
	public double notaFinal(ArrayList<Alumnos> lista, String nombre) {
		
		ArrayList<Integer> notas = new ArrayList<Integer>(); 
		
		double notaFinal = 0;
		
		for (Alumnos alumno : lista ) {
			if (alumno.getNombre().equals(nombre)) {
				notas = alumno.getNotas();
				for (Integer nota : notas) {
					notaFinal = notaFinal + nota;
				}
			}
		}
		
		notaFinal = notaFinal / 3;
		
		
		return notaFinal;
		
	}
	
}
