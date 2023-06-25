/*Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.*/

package Ejercicio3.Entity;

import java.util.*;

public class Poliza {
	
	private Vehiculo vehiculo;
	private Cliente cliente;
	private Cuota cuota;
	private Date fechaInicio, fechaFin;
	private String tipoCobertura;
	private int numPoliza;
	private boolean incluyeGranizo;
	
	public Poliza() {
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cuota getCuota() {
		return cuota;
	}
	
	public void setCuota(Cuota cuota) {
		this.cuota = cuota;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}
	
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public String getTipoCobertura() {
		return tipoCobertura;
	}
	
	public void setTipoCobertura(String tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}
	
	public int getNumPoliza() {
		return numPoliza;
	}
	
	public void setNumPoliza(int numPoliza) {
		this.numPoliza = numPoliza;
	}
	
	public boolean isIncluyeGranizo() {
		return incluyeGranizo;
	}
	
	public void setIncluyeGranizo(boolean incluyeGranizo) {
		this.incluyeGranizo = incluyeGranizo;
	}
	
	@Override
	public String toString() {
		return "Poliza [vehiculo=" + vehiculo + ", cliente=" + cliente + ", cuota=" + cuota + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", tipoCobertura=" + tipoCobertura + ", numPoliza=" + numPoliza + ", incluyeGranizo=" + incluyeGranizo + "]";
	}
}
