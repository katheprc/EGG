package Ejercicio1.Service;

import Ejercicio1.Entity.*;

import java.util.*;

public class ServiceAlumnos {

	ArrayList<Alumnos> lista = new ArrayList<Alumnos>();
	ArrayList<Alumnos> listaArg = new ArrayList<Alumnos>();
	ArrayList<Alumnos> listaVen = new ArrayList<Alumnos>();
	ArrayList<Alumnos> listaChi = new ArrayList<Alumnos>();
	
	Scanner leer = new Scanner(System.in);

	public void menu() {

		int opc;
		
		do {
		
		System.out.println("- - - M - E - N - U - - -");
		System.out.println("1 - Alta");
		System.out.println("2 - Baja");
		System.out.println("3 - Modificación");
		System.out.println("0 - Salir");
		
		System.out.println("Ingrese opción");
		opc = leer.nextInt();
		
		leer.nextLine();
		
		switch (opc) {
			case 1: crearLista(); break;
			case 2: b(); break;
			case 3: m(); break;
			case 0: break;
			default: System.out.println("Ingrese nuevamente opción");
		}
		
		} while (opc != 0); 
		
		LOP();
		may25();
		cantidadNac();
				
	}

	public void crearLista() {

		String opc;

		do {
			
			lista.add(a());
			listasNac();
			do {

				System.out.println("¿Continuar ingresando? (S/N)");
				opc = leer.nextLine().toUpperCase();

				if (opc.equals("N") || opc.equals("S")) {
					break;
				}

			} while (true);

		} while (opc.equals("S"));

	}

	public Alumnos a() {

		Alumnos alumno = new Alumnos();
		String nacionalidad;
		boolean nac = false;
		int dia, mes, ano;
		System.out.println("Ingrese nombre del alumno: ");
		alumno.setNombre(leer.nextLine());

		System.out.println("Ingrese apellido del alumno: ");
		alumno.setApellido(leer.nextLine());

		do {
			
			System.out.println("Ingrese nacionalidad del alumno: ");nacionalidad = leer.nextLine().toUpperCase();
			if (nacionalidad.equals("ARGENTINA") || nacionalidad.equals("CHILENA")|| nacionalidad.equals("VENEZOLANA")) {
				alumno.setNacionalidad(nacionalidad);
				nac = true;
			} 
			
		} while (nac == false);
		
		System.out.println("Ingrese dia de nacimiento: ");
		dia = leer.nextInt();

		System.out.println("Ingrese mes de nacimiento: ");
		mes = leer.nextInt();
		
		System.out.println("Ingrese año de nacimiento: ");
		ano = leer.nextInt();
		
		leer.nextLine();
		
		alumno.setFecha(dia, mes, (ano));
		
		return alumno;

	}
	
	public void b() {
		
		System.out.println("Ingrese nombre y apellido de la persona a eliminar (separado por enter)");
		String nombre = leer.nextLine();
		String apellido = leer.nextLine();
		
		for (Alumnos alumno : lista) {
			if (alumno.getNombre().equals(nombre) && alumno.getApellido().equals(apellido)) {
				lista.remove(alumno);
			}
			
		}
			
	}
	
	public void m() {
		
		System.out.println("Ingrese nombre y apellido de la persona a eliminar (separado por enter)");
		String nombre = leer.nextLine();
		String apellido = leer.nextLine();
		
		for (Alumnos alumno : lista) {
			if (alumno.getNombre().equals(nombre) && alumno.getApellido().equals(apellido)) {
				String nacionalidad;
				boolean nac = false;
				int dia, mes, ano;
				System.out.println("Ingrese nombre del alumno: ");
				alumno.setNombre(leer.nextLine());

				System.out.println("Ingrese apellido del alumno: ");
				alumno.setApellido(leer.nextLine());

				do {
					
					System.out.println("Ingrese nacionalidad del alumno: ");nacionalidad = leer.nextLine().toUpperCase();
					if (nacionalidad.equals("ARGENTINA") || nacionalidad.equals("CHILENA")|| nacionalidad.equals("VENEZOLANA")) {
						alumno.setNacionalidad(nacionalidad);
						nac = true;
					} 
					
				} while (nac == false);
				
				System.out.println("Ingrese dia de nacimiento: ");
				dia = leer.nextInt();

				System.out.println("Ingrese mes de nacimiento: ");
				mes = leer.nextInt();
				
				System.out.println("Ingrese año de nacimiento: ");
				ano = leer.nextInt();
				
				leer.nextLine();
				
				alumno.setFecha(dia, mes, (ano));
			
			}
			
		}
	}

	public void mostrarAlumno() {
		System.out.println("Ingrese nombre y apellido de la persona a eliminar (separado por enter)");
		String nombre = leer.nextLine();
		String apellido = leer.nextLine();
		
		for (Alumnos alumno : lista) {
			if (alumno.getNombre().equals(nombre) && alumno.getApellido().equals(apellido)) {
				System.out.println(alumno.toString());
			}
			
		}
	}
	
	public void mostrarEdad() {
		System.out.println("Ingrese nombre y apellido de la persona a eliminar (separado por enter)");
		String nombre = leer.nextLine();
		String apellido = leer.nextLine();
		Date fecha = new Date();
		
		for (Alumnos alumno : lista) {
			if (alumno.getNombre().equals(nombre) && alumno.getApellido().equals(apellido)) {
				
				if (fecha.getMonth() > alumno.getFecha().getYear()) {
					System.out.println("Edad:" + (fecha.getYear() - alumno.getFecha().getYear()));
				} else if (fecha.getMonth() == alumno.getFecha().getMonth() && fecha.getDate() >= alumno.getFecha().getDate())
					System.out.println("Edad:" + (fecha.getYear() - alumno.getFecha().getYear()));
				} else {
					System.out.println("Edad:" + ((fecha.getYear() - alumno.getFecha().getYear())-1));
				
			}
			
		}
	}

	public void mostrarTodo() {
		
		for (Alumnos alumno : lista) {
			System.out.println(alumno.toString());

		}
	
	}

	public void ordenarApellidoAsc() {
		
		Collections.sort(lista, Alumnos.ordenarApellidoAsc);
        System.out.println("Alumnos ordenados por apellido");
        
        for (Alumnos alumno : lista) {
            System.out.println(alumno.toString());
        }
        
        System.out.println("");
	}
	
	public void ordenarApellidoDesc() {
		
		Collections.sort(lista, Alumnos.ordenarApellidoDesc);
        System.out.println("Alumnos ordenados por apellido");
        
        for (Alumnos alumno : lista) {
            System.out.println(alumno.toString());
        }
        
        System.out.println("");
	}
	
	public void listasNac() {
		
		for (Alumnos alumno : lista) {
			if (alumno.getNacionalidad().equals("ARGENTINA")) {
				listaArg.add(alumno);
			} else if (alumno.getNacionalidad().equals("VENEZOLANA")){
				listaVen.add(alumno);
			} else {
				listaChi.add(alumno);
			}
		}
		
	}
	
	public int LOP() {
		
		int cant = 0;
			
			for (Alumnos alumno : lista) {
				if (alumno.getApellido().startsWith("L") || alumno.getApellido().startsWith("P")) {
					cant++;
				}
			}
		
		return cant;
	}
	
	public int may25() {
		
		Date fecha = new Date();
		int cant = 0;
		int edad = 0;	
		for(Alumnos alumno : lista) {
			if (fecha.getMonth() > alumno.getFecha().getYear()) {
				edad = (fecha.getYear() - alumno.getFecha().getYear());
			} else if (fecha.getMonth() == alumno.getFecha().getMonth() && fecha.getDate() >= alumno.getFecha().getDate()) {
				edad = (fecha.getYear() - alumno.getFecha().getYear());
			} else {
				edad =  ((fecha.getYear() - alumno.getFecha().getYear())-1);
			}
			if (edad >= 25) {
				cant++;
			}
		}
		
		
		return cant;
		
		
	}

	public void cantidadNac(){
		
		System.out.println("Cantidad de alumnos Argentinos: " + (listaArg.size()/2));
		System.out.println("Cantidad de alumnos Venezolanos: " + (listaVen.size()/2));
		System.out.println("Cantidad de alumnos Chilenos: " + (listaChi.size())/2);
		
	}
		
}

