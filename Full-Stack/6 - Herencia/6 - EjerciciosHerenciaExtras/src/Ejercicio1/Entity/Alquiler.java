package Ejercicio1.Entity;

import java.util.*;
import java.util.concurrent.*;

public class Alquiler {

	String nombre, dni;
	Date fechaAlq = new Date(), fechaDev;
	int posAmarre;
	Barco barco;
	int diasTotal;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Date getFechaAlq() {
		return fechaAlq;
	}
		
	public Date getFechaDev() {
		return fechaDev;
	}
	
	@SuppressWarnings("deprecation")
	public void setFechaDev(int ano, int mes, int dia) {
		this.fechaDev = new Date(ano-1900, mes-1, dia+1);
		this.fechaDev.setHours(fechaAlq.getHours());
		this.fechaDev.setMinutes(fechaAlq.getMinutes());
		this.fechaDev.setSeconds(fechaAlq.getSeconds());
		getDiferenciaDias(this.fechaDev, this.fechaAlq);
	}
	
	public int getPosAmarre() {
		return posAmarre;
	}
	
	public void setPosAmarre(int posAmarre) {
		this.posAmarre = posAmarre;
	}
	
	public Barco getBarco() {
		return barco;
	}
	
	public void setBarco(String tipo, String matricula, String eslora, int anoFabricacion, int numMastiles, int potenciaEnCV, int numCamarotes) {
		
		if (tipo.equalsIgnoreCase("velero")) {
			
			this.barco = new Velero(matricula, eslora, anoFabricacion, numMastiles);
		
		} else if (tipo.equalsIgnoreCase("yatelujo")){
			
			this.barco = new YateLujo(matricula, eslora, anoFabricacion, potenciaEnCV, numCamarotes);

		} else {
			
			this.barco = new A_Motor(matricula, eslora, anoFabricacion, potenciaEnCV);

		}
	}
		
	public int getDiasTotal() {
		return diasTotal;
	}

	public void setDiasTotal(int diasTotal) {
		this.diasTotal = diasTotal;
	}

	public void getDiferenciaDias(Date d1, Date d2) {
	    long dif = Math.abs(d1.getTime() - d2.getTime());
	    this.diasTotal = (int) TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
	}

	@Override
	public String toString() {
		return "Alquiler [nombre=" + nombre + ", dni=" + dni + ", fechaAlq=" + fechaAlq + ", fechaDev=" + fechaDev
				+ ", posAmarre=" + posAmarre + ", barco=" + barco + ", diasTotal=" + diasTotal + "]";
	}
	
}
