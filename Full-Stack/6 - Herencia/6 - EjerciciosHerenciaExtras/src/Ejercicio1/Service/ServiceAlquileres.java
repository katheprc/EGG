package Ejercicio1.Service;

import java.util.*;
import Ejercicio1.Entity.*;

public interface ServiceAlquileres {

	ArrayList<Alquiler> listaAlquileres = new ArrayList<>();

	Scanner leer = new Scanner(System.in);

	public static void menu() {

		int opc;

		do {

			System.out.println("- - - M - E - N - U - - -");
			System.out.println("");
			System.out.println("1 - Crear alquiler");
			System.out.println("2 - Ver alquiler");
			System.out.println("3 - Ver todos los alquileres");
			System.out.println("0 - Salir");
			System.out.println("");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("Ingrese una opción");
			opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:
				crearAlquiler();
				break;
			case 2:
				mostrarAlquiler();
				break;
			case 3:
				mostrarTodo();
				break;
			}

		} while (opc != 0);

	}

	public static void crearAlquiler() {

		Alquiler alquiler = new Alquiler();

		int opc;
		String matricula;
		int eslora;
		int anoFabricacion, numMastiles = 0, potenciaEnCV = 0, numCamarotes = 0;

		do {

			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("1 - Velero");
			System.out.println("2 - A motor");
			System.out.println("3 - Yate de lujo");
			System.out.println("");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("Ingrese una opción");

			opc = leer.nextInt();
			leer.nextLine();

		} while (opc < 1 || opc > 3);

		System.out.println("Ingrese matricula: ");
		matricula = leer.nextLine();
		System.out.println("Ingrese eslora: ");
		eslora = leer.nextInt(); leer.nextLine();
		System.out.println("Ingrese el año de fabricación: (AAAA)");
		anoFabricacion = leer.nextInt();
		leer.nextLine();

		switch (opc) {
		case 1:
			System.out.println("Ingrese la cantidad de mástiles: ");
			numMastiles = leer.nextInt();
			leer.nextLine();
			alquiler.setBarco("velero", matricula, eslora, anoFabricacion, numMastiles, potenciaEnCV, numCamarotes);
			break;
		case 2:
			System.out.println("Ingrese potencia en CV: ");
			potenciaEnCV = leer.nextInt(); leer.nextLine();
			alquiler.setBarco("amotor", matricula, eslora, anoFabricacion, numMastiles, potenciaEnCV, numCamarotes);
			break;
		case 3:
			System.out.println("Ingrese potencia en CV: ");
			potenciaEnCV = leer.nextInt(); leer.nextLine();
			System.out.println("Ingrese cantidad de camarotes: ");
			numCamarotes = leer.nextInt(); leer.nextLine();
			alquiler.setBarco("yatelujo", matricula, eslora, anoFabricacion, numMastiles, potenciaEnCV, numCamarotes);
			break;
		}

		System.out.println("Ingrese nombre del titular del alquiler: ");
		alquiler.setNombre(leer.nextLine());

		System.out.println("Ingrese dni del titular: ");
		alquiler.setDni(leer.nextLine());

		System.out.println("Ingrese posición de amarre: (entero)");
		alquiler.setPosAmarre(leer.nextInt());
		leer.nextLine();

		do {
			
			int mes, ano, dia;

			do {

				System.out.println("Ingrese n° del mes de devolución: ");
				mes = leer.nextInt();
				leer.nextLine();

			} while (mes > 12 || mes < 1);

			boolean verificado = false;

			do {

				System.out.println("Ingrese n° del dia de devolución: ");
				dia = leer.nextInt();
				leer.nextLine();

				if (mes == 2) {

					if (dia > 28) {
						System.out.println("Febrero tiene 28 dias compi");
					} else {
						verificado = true;
					}

				} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

					if (dia > 30) {
						System.out.println("El mes " + mes + "tiene 30 dias compi");
					} else {
						verificado = true;
					}

				} else {

					if (dia > 31) {
						System.out.println("Bueno flashaste. Como un mes va a tener más de 31 dias?");
					} else {
						verificado = true;
					}

				}

			} while (verificado == false);

			do {

				System.out.println("Ingrese el año: ");
				ano = leer.nextInt();
				leer.nextLine();

			} while (ano < 2023);
			
			@SuppressWarnings("deprecation")
			Date date = new Date(ano-1900, mes-1, dia+1);

			if (alquiler.getFechaAlq().compareTo(date) <= 0) {
				alquiler.setFechaDev(ano, mes, dia);
				System.out.println("total " + alquiler.getDiasTotal());
				break;
			} else {
				System.out.println("Fecha de devolucion debe ser posterior a la fecha de alquiler (hoy)");
			}
			
		} while (true);
		
		
		
		listaAlquileres.add(alquiler);

	}

	public static void mostrarAlquiler() {
		
		System.out.println("Ingrese el DNI de la persona a buscar su alquiler: ");
		
		String dni = leer.nextLine();
		
		boolean encontrado = false;
		
		for (Alquiler alquiler : listaAlquileres) {
			
			if (alquiler.getDni().equalsIgnoreCase(dni)) {
				System.out.println(alquiler.toString());
				encontrado = true;
			}
			
		}
		
		if (encontrado == false) {
			
			System.out.println("Intente nuevamente, DNI no encontrado.");
		
		}
		
	}

	public static void mostrarTodo() {
		
		for (Alquiler alquiler : listaAlquileres) {
			
			System.out.println(alquiler.toString());
			
		}
	}
}
