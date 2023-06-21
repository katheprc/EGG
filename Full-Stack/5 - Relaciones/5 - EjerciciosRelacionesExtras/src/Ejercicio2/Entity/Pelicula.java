package Ejercicio2.Entity;

public class Pelicula {
	
	String titulo, director, duración;
	int edadmin;
	
	public Pelicula() {
		super();
	}
	
	public Pelicula(String titulo, String director, String duración, int edadmin) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.duración = duración;
		this.edadmin = edadmin;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDuración() {
		return duración;
	}

	public void setDuración(String duración) {
		this.duración = duración + " MINUTOS";
	}

	public int getEdadmin() {
		return edadmin;
	}

	public void setEdadmin(int edadmin) {
		this.edadmin = edadmin;
	}
	
	
}
