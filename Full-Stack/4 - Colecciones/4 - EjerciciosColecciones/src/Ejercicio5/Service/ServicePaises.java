package Ejercicio5.Service;

import java.util.*;

public class ServicePaises {
		
	Scanner leer = new Scanner(System.in);
	TreeSet<String> paises = new TreeSet<>();
	
	public void guardarPaises() {
		
		String opc, nombre;
		
		do {
			
			System.out.println("Ingrese el nombre de un país");
			nombre = leer.nextLine().toUpperCase();
            paises.add(nombre);
            
            System.out.println("");System.out.println("");System.out.println("");
            
            do {
            	
                System.out.println("¿Continuar ingresando? (S/N)");
                opc = leer.nextLine().toUpperCase();
                
                if (opc.equals("N") || opc.equals("S")) {
                    break;
                }
                
            } while (true);
            
        } while (opc.equals("S"));
		
		mostrarPaises();
		eliminarPaises();
		
	}
	
	public void mostrarPaises() {
		
		System.out.println("");System.out.println("");System.out.println("");
		
		for (String pais : paises) {
			System.out.println(pais);
		}
		
	}
	
	public void eliminarPaises() {
		
		System.out.println("");System.out.println("");System.out.println("");
		
		System.out.println("Ingrese el nombre de un pais a eliminar: ");
		String nombre = leer.nextLine().toUpperCase();
//		boolean encontrado = false;
		
//		for (String pais : paises) {
//			if (pais.equals(nombre)) {
				paises.remove(nombre);
//				encontrado = true;
//			}
//		}
		
//		if (encontrado == false) {
//			System.out.println("");
//			System.out.println("El pais no fue encontrado :(");
//		}
		
		mostrarPaises();
		
	}
	
}
