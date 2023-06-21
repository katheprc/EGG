package Ejercicio2.Entity;

public class Sala {

	Asiento[][] sala = new Asiento[8][6];
	
	Pelicula pelicula;
	
	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public void crearSala() {

		for (int aux = 7; aux >= 0; aux--) { 						// filas

			for (int aux2 = 0; aux2 < 6; aux2++) { 					// columnas

				sala[aux][aux2] = crearAsiento(aux + 1, aux2 + 1);

			}

		}

	}

	public Asiento crearAsiento(int fila, int columna) {

		Asiento asiento = new Asiento(fila, columna);

		return asiento;

	}

	public void mostrarSala() {

		for (int aux = 7; aux >= 0; aux--) { 						// filas

			for (int aux2 = 0; aux2 < 6; aux2++) { 					// columnas

				System.out.print(sala[aux][aux2].toString() + "| ");

			}

			System.out.println("");

		}

	}

	public void vaciarSala() {
		
		for (int aux = 7; aux >= 0; aux--) { 						// filas

			for (int aux2 = 0; aux2 < 6; aux2++) { 					// columnas
				
				sala[aux][aux2].setOcupado(false);

			}

		}
	}
	
	public void asignarAsiento() {
		
		int aux = (int) (Math.random()*7)+1;
		
		int aux2 = (int) (Math.random()*5)+1; 
		
		System.out.println("Asiento asignado en: " + sala[aux][aux2].fila + sala[aux][aux2].columna);
		
		sala[aux][aux2].setOcupado(true);
		
	}
}
