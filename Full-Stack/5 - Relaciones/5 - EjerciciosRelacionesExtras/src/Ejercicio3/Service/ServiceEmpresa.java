package Ejercicio3.Service;

import Ejercicio3.Entity.*;
import java.util.*;

public class ServiceEmpresa {

	private ArrayList<Poliza> listaPoliza = new ArrayList<Poliza>();

	ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	private Scanner leer = new Scanner(System.in);

	private int total = 100, terceros = 50, granizo = 10;

	public void menu() {

		do {

			System.out.println("");
			System.out.println("- - - M - E - N - Ú - - -");
			System.out.println("1 - Ver precios");
			System.out.println("2 - Alta póliza");
			System.out.println("3 - Ver/modificar póliza");
			System.out.println("4 - Baja póliza");
			System.out.println("5 - Ver vehículo");
			System.out.println("6 - Ver cliente");
			System.out.println("7 - Pagos");
			System.out.println("0 - Salir");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("Ingrese su opción");
			int opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:
				System.out.println("");
				System.out.println("- - - - - - - - - - - - -");
				System.out.println("NINGUNA COBERTURA CUBRE CONTRA GRANIZO");
				System.out.println("");
				System.out.println("Cobertura total: " + total);
				System.out.println("Cobertura contra terceros: " + terceros);
				System.out.println("");
				System.out.println("");
				System.out.println("Adicional contra granizo: " + granizo);
				System.out.println("- - - - - - - - - - - - -");
				System.out.println("");
				break;
			case 2:
				alta();
				break;
			}

		} while (true);

	}

	public void alta() {

		int opc;

		Poliza poliza = new Poliza();

		do {

			System.out.println("");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("Ingrese opción de tipo de cobertura: ");
			System.out.println("1 - Total");
			System.out.println("2 - Contra terceros");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");

			opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:
				poliza.setTipoCobertura("TOTAL");
				break;
			case 2:
				poliza.setTipoCobertura("CONTRA TERCEROS");
				break;
			default:
				System.out.println("Ingrese una opción correcta");
				break;
			}

		} while (opc < 1 || opc > 2);

		do {

			System.out.println("");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("¿Incluye granizo? (adicional de $10 sobre el total): ");
			System.out.println("1 - Si");
			System.out.println("2 - No");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");

			opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:
				poliza.setIncluyeGranizo(true);
				break;
			case 2:
				poliza.setIncluyeGranizo(false);
				break;
			default:
				System.out.println("Ingrese una opción correcta");
				break;
			}

		} while (opc < 1 || opc > 2);

		poliza.setCuota(crearCuota(poliza));
	}

	public Cuota crearCuota(Poliza poliza) {

		Cuota cuota = new Cuota();
		int opc;
		
		do {

			System.out.println("");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("Introduzca opción de forma de pago: ");
			System.out.println("1 - Efectivo ");
			System.out.println("2 - Medio digital (Tarjetas, QR, etc)");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:
				cuota.setFormaPago("EFECTIVO");		
				break;
			case 2:
				cuota.setFormaPago("DIGITAL");
				break;
			default:
				System.out.println("Ingrese una opción correcta");
				break;
			}

		} while (opc < 1 || opc > 2);
		
		do {

			System.out.println("");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("Introduzca cantidad de cuotas: ");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			opc = leer.nextInt();
			leer.nextLine();
			
			cuota.setCantCuotas(opc);
			
		} while (opc < 1 || opc > 2);
		
		if (poliza.isIncluyeGranizo()) {
			if (poliza.getTipoCobertura().equalsIgnoreCase("TOTAL")) {
				cuota.setTotalAsegurado(total+granizo);
			} else {
				cuota.setTotalAsegurado(terceros+granizo);
			}
		} else {
			if (poliza.getTipoCobertura().equalsIgnoreCase("TOTAL")) {
				cuota.setTotalAsegurado(total);
			} else {
				cuota.setTotalAsegurado(terceros);
			}
		}
		
		cuota.setMontoMaximoGranizo(1000);
		
		cuota.setVencimiento
		
		return cuota;

	}

}
