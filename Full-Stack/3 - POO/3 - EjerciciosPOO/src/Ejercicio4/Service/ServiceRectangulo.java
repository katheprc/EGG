package Ejercicio4.Service;

import java.util.Scanner;

import Ejercicio4.Entity.Rectangulo;

public class ServiceRectangulo {

	Scanner leer = new Scanner(System.in);

	// Metodos
	public Rectangulo crearRectangulo() {

		Rectangulo rec = new Rectangulo();
		
		System.out.println("Ingrese altura del rectangulo");
		rec.setAltura(leer.nextDouble());
		
		System.out.println("Ingrese Base del rectangulo");
		rec.setBase(leer.nextDouble());
		
		return rec;

	}
	
	public double superficie (Rectangulo rec) {
		return (rec.getAltura() * rec.getBase());
	}
	
	public double perimetro (Rectangulo rec) {
		return ((rec.getAltura() + rec.getBase())/2);
	}
	
    public void dibujarRectangulo(Rectangulo rec) {

        for (int aux = 0; aux < rec.getAltura() ; aux++) {
            for (int aux2 = 0; aux2 < rec.getBase(); aux2++) {
                if (aux == 0 || aux == rec.getAltura() - 1 || aux2 == 0 || aux2 == rec.getBase() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }

}
