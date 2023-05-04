package EjercicioE6;

import EjercicioE6.Entity.*;
import EjercicioE6.Service.*;

public class EjercicioE6_main {
	
	public static void main(String[] args) {

		ServiceAhorcado srvAhorcado = new ServiceAhorcado();
		Ahorcado ahorcado = new Ahorcado();
		
		srvAhorcado.Juego(ahorcado);
		
	}
	
}
