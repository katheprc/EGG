package Ejercicio12.Service;

import Ejercicio12.Entity.Persona;
import java.util.Scanner;

@SuppressWarnings("deprecation")
public class ServicePersona {

   Scanner leer = new Scanner(System.in);

   public void crearPersona(Persona persona){
   
     System.out.println("Ingrese su nombre: ");
     persona.setNombre(leer.nextLine());
     
     System.out.println("Ingrese su año de nacimiento: ");
     persona.setAno(leer.nextInt());
     
     System.out.println("Ingrese su mes de nacimiento: ");
     persona.setMes(leer.nextInt());
     
     System.out.println("Ingrese su dia de nacimiento: ");
     persona.setDia(leer.nextInt());
     
     persona.setFecha(persona.getAno(), persona.getMes(), persona.getDia());
     
     System.out.println("La edad de la persona es: " + calcularEdad(persona));
     
    if (menorQue(persona)) {
    	System.out.println("La persona es menor");
    } else {
    	System.out.println("La persona es mayor o tienen la misma edad");
    }
    System.out.println("");
    System.out.println("Persona");
     mostrarPersona(persona);
   }
   
   public int calcularEdad(Persona persona) {
	   
	   int edad = ((int)persona.getFechaActual().getYear()+1900) - persona.getAno(); 
	   	   
	   return edad;
   
   }

   public boolean menorQue(Persona persona) {
	   
	   boolean esMenor = false;
	   
	   System.out.println("Ingrese una edad para saber si la persona es mayor o menor");
	   
	   int edad = leer.nextInt(), edadPersona = calcularEdad(persona);
	   
	   if (edadPersona < edad) {
		
		   esMenor = true;
	   
	   } 
	   
	   return esMenor;
   
   }
   
   public void mostrarPersona(Persona persona){
	   
	   System.out.println("Nombre: " + persona.getNombre());
	   
	   System.out.println("Fecha de nacimiento: " + persona.getDia() + "/" + persona.getMes() + "/" + persona.getAno());
   
   }
   
}
