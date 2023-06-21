package Ejercicio2.Entity;

import java.util.*;

public class Cine {

	ArrayList<Pelicula> listaPelis = new ArrayList<>();

	ArrayList<Sala> listaSalas = new ArrayList<>();
	
	Scanner leer = new Scanner(System.in);
	
	int precio = 100;

	public Cine() {
		
		adicionarSala();
		adicionarPeli();
		
	}
	
	public int getPrecio() {
		return precio;
	}

	public void adicionarSala() {

		for (int aux = 0; aux < 3; aux++) {

			listaSalas.add(crearSala());

		}

	}

	public Sala crearSala() {

		Sala sala = new Sala();

		sala.crearSala();

		return sala;
	}

	public void adicionarPeli() {

		Pelicula pelicula = new Pelicula("LA MONJA", "C. HARDY", "96", 13);
		listaPelis.add(pelicula);

		for (Sala sala : listaSalas) {
			if (sala.getPelicula() == null) {
				sala.setPelicula(pelicula);
				break;
			}
		}

		Pelicula pelicula2 = new Pelicula("EL CONJURO", "J. WAN", "112", 16);
		listaPelis.add(pelicula2);

		for (Sala sala : listaSalas) {
			if (sala.getPelicula() == null) {
				sala.setPelicula(pelicula2);
				break;
			}
		}

		Pelicula pelicula3 = new Pelicula("ANNABELLE", "J. LEONETTI", "98", 18);
		listaPelis.add(pelicula3);

		for (Sala sala : listaSalas) {
			if (sala.getPelicula() == null) {
				sala.setPelicula(pelicula3);
				break;
			}
		}

	}

	public void verListaPelis() {

		for (Pelicula pelicula : listaPelis) {

			System.out.println("- - - - - - - - - - - - - - - - -");
			System.out.println("Pelicula: " + pelicula.getTitulo());
			System.out.println("Director: " + pelicula.getDirector());
			System.out.println("Duración: " + pelicula.getDuración());
			System.out.println("Edad mínima: " + pelicula.getEdadmin());

			for (Sala sala : listaSalas) {
				if (sala.getPelicula() == pelicula) {
					System.out.println("Sala: " + (listaSalas.indexOf(sala) + 1));
				}
			}

			System.out.println("- - - - - - - - - - - - - - - - -");

		}

	}

	public void verSalas() {

		for (Sala sala : listaSalas) {

			System.out.println("- - - - - - - - - - - - - - - - -");
			System.out
					.println("Sala: " + (listaSalas.indexOf(sala) + 1) + " (" + sala.getPelicula().getTitulo() + ") ");
			sala.mostrarSala();
			System.out.println("- - - - - - - - - - - - - - - - -");

		}

	}

	public int verUnaSala() {
		
		verListaPelis();
		
		System.out.println("Ingrese el nombre de la película");
		String nombre = leer.nextLine().toUpperCase();
		boolean encontrado = false;
		
		for (Sala sala : listaSalas) {

			if (sala.getPelicula().getTitulo().equals(nombre)) {
				System.out.println("- - - - - - - - - - - - - - - - -");
				System.out.println("Sala: " + (listaSalas.indexOf(sala) + 1) + " (" + sala.getPelicula().getTitulo() + ") ");
				sala.mostrarSala();
				System.out.println("- - - - - - - - - - - - - - - - -");
				encontrado = true;
				return listaSalas.indexOf(sala);
			}

		}
		
		if (encontrado == false) {
			System.out.println("Película no encontrada.");
		}
		
		return -1;

	}
	
	public void ingresarPersona() {
		
		Espectador espectador = new Espectador();
		
		System.out.println("Ingrese el nombre de la persona: ");
		espectador.setNombre(leer.nextLine());
		
		System.out.println("Ingrese edad de la persona: ");
		espectador.setEdad(leer.nextInt()); leer.nextLine();
		
		System.out.println("Ingrese dinero de la persona: ");
		espectador.setDinero(leer.nextInt()); leer.nextLine();
		
		int sala1 = verUnaSala();
		
		if (sala1 != -1) {
			if (espectador.getEdad() >= listaSalas.get(sala1).getPelicula().getEdadmin() && espectador.getDinero() >= precio) {
				listaSalas.get(sala1).asignarAsiento();
			} else {
				System.out.println("La persona no tiene el dinero o la edad suficiente");
			}
		} 
		
	}
}
