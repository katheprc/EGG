package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     Libro l1 = new Libro ();
    
        System.out.println("Ingrese nombre del libro");
        l1.titulo =leer.nextLine();
        
        System.out.println("Ingrese autor");
        l1.autor =leer.nextLine();
        
        System.out.println("Ingrese ISBN");
        l1.ISBN =leer.nextLine();
        
        System.out.println("Ingrese cantidad de paginas");
        l1.numeroDePagina =leer.nextInt();
        
        System.out.println(l1);
        
        leer.close();
    }
     
}