package EjercicioE5;

import EjercicioE5.Entity.Juego;
import EjercicioE5.Service.ServiceJuego;

public class EjercicioE5_main {

	public static void main(String[] args) {
		
		ServiceJuego srvJuego = new ServiceJuego();
		Juego juego = new Juego();
		
		srvJuego.rellenarMeses(juego);
		
		srvJuego.rellenarRandom(juego);
		
		srvJuego.juego(juego);
		
	}
	
}
