package Ejercicio6.Service;

import Ejercicio6.Entity.*;
import java.util.*;

public class ServiceTienda {

	Scanner leer = new Scanner(System.in);
	HashMap<Integer, Producto> lista = new HashMap<>();

	public void menu() {
		
		int opc;
		
		do {
			
			System.out.println("- - - - - M - E - N - Ú - - - - -");
			System.out.println("");
			System.out.println("1 - Ingresar producto");
			System.out.println("2 - Modificar un precio");
			System.out.println("3 - Eliminar un producto");
			System.out.println("4 - Mostrar un producto");
			System.out.println("5 - Mostrar todos los productos");
			System.out.println("0 - Salir");
			System.out.println("");System.out.println("");System.out.println("");
			System.out.println("Ingresar número de opción: ");
			
			opc = leer.nextInt();
			
			switch (opc) {
			
				case 1: rellenarLista(); break;
				case 2:	modificarPrecio(); break;
				case 3: eliminarProducto(); break;
				case 4: mostrarProducto(); break;
				case 5: mostrarTodo(); break;
				case 0: break;
				default: System.out.println("Ingrese opción nuevamente"); break;
				
			}
			
		} while (opc != 0);
		
	}

	public void rellenarLista() {

		String opc;

		do {
			Producto producto = new Producto();

			producto = crearProducto(producto);

			lista.put(producto.getCodigo(), producto);
			do {

				System.out.println("¿Continuar ingresando? (S/N)");
				opc = leer.nextLine().toUpperCase();

				if (opc.equals("N") || opc.equals("S")) {
					break;
				}

			} while (true);

		} while (opc.equals("S"));

	}

	public Producto crearProducto(Producto producto) {

		System.out.println("");
		System.out.println("");

		System.out.println("Ingrese el código del producto: ");

		producto.setCodigo(leer.nextInt());

		leer.nextLine();

		System.out.println("");
		System.out.println("");

		System.out.println("Ingrese el nombre del producto: ");

		producto.setNombre(leer.nextLine());

		System.out.println("");
		System.out.println("");

		System.out.println("Ingrese el precio del producto: ");

		producto.setPrecio(leer.nextDouble());

		leer.nextLine();

		return producto;

	}

	public void modificarPrecio() {
		
		System.out.println("Ingrese código del producto a modificar precio: ");
		int codigo = leer.nextInt();
		
		for (Producto producto : lista.values()) {
			if (codigo == producto.getCodigo()) {
				System.out.println("Ingrese nuevo precio: ");
				producto.setPrecio(leer.nextDouble());
				break;
			}
			
		}
		
		System.out.println("Producto modificado!");
		
	}
	
	public void eliminarProducto() {
		
		System.out.println("Ingrese código del producto a eliminar: ");
		int codigo = leer.nextInt();
		
		lista.remove(codigo);
		
		System.out.println("Producto eliminado!");
		
	}
	
	public void mostrarProducto() {
		
		System.out.println("Ingrese código del producto a mostrar: ");
		int codigo = leer.nextInt();
		
		for (Producto producto : lista.values()) {
			if (codigo == producto.getCodigo()) {
				System.out.println(producto.toString());
				break;
			}
			
		}
		
	}
	
	public void mostrarTodo() {
		
		for (Producto producto : lista.values()) {
			
			System.out.println(producto.toString());			
		}
		
	}

}
