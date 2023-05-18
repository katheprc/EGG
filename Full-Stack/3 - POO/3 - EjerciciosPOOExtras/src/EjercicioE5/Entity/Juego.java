package EjercicioE5.Entity;

public class Juego {
	
	String[] mes = new String[12];
		
	String MesSecreto;

	public String[] getMes() {
		return mes;
	}

	public void setMes(String mes, int aux) {
		this.mes[aux] = mes;
	}

	public String getMesSecreto() {
		return MesSecreto;
	}

	public void setMesSecreto(int aux) {
		MesSecreto = this.mes[aux];
	}
	
}
