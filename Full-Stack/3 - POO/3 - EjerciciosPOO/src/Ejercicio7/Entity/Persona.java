package Ejercicio7.Entity;

public class Persona {
	String nombre;
	String sexo;
	int edad, resultadoImc;
	double peso, altura, imc;
	boolean esMayor;
	
	public Persona() {
	}

	public Persona(String nombre, int resultadoImc, boolean esMayor, String sexo, int edad, double peso, double altura, double imc) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
		this.esMayor = esMayor;
		this.resultadoImc = resultadoImc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public boolean getEsMayor() {
		return esMayor;
	}

	public void setEsMayor(boolean esMayor) {
		this.esMayor = esMayor;
	}

	public int getResultadoImc() {
		return resultadoImc;
	}

	public void setResultadoImc(int resultadoImc) {
		this.resultadoImc = resultadoImc;
	}
	
	

	
	
}
