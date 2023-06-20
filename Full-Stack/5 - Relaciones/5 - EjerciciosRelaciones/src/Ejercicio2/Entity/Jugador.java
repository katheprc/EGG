package Ejercicio2.Entity;

public class Jugador {

	int id;
	String nombre;
	boolean mojado = false;
	
	public int getId() {
		return id;
	}
	
	public void setJugadorEId(int id) {
		this.id = id;
		this.nombre = "Jugador " + id;
	}
	
	public void setMojado(boolean mojado) {
		this.mojado = mojado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean disparo(RevolverDeAgua revolver) {
		
		if (revolver.mojar()) {
			
			mojado = true;
			return true;
			
		}
		
		revolver.siguienteChorro();
		
		return false;
	}
	
	
}
