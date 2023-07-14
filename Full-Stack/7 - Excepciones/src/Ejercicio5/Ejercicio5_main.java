/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.*/

package Ejercicio5;

import java.util.*;

public class Ejercicio5_main {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int num = ((int)((Math.random()*500)+1)), intentos = 5, adivinado;
		boolean gana = false;
		
		do {
		
			try {
				System.out.println("Adivine el número del 1 al 500: ");
				adivinado = leer.nextInt();
				
				if (adivinado == num) {
					System.out.println("GANASTE! ♥");
					gana = true;
				} else if (adivinado > num) {
					intentos--;
					System.out.println("El número a adivinar es menor que " + adivinado);
				} else if (adivinado < num){
					intentos--;
					System.out.println("El numero a adivinar es mayor que " + adivinado);
				}
				
				if (intentos == 0) {
					System.out.println(""); System.out.println("");
					System.out.println("PERDISTE, TE QUEDASTE SIN INTENTOS :(. El número era: " + num);
					gana = true;
				}
				
			}catch(Exception e) {
				System.out.println("Mensaje: " + e.getMessage());
				leer.nextLine();
				intentos--;
			}
			
			System.out.println("Intentos restantes:" + intentos);
			System.out.println(""); System.out.println("");
			
		}while(!gana);
		
		leer.close();
		
	}
	
}	
