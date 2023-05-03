/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/

package Ejercicio7;

import Ejercicio7.Service.ServicePersona;
import Ejercicio7.Entity.Persona;

public class Ejercicio7_main {

	public static void main(String[] args) {

		ServicePersona srvPersona = new ServicePersona();
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		Persona persona4 = new Persona();
		int auxMayor = 0;
		int auxSobre = 0;
		int auxBajo = 0;
		int auxIdeal = 0;
		
		for (int aux = 1 ; aux < 5; aux++)  {
			
			System.out.println("Persona " + aux);
			
			switch (aux) {
				case 1: 
					srvPersona.crearPersona(persona1);
					if (persona1.getEsMayor() == true) {
						auxMayor += 1;
					}
					if (persona1.getResultadoImc() == -1) {
						auxBajo +=1;
					} else if (persona1.getResultadoImc() == 0) {
						auxIdeal +=1;
					} else {
						auxSobre +=1;
					}
					break;
				case 2: 
					srvPersona.crearPersona(persona2);
					if (persona2.getEsMayor() == true) {
						auxMayor += 1;
					}
					if (persona2.getResultadoImc() == -1) {
						auxBajo +=1;
					} else if (persona2.getResultadoImc() == 0) {
						auxIdeal +=1;
					} else {
						auxSobre +=1;
					}
					break;
				case 3: 
					srvPersona.crearPersona(persona3);
					if (persona3.getEsMayor() == true) {
						auxMayor += 1;
					}
					if (persona3.getResultadoImc() == -1) {
						auxBajo +=1;
					} else if (persona3.getResultadoImc() == 0) {
						auxIdeal +=1;
					} else {
						auxSobre +=1;
					}
					break;
				case 4: 
					srvPersona.crearPersona(persona4);
					if (persona4.getEsMayor() == true) {
						auxMayor += 1;
					}
					if (persona4.getResultadoImc() == -1) {
						auxBajo +=1;
					} else if (persona4.getResultadoImc() == 0) {
						auxIdeal +=1;
					} else {
						auxSobre +=1;
					}
					break;
			}
			
			
			
		}
		
		for (int aux = 1 ; aux < 5; aux++)  {
			
			System.out.println("Persona " + aux);
			System.out.println("");
			
			switch (aux) {
				case 1: 
					System.out.println("Nombre: " + persona1.getNombre());
					System.out.println("Edad:   " + persona1.getEdad());
					System.out.println("Peso:   " + persona1.getPeso());
					System.out.println("Altura: " + persona1.getAltura());
					System.out.println("Sexo:   " + persona1.getSexo());
					System.out.println("IMC:    " + persona1.getImc());
					break;
				case 2: 
					System.out.println("Nombre: " + persona2.getNombre());
					System.out.println("Edad:   " + persona2.getEdad());
					System.out.println("Peso:   " + persona2.getPeso());
					System.out.println("Altura: " + persona2.getAltura());
					System.out.println("Sexo:   " + persona2.getSexo());
					System.out.println("IMC:    " + persona2.getImc());
					break;
				case 3: 
					System.out.println("Nombre: " + persona3.getNombre());
					System.out.println("Edad:   " + persona3.getEdad());
					System.out.println("Peso:   " + persona3.getPeso());
					System.out.println("Altura: " + persona3.getAltura());
					System.out.println("Sexo:   " + persona3.getSexo());
					System.out.println("IMC:    " + persona3.getImc());
					break;
				case 4: 
					System.out.println("Nombre: " + persona4.getNombre());
					System.out.println("Edad:   " + persona4.getEdad());
					System.out.println("Peso:   " + persona4.getPeso());
					System.out.println("Altura: " + persona4.getAltura());
					System.out.println("Sexo:   " + persona4.getSexo());
					System.out.println("IMC:    " + persona4.getImc());
					break;
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
		}
		
		System.out.println("Porcentaje de personas con sobrepeso: " + (auxSobre*100/4) + "% (" + auxSobre + " personas)");
		System.out.println("Porcentaje de personas con peso ideal: " + (auxIdeal*100/4) + "% (" + auxIdeal + " personas)");
		System.out.println("Porcentaje de personas con peso bajo: " + (auxBajo*100/4) + "% (" + auxBajo + " personas)");
		System.out.println("Porcentaje de personas mayores de edad: " + (auxMayor*100/4) + "% (" + auxMayor + " personas)");
		System.out.println("Porcentaje de personas menores de edad:  " + ((4-auxMayor)*100/4) + "% (" + (4-auxMayor) + " personas)");

	}

}
