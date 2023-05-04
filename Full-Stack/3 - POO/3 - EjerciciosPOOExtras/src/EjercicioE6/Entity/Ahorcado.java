package EjercicioE6.Entity;

public class Ahorcado {
		
	int cantEncontradas = 0, cantJugadas = 0, cantMax;
	
	String[] ahorcado = new String[50];
	
	public Ahorcado() {
	}

	public Ahorcado(int cantEncontradas, int cantJugadas, int cantMax, String[] ahorcado) {
		this.cantEncontradas = cantEncontradas;
		this.cantJugadas = cantJugadas;
		this.cantMax = cantMax;
		this.ahorcado = ahorcado;
	}

	public int getCantEncontradas() {
		return cantEncontradas;
	}

	public void setCantEncontradas(int cantEncontradas) {
		this.cantEncontradas = cantEncontradas;
	}

	public int getCantJugadas() {
		return cantJugadas;
	}

	public void setCantJugadas(int cantJugadas) {
		this.cantJugadas = cantJugadas;
	}

	public int getCantMax() {
		return cantMax;
	}
	
	public int setCantMax(int cantMax) {
		return this.cantMax = cantMax;
	}

	public String getAhorcado(int aux) {
		return ahorcado[aux];
	}

	public void setAhorcado(String ahorcado, int aux) {
		this.ahorcado[aux] = ahorcado;
	}
	
}


