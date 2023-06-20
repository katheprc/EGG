package Ejercicio1.Entity;

public class Persona {

	String nombre, apellido, documento;
	int edad;
	Perro perro;
		
	public Persona() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Perro getPerro() {
		return perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}

	@Override
	public String toString() {
		return ( "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad + "] Perro [nombre=" + perro.getNombre() + ", edad=" + perro.getEdad() + " raza=" + perro.getRaza() + " tamaño=" + perro.getTamano() + "]");
	}
	
	
		
}
