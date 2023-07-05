package Ejercicio2.Entity;

public class Polideportivo extends Edificio{
	
	private String nombre;
	private boolean tipo;
	
	public Polideportivo() {
		
	}
	
	public Polideportivo(double alto, double ancho, double largo, String nombre, boolean tipo) {
		super(alto, ancho, largo);
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	
	public void toStringg() {
		System.out.println("\nEdificio: Polideportivo");
		System.out.println("Nombre: " + getNombre());
		if (tipo) {
			System.out.println("Techado: Si");
		} else {
			System.out.println("Techado: No, abierto.");
		}
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
