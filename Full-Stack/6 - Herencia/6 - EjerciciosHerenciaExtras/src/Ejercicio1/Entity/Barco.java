package Ejercicio1.Entity;

public class Barco {
	
	private String matricula, eslora;
	private int anoFabricacion;
		
	public Barco(String matricula, String eslora, int anoFabricacion) {
		this.matricula = matricula;
		this.eslora = eslora;
		this.anoFabricacion = anoFabricacion;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getEslora() {
		return eslora;
	}
	
	public void setEslora(String eslora) {
		this.eslora = eslora;
	}
	
	public int getAnoFabricacion() {
		return anoFabricacion;
	}
	
	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}
		
}
