package Ejercicio14.Entity;

public class Movil {
	String marca, modelo, memRam, almacenamiento;
	String[] codigo = new String[7];
	int precio;
	
	public Movil() {
	}

	public Movil(String marca, String modelo, String memRam, String almacenamiento, String[] codigo, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.memRam = memRam;
		this.almacenamiento = almacenamiento;
		this.codigo = codigo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMemRam() {
		return memRam;
	}

	public void setMemRam(String memRam) {
		this.memRam = memRam;
	}

	public String getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String[] getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo, int aux) {
		this.codigo[aux] = codigo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	
}
