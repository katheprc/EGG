package modelEntities;

import javax.persistence.*;

@Entity
public class Libro {
	@Id
	private long isbn = 0;
	private String titulo;
	private int ano, ejemplares, ejemplaresPrestados, ejemplaresRestantes;
	private boolean alta;
	
	//claves foraneas
	private Autor autor;
	private Editorial editorial;
	
	
	
	public Libro() {
	}
	
	public Libro(long isbn, String titulo, int ano, int ejemplares, int ejemplaresPrestados, int ejemplaresRestantes,
			boolean alta, Autor autor, Editorial editorial) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.ano = ano;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
		this.ejemplaresRestantes = ejemplaresRestantes;
		this.alta = alta;
		this.autor = autor;
		this.editorial = editorial;
	}
	
	public Libro(String titulo, int ano, int ejemplares, int ejemplaresPrestados, int ejemplaresRestantes, boolean alta,
			Autor autor, Editorial editorial) {
		this.titulo = titulo;
		this.ano = ano;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
		this.ejemplaresRestantes = ejemplaresRestantes;
		this.alta = alta;
		this.autor = autor;
		this.editorial = editorial;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public int getEjemplaresRestantes() {
		return ejemplaresRestantes;
	}

	public void setEjemplaresRestantes(int ejemplaresRestantes) {
		this.ejemplaresRestantes = ejemplaresRestantes;
	}

	public boolean isAlta() {
		return alta;
	}

	public void setAlta(boolean alta) {
		this.alta = alta;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", ano=" + ano + ", ejemplares=" + ejemplares
				+ ", ejemplaresPrestados=" + ejemplaresPrestados + ", ejemplaresRestantes=" + ejemplaresRestantes
				+ ", alta=" + alta + ", autor=" + autor + ", editorial=" + editorial + "]";
	}
	
	
	
}
