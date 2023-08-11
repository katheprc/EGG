package Entity;

import javax.persistence.*;

@Entity
public class Autor {

	@Id
	int id;
	String nombre;
	boolean alta;
	
	public Autor() {
	}

	public Autor(int id, String nombre, boolean alta) {
		this.id = id;
		this.nombre = nombre;
		this.alta = alta;
	}

	public Autor(String nombre, boolean alta) {
		this.nombre = nombre;
		this.alta = alta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isAlta() {
		return alta;
	}

	public void setAlta(boolean alta) {
		this.alta = alta;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", alta=" + alta + "]";
	}
	
}
