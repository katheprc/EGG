package Ejercicio2.Service;

import java.util.Scanner;

import Ejercicio2.Entity.Circunferencia;

public class ServiceCircunferencia {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        Circunferencia x = new Circunferencia();
        System.out.println("Ingrese radio");
        x.setRadio(leer.nextDouble());
        return x;
    }

    public double area(Circunferencia x) {
        
        double area = Math.PI * (x.getRadio() * x.getRadio());
        return area;

    }

    public double perimetro(Circunferencia x) {

        double perimetro = 2 * Math.PI * x.getRadio();
        return perimetro;

    }
}
