package Ejercicio2.Entity;

public class RevolverDeAgua {

	int posActual, posAgua;
	
	public int getPosActual() {
		return posActual;
	}
	
	public void llenarRevolver() {
		
		this.posActual = (int) (Math.random()*6)+1;
		this.posAgua = (int) (Math.random()*6)+1;
		
	}
	
	public boolean mojar() {
		
		if (posActual == posAgua) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void siguienteChorro() {
		
		posActual++;
		if (posActual > 6) {
			posActual = 1;
		}
		
	}

	@Override
	public String toString() {
		return "RevolverDeAgua [posActual=" + posActual + ", posAgua=" + posAgua + "]";
	}
	
}
