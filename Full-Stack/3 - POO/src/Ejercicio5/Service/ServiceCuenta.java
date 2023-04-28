package Ejercicio5.Service;

import java.util.Scanner;
import Ejercicio5.Entity.Cuenta;

public class ServiceCuenta {

	Scanner leer = new Scanner(System.in);

	public void menu1(Cuenta cta) {

		int opc;

		do {
			System.out.println("- - - M  E  N  Ú - - -");
			System.out.println("");
			System.out.println("Elija la opción deseada: ");
			System.out.println(" ");

			System.out.println("1 - Crear cuenta");

			System.out.println("2 - Iniciar sesion");

			System.out.println("0 - Salir");

			opc = leer.nextInt();

			if (opc == 1) {
				ServiceCuenta srvCta = new ServiceCuenta();
				cta = srvCta.crearCuenta();
			} else if (opc == 2) {
				System.out.println("Ingrese su DNI: ");
				long dni = leer.nextInt();
				if (dni == cta.getDni()) {
					System.out.println("Bienvenido/a " + cta.getNombre() + " " + cta.getApellido());
					System.out.println("");
					menu2(cta);
				} else {
					System.out.println("DNI no pertenece a ninguna cuenta. Intente nuevamente: ");
					menu1(cta);
				}
			} else {
				break;
			}
		} while (true);

	}

	public void menu2(Cuenta cta) {
		int opc = -1;
		ServiceCuenta srvCta = new ServiceCuenta();

		while (opc != 0) {
			System.out.println("");
			System.out.println("");
			System.out.println("- - - M  E  N  Ú - - -");
			System.out.println("");
			System.out.println("Elija la opción deseada: ");
			System.out.println(" ");

			System.out.println("1 - Depósito");

			System.out.println("2 - Extracción");

			System.out.println("3 - Extracción rápida");

			System.out.println("4 - Consultar saldo");

			System.out.println("5 - Consultar datos");

			System.out.println("0 - Salir");

			opc = leer.nextInt();
			if (opc <= 5 && opc != 0) {
				switch (opc) {
				case 1:
					srvCta.ingresar(cta);
					break;
				case 2:
					srvCta.retirar(cta);
					break;
				case 3:
					srvCta.extraccionRapida(cta);
					break;
				case 4:
					srvCta.consultarSaldo(cta);
					break;
				case 5:
					srvCta.consultarDatos(cta);
					break;
				}
			}
		}
	}

	public Cuenta crearCuenta() {

		Cuenta cta = new Cuenta();
		System.out.println("Ingrese su DNI: ");
		cta.setDni(leer.nextLong());
		System.out.println("Ingrese su apellido: ");
		cta.setApellido(leer.next());
		System.out.println();
		System.out.println("Ingrese su nombre: ");
		cta.setNombre(leer.next());
		cta.setNumeroCuenta((int) (Math.random() * 1000));
		cta.setInteres(0);

		return cta;

	}

	public void ingresar(Cuenta cta) {

		System.out.println("Su saldo es: $" + cta.getSaldoActual());
		System.out.println(" ");
		System.out.println("Cantidad de dinero a ingresar: ");
		cta.setSaldoActual(cta.getSaldoActual() + leer.nextInt());
		System.out.println("Su nuevo saldo es: $" + cta.getSaldoActual());

	}

	public void retirar(Cuenta cta) {

		System.out.println("Su saldo es: $" + cta.getSaldoActual());
		System.out.println(" ");
		System.out.println("Cantidad de dinero a retirar: ");
		int retirar = leer.nextInt();
		System.out.println(" ");
		while (retirar > cta.getSaldoActual()) {
			System.out.println("Debe ingresar un monto igual o menor a su saldo o digite 0 para volver al menu");
			System.out.println(" ");
			System.out.println("Su saldo es: $" + cta.getSaldoActual());
			System.out.println(" ");
			retirar = leer.nextInt();
			if (retirar == 0) {
				break;
			}
		}
		cta.setSaldoActual(cta.getSaldoActual() - retirar);

		if (retirar != 0) {
			System.out.println("Retiro exitoso!");
			System.out.println("Su nuevo saldo es: $" + cta.getSaldoActual());
		}

	}

	public void extraccionRapida(Cuenta cta) {

		System.out.println("Saldo actual: $" + cta.getSaldoActual());
		double maximo = cta.getSaldoActual() * 0.20;
		System.out.println("Monto máximo a extraer (20%): $" + (int) maximo);
		System.out.println(" ");
		System.out.println("Ingrese monto a extraer: ");
		int retirar = leer.nextInt();
		while (retirar > maximo) {
			System.out.println("Debe ingresar un monto igual o menor a su monto maximo o digite 0 para volver al menu");
			System.out.println(" ");
			System.out.println("Su saldo es: $" + cta.getSaldoActual());
			System.out.println(" ");
			System.out.println("Monto máximo a extraer (20%): $" + (int) maximo);
			System.out.println(" ");
			retirar = leer.nextInt();
			if (retirar == 0) {
				break;
			}
		}
		cta.setSaldoActual(cta.getSaldoActual() - retirar);

		if (retirar != 0) {
			System.out.println("Retiro exitoso!");
			System.out.println("Su nuevo saldo es: $" + cta.getSaldoActual());
		}

	}

	public void consultarSaldo(Cuenta cta) {
		System.out.println("Su saldo es: $" + cta.getSaldoActual());
	}

	public void consultarDatos(Cuenta cta) {
		System.out.println("Titular: " + cta.getNombre() + " " + cta.getApellido() + ". DNI: " + cta.getDni());
		System.out.println("Numero de cuenta: " + cta.getNumeroCuenta());
		System.out.println("Interes de cuenta: " + cta.getInteres() + "% ");
	}

}
