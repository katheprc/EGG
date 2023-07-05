package Ejercicio2.Entity;

public class EdificioDeOficinas extends Edificio{

	private int numOficinas, cantPersonas, numPisos;
	
	

	public EdificioDeOficinas() {

	}

	public EdificioDeOficinas(double alto, double ancho, double largo, int numOficinas, int cantPersonas,
			int numPisos) {
		super(alto, ancho, largo);
		this.numOficinas = numOficinas;
		this.cantPersonas = cantPersonas;
		this.numPisos = numPisos;
	}

	public int getNumOficinas() {
		return numOficinas;
	}

	public void setNumOficinas(int numOficinas) {
		this.numOficinas = numOficinas;
	}

	public int getCantPersonas() {
		return cantPersonas;
	}

	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}

	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	public int cantPersonas() {
		
		return cantPersonas*numOficinas*numPisos;
		
	}
	
	public void toStringg() {
		System.out.println("\nEdificio: Oficinas");
		System.out.println("Numero de oficinas: " + numOficinas);
		System.out.println("Cantidad de personas por oficina: " + cantPersonas);
		System.out.println("Cantidad de pisos: " + numPisos);
		System.out.println("Cantidd de personas en total: " + cantPersonas());
		System.out.println("Alto: " + getAlto());
		System.out.println("Ancho: " + getAncho());
		System.out.println("Largo: " + getLargo());
		System.out.println("Superficie: " + calcularSuperficie());
		System.out.println("Volumen: " + calcularVolumen());
	}
		
	@Override
	public double calcularSuperficie() {
		
		return getAncho()*getLargo();
		
	}

	@Override
	public double calcularVolumen() {
		
		return calcularSuperficie()*getAlto();
		
	}
		
}
