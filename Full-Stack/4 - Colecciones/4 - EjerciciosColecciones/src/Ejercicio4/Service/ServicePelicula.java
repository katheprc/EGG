package Ejercicio4.Service;

import Ejercicio4.Entity.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicePelicula {
	
   Scanner leer = new Scanner(System.in);
   
    public Pelicula crearPelicula(){
    	
    	Pelicula pelicula = new Pelicula();
      
        System.out.println("Ingresar título");
        pelicula.setTitulo(leer.nextLine());
        
        System.out.println("Ingrese director");
        pelicula.setDirector(leer.nextLine());
        
        System.out.println("Ingrese duración en horas");
        pelicula.setDuracion(leer.nextDouble());
        
        leer.nextLine();
        
        return pelicula;
        
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas){
    	
        System.out.println("Peliculas");
        
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
    }
       
    public void mostrarPeliculasMayoresHora(ArrayList<Pelicula> peliculas){
    	
        System.out.println("Peliculas mayores a una hora");
        
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getDuracion()>=1){
                System.out.println(pelicula.toString());
            }
        }
        
        System.out.println("");
        
    }
    
    public void ordenarPeliculasDescendente(ArrayList<Pelicula> peliculas){
    	
       
        Collections.sort(peliculas, Pelicula.compararDuracionDescendente);
         System.out.println("Peliculas ordenadas de manera descendente");
         
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("");
        
    }
    
    public void ordenarPeliculasAscendente(ArrayList<Pelicula> peliculas) {
    	
        Collections.sort(peliculas, Pelicula.compararDuracionAscendente);
        System.out.println("Peliculas ordenadas de manera Ascendente");
        
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("");
        
    }
    
     public void ordenarPorTitulo(ArrayList<Pelicula> peliculas) {
    	 
        Collections.sort(peliculas, Pelicula.ordenarPeliculasPorTitulo);
        System.out.println("Peliculas ordenadas por título");
        
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("");
        
    }
     
      public void ordenarPorDirector(ArrayList<Pelicula> peliculas) {
    	  
        Collections.sort(peliculas, Pelicula.ordenarPeliculasPorDirector);
        System.out.println("Peliculas ordenadas por dierctor");
        
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("");
    }
      
    
    
    
    
}
