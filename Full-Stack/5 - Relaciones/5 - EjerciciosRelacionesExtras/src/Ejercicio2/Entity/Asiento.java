package Ejercicio2.Entity;

public class Asiento {
	
	int fila;
	String columna;
	boolean ocupado = false;
	String ocupado2;
	
	public Asiento(int fila, int columna) {
		
		this.fila = fila;
		
		booleanToString();
		
		switch(columna) {
			case 1: 
				this.columna = "A";
				break;
			case 2: 
				this.columna = "B";
				break;
			case 3:
				this.columna = "C";
				break;
			case 4:
				this.columna = "D";
				break;
			case 5:
				this.columna = "E";
				break;
			case 6:
				this.columna = "F";
				break;
			
		}

	}
	
	public boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
		booleanToString();
	}

	public void booleanToString() {
		if (ocupado){
			ocupado2 = " X ";
		} else {
			ocupado2 = "   ";
		}
	}

	@Override
	public String toString() {
		return (fila + columna + ocupado2);
	}

}
