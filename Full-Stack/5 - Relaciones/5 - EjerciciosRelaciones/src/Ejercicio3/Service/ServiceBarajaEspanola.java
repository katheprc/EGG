package Ejercicio3.Service;

import java.util.*;
import Ejercicio3.Entity.*;

public class ServiceBarajaEspanola {

	ArrayList<Carta> baraja = new ArrayList<>();
	ArrayList<Carta> baraja2 = new ArrayList<>();
	ArrayList<Carta> mano = new ArrayList<>();
	Scanner leer = new Scanner(System.in);

	public void menu() {

		crearBaraja();
		baraja2.addAll(baraja);
		do {
			System.out.println("");
			System.out.println("");
			System.out.println("- - - M - E - N - Ú - - -");
			System.out.println("");
			System.out.println("1 - Barajar");
			System.out.println("2 - Siguiente Carta");
			System.out.println("3 - Mostrar cantidad de cartas Disponibles");
			System.out.println("4 - Dar x cantidad de cartas");
			System.out.println("5 - Mostrar cartas ya dadas");
			System.out.println("6 - Mostrar baraja completa");
			System.out.println("0 - Salir");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.print("Ingrese su opción: ");
			int opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:
				barajar();
				break;
			case 2:
				siguienteCarta(); cartasMonton();
				break;
			case 3:
				cartasDisponibles();
				break;
			case 4:
				darCartas();
				break;
			case 5:
				cartasMonton();
				break;
			case 6:
				mostrarBaraja();
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no válida");
			}

			if (opc == 0) {
				break;
			}

		} while (true);

	}

	public void crearBaraja() {

		for (int aux = 1; aux <= 4; aux++) {

			for (int aux2 = 1; aux2 <= 12; aux2++) {

				if (aux2 != 8 && aux2 != 9) {

					switch (aux) {
					case 1:
						crearCarta(aux2, "E");
						break;
					case 2:
						crearCarta(aux2, "O");
						break;
					case 3:
						crearCarta(aux2, "C");
						break;
					case 4:
						crearCarta(aux2, "B");
						break;
					}

				}

			}
		}

	}

	public void crearCarta(int num, String palo) {

		Carta carta = new Carta();

		carta.setNumero(num);
		carta.setPalo(palo);

		baraja.add(carta);

	}

	public void mostrarBaraja() {
		System.out.println("Baraja: ");
		for (Carta carta : baraja2) {
			System.out.print(carta.toString());
		}
	}

	public void barajar() {

		Collections.shuffle(baraja2);
		System.out.println("Cartas mezcladas!");
		System.out.println("");

	}

	public void siguienteCarta() {

		if (baraja2 == null) {
			System.out.println("No hay más cartas");
		} else {
			mano.add(baraja2.get(0));
			baraja2.remove(0);
		}
	}

	public void cartasDisponibles() {
		System.out.println("Cartas disponibles: " + baraja2.size());
	}

	public void darCartas() {
		System.out.println("Ingrese la cantidad de cartas deseadas: ");
		int num = leer.nextInt();
		if (num > baraja2.size()) {
			System.out.println("No hay suficientes cartas");
			cartasDisponibles();
		} else {
			for (int aux = 0; aux < num; aux++) {
				siguienteCarta();
			}
		}
		cartasMonton();
	}

	public void cartasMonton() {
		if (mano == null) {
			System.out.println("No hay cartas en el montón");
		} else {
			System.out.print("Montón: ");
			for (Carta carta : mano) {
				System.out.print(carta.toString());
			}
		}
	}

}
