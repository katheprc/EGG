package Ejercicio1.Entity;

public class A_Motor extends Barco{

	private int potenciaEnCV;
	
	public A_Motor(String matricula, String eslora, int anoFabricacion, int potenciaEnCV) {
		super(matricula, eslora, anoFabricacion);
		this.potenciaEnCV = potenciaEnCV;
	}

	public int getPotenciaEnCV() {
		return potenciaEnCV;
	}

	public void setPotenciaEnCV(int potenciaEnCV) {
		this.potenciaEnCV = potenciaEnCV;
	}
		
}
