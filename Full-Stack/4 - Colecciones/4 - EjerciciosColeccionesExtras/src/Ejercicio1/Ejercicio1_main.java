/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/

package Ejercicio1;

import Ejercicio1.Service.ServiceAlumnos;
import java.util.Scanner;

public class Ejercicio1_main {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		ServiceAlumnos srvAlumnos = new ServiceAlumnos();
		
		srvAlumnos.menu();
		
	}
		
}
