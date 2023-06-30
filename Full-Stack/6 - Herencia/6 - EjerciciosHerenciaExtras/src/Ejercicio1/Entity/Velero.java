package Ejercicio1.Entity;

public class Velero extends Barco{

	private int numMastiles;

	public Velero(String matricula, int eslora, int anoFabricacion, int numMastiles) {
		super(matricula, eslora, anoFabricacion);
		this.numMastiles = numMastiles;
	}

	public int getNumMastiles() {
		return numMastiles;
	}

	public void setNumMastiles(int numMastiles) {
		this.numMastiles = numMastiles;
	}
		
}
