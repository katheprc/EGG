/*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.*/

package EjercicioE1;

import EjercicioE1.Entity.Cancion;
import EjercicioE1.Service.ServiceCancion;

public class EjercicioE1_main {

	public static void main(String[] args) {
		
		ServiceCancion srvCancion = new ServiceCancion();
		Cancion cancion = new Cancion();
		
		srvCancion.crearCancion(cancion);
		
	}
	
}
