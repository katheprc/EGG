package Ejercicio3.Entity;

public class Carta {

	int numero;
	String palo;
	
	public Carta() {
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return numero + palo + "  ";
	}
	
}
