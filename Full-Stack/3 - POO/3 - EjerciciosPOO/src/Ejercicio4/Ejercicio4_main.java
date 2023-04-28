/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/

package Ejercicio4;

import Ejercicio4.Entity.Rectangulo;
import Ejercicio4.Service.ServiceRectangulo;

public class Ejercicio4_main {

	public static void main(String[] args) {

		ServiceRectangulo x = new ServiceRectangulo();

		Rectangulo obj = x.crearRectangulo();

		System.out.println("La superficie del rectangulo es: " + x.superficie(obj));

		System.out.println("El perimetro del rectangulo es: " + x.perimetro(obj));

		x.dibujarRectangulo(obj);
	}

}
