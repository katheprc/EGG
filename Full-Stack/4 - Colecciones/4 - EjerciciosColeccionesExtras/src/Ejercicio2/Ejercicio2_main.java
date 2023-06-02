/*Implementa un clase Ficha (de dominó) con su constructor y sus getters, con un toString() (que
imprima el “seis-zero” como “6:0|” y con un método llamado “Ficha girarFicha()” que gire la
ficha (el “6:0|” pasaría a ser “0:6|”). Implementa también el método “boolean esUnDoble()”.
A) Ahora implementa con ArrayLists una clase que genere todas las fichas desde el doble 0 al
doble MAX_NUM. Después, el programa, actuando como si fuera un robot jugando al solitario,
empezará por tirar el doble más grande e irá tirando fichas (las jugadas tienen que ser legales)
hasta que haya tirado todas sus fichas (de su “mano” a la “mesa) o ya no pueda tirar ninguna
ficha más. Tu ejecución puede ser diferente de las de los ejemplos dependiendo de cómo lo
implementes.
B) No obstante, como estamos todo el rato eliminando fichas de la “mano” y la mitad de las
veces estás insertando fichas al principio de la “pila” sería más eficiente implementarlas con
LinkedList.
Haz por tanto esta re-implementación con LinkedList.
Pista: Acuérdate que LinkedList incluye métodos como addFirst(), addLast(), getFirst(), getLast()
que ArrayList no tiene.
Nota: Como en la “mano” no importa en que posición esté cada elemento, también podría ser
un HashSet.
Pista: ¿Si te peta al eliminar una ficha de la “mano” con un
java.util.ConcurrentModificationException que tienes que cambiar en como recorres la List y/o
en como eliminas el elemento?
*/

package Ejercicio2;

import Ejercicio2.Service.*;

public class Ejercicio2_main {

	public static void main(String[] args) {
		
		ServiceDomino srvDomino = new ServiceDomino();
		srvDomino.juego();
		
	}

}
