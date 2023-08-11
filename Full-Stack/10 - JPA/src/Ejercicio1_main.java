import java.util.Scanner;

import Service.*;

public class Ejercicio1_main {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		ServiceLibro srvLibro = new ServiceLibro();

		int opc;

		do {

			System.out.println("- - - M - E - N - U - - -");
			System.out.println("1 - Crear Libro");
			System.out.println("2 - Editar Libro");
			System.out.println("3 - Eliminar Libro");
			System.out.println("0 - Salir");

			System.out.println("Ingrese una opción: ");
			opc = leer.nextInt();
			
			switch(opc) {
			
			case 1: srvLibro.crearLibro(); break;
			case 2: srvLibro.editarLibro(); break;
			case 3: srvLibro.eliminarLibro(); break;
			
			}
			
			
		} while (true);
	}

}
