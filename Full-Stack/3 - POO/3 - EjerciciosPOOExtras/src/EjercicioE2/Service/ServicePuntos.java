package EjercicioE2.Service;

import EjercicioE2.Entity.Puntos;
import java.util.Scanner;

public class ServicePuntos {
	
	Scanner leer = new Scanner(System.in);
	
	public void crearPuntos(Puntos puntos) {
		
		System.out.println("Ingrese valor de x1: ");
		puntos.setX1(leer.nextDouble());
		
		System.out.println("Ingrese valor de x2: ");
		puntos.setX2(leer.nextDouble());
		
		System.out.println("Ingrese valor de y1: ");
		puntos.setY1(leer.nextDouble());
		
		System.out.println("Ingrese valor de y2: ");
		puntos.setY2(leer.nextDouble());
		
		calcularPuntos(puntos);
		
	}
	
	public void calcularPuntos (Puntos puntos) {
		
		double x1 = puntos.getX1(), x2 = puntos.getX2(), y1 = puntos.getY1(), y2 = puntos.getY2();
		double result = Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
		
		System.out.println("La distancia entre los puntos es: " + result);
	
	}
	
}
