/*Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver*/

package EjercicioE1;

import EjercicioE1.Entity.Fraccion;
import EjercicioE1.Service.ServiceFraccion;

public class EjercicioE1_main {

	public static void main(String[] args) {
		
		ServiceFraccion srvFraccion = new ServiceFraccion();
		Fraccion fraccion = new Fraccion();
		
		srvFraccion.ingresar(fraccion);
	}
	
}
