package Ejercicio1.Entity;

import java.util.Comparator;
import java.util.Date;

import Ejercicio4.Entity.Pelicula;

public class Alumnos {

	private String nombre, apellido, nacionalidad;
	int ano = -1, mes = -1, dia = -1;
	   

	Date fecha = new Date(ano, mes, dia);
	Date fechaActual = new Date();
	
	public Alumnos() {
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
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	@SuppressWarnings("deprecation")
	public void setFecha(int dia, int mes, int ano) {
		fecha.setDate(dia);
		fecha.setMonth(mes);
		fecha.setYear(ano);
	}

	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", ano="
				+ ano + ", mes=" + mes + ", dia=" + dia + "]";
	}
	
	public static Comparator<Alumnos> ordenarApellidoAsc = new Comparator<Alumnos>(){
        @Override
        public int compare(Alumnos t, Alumnos t1) {
            return t.getApellido().compareTo(t1.getApellido());
        }            
    }; 
    
    public static Comparator<Alumnos> ordenarApellidoDesc = new Comparator<Alumnos>(){
        @Override
        public int compare(Alumnos t, Alumnos t1) {
            return t1.getApellido().compareTo(t.getApellido());
        }            
    }; 
	
	
}
