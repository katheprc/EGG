package Ejercicio8.Entity;

public class Cadena {
	String frase, invertida, car, reemplazado;

	int longitud, vocales, encontrado;
	

	public Cadena() {
	}

	public Cadena(String frase, String car, String reemplazado, int encontrado, int vocales, int longitud, String invertida) {
		this.frase = frase;
		this.longitud = longitud;
		this.vocales = vocales;
		this.invertida = invertida;
		this.encontrado = encontrado;
		this.car = car;
		this.reemplazado = reemplazado;
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

	public int getEncontrado() {
		return encontrado;
	}

	public void setEncontrado(int encontrado) {
		this.encontrado = encontrado;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getReemplazado() {
		return reemplazado;
	}

	public void setReemplazado(String reemplazado) {
		this.reemplazado = reemplazado;
	}
	
	
	
	
}
