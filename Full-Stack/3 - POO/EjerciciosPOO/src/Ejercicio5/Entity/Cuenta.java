package Ejercicio5.Entity;

public class Cuenta {
	int numeroCuenta, saldoActual, interes;
	long dni;
	String nombre;
	String apellido;

	// Constructor sin parametros
	public Cuenta() {
	}

	// Constructor con parametros
	public Cuenta(String nombre, String apellido, int numeroCuenta, int saldoActual, long dni, int interes) {
		this.numeroCuenta = numeroCuenta;
		this.saldoActual = saldoActual;
		this.dni = dni;
		this.interes = interes;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Getters y Setters
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(int saldoActual) {
		this.saldoActual = saldoActual;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public int getInteres() {
		return interes;
	}

	public void setInteres(int interes) {
		this.interes = interes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
