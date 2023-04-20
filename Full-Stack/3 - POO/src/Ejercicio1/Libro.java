package Ejercicio1;

/**
 *
 * @author cristinaalbarenga
 */
public class Libro {
    
    public String ISBN;
    public String titulo;
    public String autor;
    public int numeroDePagina;

    public Libro() {
    }
    
    public Libro(String ISBN, String titulo, String autor, int numeroDePagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePagina = numeroDePagina;
       
        
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePagina() {
        return numeroDePagina;
        
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePagina=" + numeroDePagina + '}';
    }

   

    }