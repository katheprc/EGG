package Ejercicio2.Entity;

public class Ficha {
	
	int ladoA, ladoB;
	
	public Ficha() {
	}

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}
	
	public void AlReves() {
		int aux = this.ladoA;
		this.ladoA = this.ladoB;
		this.ladoB = aux;
	}

	@Override
	public String toString() {
		return ladoA + "|" + ladoB + " ";
	}

	public String toStringAlReves() {
		return ladoB + "|" + ladoA + " ";
	}
	
}
