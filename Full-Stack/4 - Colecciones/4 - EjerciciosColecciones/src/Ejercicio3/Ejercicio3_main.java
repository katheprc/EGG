/* Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.*/

package Ejercicio3;

import java.util.ArrayList;

import Ejercicio3.Entity.*;
import Ejercicio3.Service.*;
import java.util.*;

public class Ejercicio3_main {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		ServiceAlumnos srvAlumnos = new ServiceAlumnos();
		ArrayList<Alumnos> lista = new ArrayList<Alumnos>();
		String nombre, opc;
		
		do {
				
			lista.add(srvAlumnos.crearAlumnos());
			
			do {
				
				System.out.println("¿Continuar ingresando? (S/N)");
				opc = leer.nextLine().toUpperCase();
				
				if (opc.equals("N") || opc.equals("S")) {
					break;					
				}
			
			} while (true);	


		} while (opc.equals("S"));
		
		do {
			
			System.out.println("Ingrese nombre del alumno para saber su nota final: ");
			nombre = leer.nextLine();
			
			System.out.println("");
		
			System.out.println("La nota final del alumno es: " + srvAlumnos.notaFinal(lista, nombre));
			
			System.out.println(""); System.out.println("");
			
			do {
				
				System.out.println("¿Continuar con otro alumno? (S/N)");
				opc = leer.nextLine().toUpperCase();
					
				if (opc.equals("N") || opc.equals("S")) {
					break;					
				}
			} while (true);	


		} while (opc.equals("S"));
		
		for (Alumnos alumno : lista) {
			System.out.println(alumno.toString());
		}
		
		leer.close();
	}

}
