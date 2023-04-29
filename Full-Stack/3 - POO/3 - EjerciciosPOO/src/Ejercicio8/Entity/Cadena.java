package Ejercicio8.Entity;

public class Cadena {
	String frase, invertida;
	int longitud, vocales;
	

	public Cadena() {
	}

	public Cadena(String frase, int vocales, int longitud, String invertida) {
		this.frase = frase;
		this.longitud = longitud;
		this.vocales = vocales;
		this.invertida = invertida;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getVocales() {
		return vocales;
	}

	public void setVocales(int vocales) {
		this.vocales = vocales;
	}

	public String getInvertida() {
		return invertida;
	}

	public void setInvertida(String invertida) {
		this.invertida = invertida;
	}
	
}
