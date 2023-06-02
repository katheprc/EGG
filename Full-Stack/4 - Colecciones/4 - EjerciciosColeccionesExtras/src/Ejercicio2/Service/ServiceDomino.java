package Ejercicio2.Service;

import Ejercicio2.Entity.*;
import java.util.*;

public class ServiceDomino {

	HashMap<Integer, Ficha> lista = new HashMap<Integer, Ficha>();
	ArrayList<Ficha> mano = new ArrayList<Ficha>();
	LinkedList<Ficha> mesa = new LinkedList<Ficha>();

	public void juego() {

		crearLista();
		crearManoyMesa();
		
		System.out.print("mano (" + mano.size() + ") ");
		for (Ficha ficha : mano) {
			System.out.print(ficha.toString() + " ");
		}

		System.out.println(""); System.out.println("");
		
		System.out.print("mesa (" + mesa.size() + ") ");
		for (Ficha ficha : mesa) {
			System.out.print(ficha.toString() + " ");
		}
		
		System.out.println(""); System.out.println(""); System.out.println(""); System.out.println("");
		int respuesta;
		do {
			respuesta = tiradas();
			if (respuesta == 1) {
				System.out.print("mano (" + mano.size() + ") ");
				for (Ficha ficha : mano) {
					System.out.print(ficha.toString() + " ");
				}

				System.out.println(""); System.out.println("");
				
				System.out.print("mesa (" + mesa.size() + ") ");
				for (Ficha ficha : mesa) {
					System.out.print(ficha.toString() + " ");
				}
				
				System.out.println(""); System.out.println(""); System.out.println(""); System.out.println("");
			}
			
			if (mano.size() == 0) {
				System.out.println("GANASTE!");
				respuesta = 2;
			}
			
		} while (mano.size() > 0 && respuesta != 2);
		
		/* codigo auxiliar para mostrar que se crean bien la mesa y la mano

		for (Ficha ficha : mano) {
			System.out.print(ficha.toString() + " ");
		}

		System.out.println("");
		System.out.println("");

		for (Ficha ficha : mesa) {
			System.out.print(ficha.toString() + " ");
		} */

	}

	
	public void crearLista() {

		int cod = 1;

		for (int aux = 0; aux <= 6; aux++) {

			for (int aux2 = aux; aux2 <= 6; aux2++) {

				lista.put(cod, crearFicha(aux, aux2));
				cod++;

			}

		}

		/*
		 * codigo auxiliar para mostrar que se crean bien las fichas al derecho y al
		 * reves
		 * 
		 * for (Ficha ficha : lista.values()) { System.out.println(ficha.toString()); }
		 * 
		 * System.out.println(""); System.out.println("");
		 * 
		 * for (Ficha ficha : lista.values()) {
		 * System.out.println(ficha.toStringAlReves()); }
		 */

	}

	
	public Ficha crearFicha(int aux, int aux2) {

		Ficha ficha = new Ficha();

		ficha.setLadoA(aux);
		ficha.setLadoB(aux2);

		return ficha;

	}

	
	public void crearManoyMesa() {

		int random = (int) (Math.random() * 28 + 1);
		mesa.add(lista.get(random));
		lista.remove(random);

		for (Ficha ficha : lista.values()) {

			mano.add(ficha);

		}

	}

	
	public int random() {
		
		return (int)(Math.random() * mano.size() );
		
	}
	
	public int tiradas() {

		int random =  random();
		
		if (mano.get(random).getLadoA() == mesa.getLast().getLadoB()) { // si lado a(mano) es igual al lado b(mesa) ultima ficha
				mesa.addLast(mano.get(random));
				mano.remove(random);
				return 1;
		} else if (mano.get(random).getLadoB() == mesa.getLast().getLadoB()) { // si lado b(mano) es igual al lado b(mesa) ultima ficha
				mano.get(random).AlReves();
				mesa.addLast(mano.get(random));
				mano.remove(random);
				return 1;
		} else if (mano.get(random).getLadoA() == mesa.getFirst().getLadoA()) { // si lado a(mano) es igual al lado a(mesa) primera ficha
				mano.get(random).AlReves();
				mesa.addFirst(mano.get(random));
				mano.remove(random);
				return 1;
		} else if (mano.get(random).getLadoB() == mesa.getFirst().getLadoA()) { // si lado b(mano) es igual al lado a(mesa) ultima ficha
				mesa.addFirst(mano.get(random));
				mano.remove(random);
				return 1;
		} else {
			return 0;
		}
		
	}

}
