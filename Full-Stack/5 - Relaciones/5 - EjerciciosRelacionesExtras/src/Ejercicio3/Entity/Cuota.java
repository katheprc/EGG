/*Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).*/

package Ejercicio3.Entity;

import java.util.*;

public class Cuota {
	
	private String formaPago;
	private Date vencimiento;
	private int cantCuotas, numCuota, montoCuota, totalAsegurado, montoMaximoGranizo;
	private boolean pagada;
	private int cuotasPagadas;
	
	public Cuota() {
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public Date getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}

	public int getCantCuotas() {
		return cantCuotas;
	}

	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}

	public int getNumCuota() {
		return numCuota;
	}

	public void setNumCuota(int numCuota) {
		this.numCuota = numCuota;
	}

	public int getMontoCuota() {
		return montoCuota;
	}

	public void setMontoCuota(int montoCuota) {
		this.montoCuota = montoCuota;
	}

	public int getTotalAsegurado() {
		return totalAsegurado;
	}

	public void setTotalAsegurado(int totalAsegurado) {
		this.totalAsegurado = totalAsegurado;
	}

	public int getMontoMaximoGranizo() {
		return montoMaximoGranizo;
	}

	public void setMontoMaximoGranizo(int montoMaximoGranizo) {
		this.montoMaximoGranizo = montoMaximoGranizo;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}
		
	public int getCuotasPagadas() {
		return cuotasPagadas;
	}

	public void setCuotasPagadas() {
		this.cuotasPagadas++;
	}

	@Override
	public String toString() {
		return "Cuota [formaPago=" + formaPago + ", vencimiento=" + vencimiento + ", cantCuotas=" + cantCuotas + ", numCuota=" + numCuota + ", montoCuota=" + montoCuota + ", totalAsegurado=" + totalAsegurado + ", montoMaximoGranizo=" + montoMaximoGranizo + ", pagada=" + pagada + "]";
	}
	
}
