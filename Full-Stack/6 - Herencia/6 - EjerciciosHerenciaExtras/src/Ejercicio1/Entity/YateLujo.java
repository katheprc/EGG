package Ejercicio1.Entity;

public class YateLujo extends Barco {
	
	private int potenciaEnCV, numCamarotes;

	public YateLujo(String matricula, int eslora, int anoFabricacion, int potenciaEnCV, int numCamarotes) {
		super(matricula, eslora, anoFabricacion);
		this.potenciaEnCV = potenciaEnCV;
		this.numCamarotes = numCamarotes;
	}

	public int getPotenciaEnCV() {
		return potenciaEnCV;
	}

	public void setPotenciaEnCV(int potenciaEnCV) {
		this.potenciaEnCV = potenciaEnCV;
	}

	public int getNumCamarotes() {
		return numCamarotes;
	}

	public void setNumCamarotes(int numCamarotes) {
		this.numCamarotes = numCamarotes;
	}
		
}
