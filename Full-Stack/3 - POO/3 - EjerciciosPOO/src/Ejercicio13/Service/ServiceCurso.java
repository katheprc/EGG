package Ejercicio13.Service;

import Ejercicio13.Entity.Curso;
import java.util.Scanner;

public class ServiceCurso {
	
	Scanner leer = new Scanner(System.in);
	
	public Curso crearCurso(Curso curso){
		
		System.out.println(" ");
		System.out.println("Ingrese nombre del curso: ");
		curso.setNombreCurso(leer.nextLine());
		
		System.out.println(" ");
		System.out.println("Ingrese turno: ");
		curso.setTurno(leer.nextLine());
		
		System.out.println(" ");
		System.out.println("Ingrese nombres de los alumnos: ");
		cargarAlumnos(curso);
		
		System.out.println(" ");
		System.out.println("Ingrese cantidad de horas por dia: ");
		curso.setCantHorasxDia(leer.nextInt());
		
		System.out.println(" ");
		System.out.println("Ingrese cantidad de dias por semana: ");
		curso.setCantDiasxSemana(leer.nextInt());
		
		System.out.println("");
		System.out.println("Ingrese precio por hora: ");
		curso.setPrecioxHora(leer.nextInt());
		
		System.out.println(" ");
		calcularGananciaSemana(curso);
		
		return curso;
	
	}
	
	public void cargarAlumnos (Curso curso) {
		
		for (int aux = 0; aux < curso.getAlumnos().length; aux++) {
			
			System.out.println("Alumno " + (aux+1));
			curso.setAlumnos(leer.nextLine(), aux);
			
		}
		
	}
	
	public void calcularGananciaSemana(Curso curso) {

		curso.setPrecio(curso.getCantHorasxDia() * curso.getPrecioxHora() * Integer.valueOf(curso.getAlumnos().length) * curso.getCantDiasxSemana());
		
		System.out.println("El precio a cobrar por mes para el curso " + curso.getNombreCurso() + " es: " + curso.getPrecio());
		
		
	}
}
