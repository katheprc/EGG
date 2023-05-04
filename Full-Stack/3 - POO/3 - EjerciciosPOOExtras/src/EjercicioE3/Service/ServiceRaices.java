package EjercicioE3.Service;

import EjercicioE3.Entity.Raices;
import java.util.Scanner;

public class ServiceRaices {
	
	Scanner leer = new Scanner(System.in);
	
	public double getDiscriminante(Raices raices) {
		
		double discriminante, a = raices.getA(), b = raices.getB(), c = raices.getC();
		
		discriminante = (b*b)-(4*a*c);
		
		return discriminante;
		
	}
	
	public boolean tieneRaices(double discriminante, Raices raices) {
		
		boolean raiz = false;
		
		if (discriminante > 0) {
			raiz = true;
		}
				
		return raiz;
		
	}
	
	public boolean tieneRaiz(double discriminante, Raices raices) {

		boolean raiz = false;

		if (discriminante == 0) {
			raiz = true;
		}
		
		return raiz;
		
	}
	
	public void obtenerRaices (Raices raices) {
		
		double discriminante = getDiscriminante(raices);
		
		if (tieneRaices(discriminante, raices)) {
			
			double r1 = ((raices.getB()*(-1)) - Math.sqrt(discriminante)) / (2 * raices.getA());
			double r2 = ((raices.getB()*(-1)) + Math.sqrt(discriminante)) /( 2 * raices.getA());
			System.out.println("Las dos raices son: " + r1 + " y " + r2);
		
		} else {
			System.out.println("No existen dos raices");
		}
		
	}
	
	public void obtenerRaiz (Raices raices) {
		
		double discriminante = getDiscriminante(raices);
		
		if (tieneRaiz(discriminante, raices)) {
			
			discriminante = ((raices.getB()*(-1)) + Math.sqrt(discriminante)) / (2 * raices.getA());
			System.out.println("La raiz es: " + discriminante);
		
		} else {
			System.out.println("No existe una unica raiz");
		}
		
	}
	
	public void calcular(Raices raices) {
		
		System.out.println("Ingrese a: ");
		raices.setA(leer.nextDouble());
		
		System.out.println("Ingrese b: ");
		raices.setB(leer.nextDouble());
		
		System.out.println("Ingrese c: ");
		raices.setC(leer.nextDouble());
		
		obtenerRaices(raices);
		obtenerRaiz(raices);
		
	}
	
}
