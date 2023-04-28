/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/

package Ejercicio2;

import Ejercicio2.Entity.Circunferencia;
import Ejercicio2.Service.ServiceCircunferencia;

public class Ejercicio2_main {

	public static void main(String[] args) {
	       
	    ServiceCircunferencia x = new ServiceCircunferencia();
	    Circunferencia y = x.crearCircunferencia();
	        
	    System.out.println("El area de la circubferencia es: " + x.area(y));
	    System.out.println("El perímetro de la circunferencia: " + x.perimetro(y));
	}

}
